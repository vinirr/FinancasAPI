package com.vinicius.financas.financasapi.repository;

import com.vinicius.financas.financasapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
