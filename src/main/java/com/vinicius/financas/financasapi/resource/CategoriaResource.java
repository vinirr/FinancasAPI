package com.vinicius.financas.financasapi.resource;

import com.vinicius.financas.financasapi.event.RecursoCriadoEvent;
import com.vinicius.financas.financasapi.model.Categoria;
import com.vinicius.financas.financasapi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public ResponseEntity<?> listar() {
        List<Categoria> categorias = categoriaRepository.findAll();

        return !categorias.isEmpty() ? ResponseEntity.ok(categorias) : ResponseEntity.noContent().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response)
    {
        Categoria categoriaSalva = categoriaRepository.save(categoria);

        publisher.publishEvent(new RecursoCriadoEvent(this, response, categoriaSalva.getId()));

        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPeloId(@PathVariable Long id) {
        Categoria categoriaBuscada = categoriaRepository.findOne(id);
        return categoriaBuscada != null ? ResponseEntity.ok(categoriaBuscada) : ResponseEntity.notFound().build();
    }
}
