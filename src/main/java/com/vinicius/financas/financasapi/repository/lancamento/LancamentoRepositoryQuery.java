package com.vinicius.financas.financasapi.repository.lancamento;

import com.vinicius.financas.financasapi.model.Lancamento;
import com.vinicius.financas.financasapi.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
