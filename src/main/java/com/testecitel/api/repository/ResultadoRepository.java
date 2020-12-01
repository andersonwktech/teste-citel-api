package com.testecitel.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testecitel.api.model.Resultado;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, Integer>{

}
