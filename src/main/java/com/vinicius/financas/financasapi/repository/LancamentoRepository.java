package com.vinicius.financas.financasapi.repository;

import com.vinicius.financas.financasapi.model.Lancamento;
import com.vinicius.financas.financasapi.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
