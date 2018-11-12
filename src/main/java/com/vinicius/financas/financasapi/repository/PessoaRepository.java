package com.vinicius.financas.financasapi.repository;

import com.vinicius.financas.financasapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
