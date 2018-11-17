package com.vinicius.financas.financasapi.repository;

import com.vinicius.financas.financasapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long > {

    public Optional<Usuario> findByEmail(String email);
}
