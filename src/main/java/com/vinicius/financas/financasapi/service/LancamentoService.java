package com.vinicius.financas.financasapi.service;

import com.vinicius.financas.financasapi.model.Lancamento;
import com.vinicius.financas.financasapi.model.Pessoa;
import com.vinicius.financas.financasapi.repository.LancamentoRepository;
import com.vinicius.financas.financasapi.repository.PessoaRepository;
import com.vinicius.financas.financasapi.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getId());

        if(pessoa == null || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }
}
