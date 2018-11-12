package com.vinicius.financas.financasapi.service;

import com.vinicius.financas.financasapi.model.Pessoa;
import com.vinicius.financas.financasapi.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long id, Pessoa pessoa) {
        Pessoa pessoaSalva = buscarPessoaPeloId(id);

        BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
        return pessoaRepository.save(pessoaSalva);
    }

    public void atualizarPropriedadeAtivo(Long id, Boolean ativo) {
        Pessoa pessoaSalva = buscarPessoaPeloId(id);
        pessoaSalva.setAtivo(ativo);
        pessoaRepository.save(pessoaSalva);
    }

    public Pessoa buscarPessoaPeloId(Long id) {
        Pessoa pessoaSalva = pessoaRepository.findOne(id);

        if(pessoaSalva == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return pessoaSalva;
    }
}
