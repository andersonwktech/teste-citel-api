package com.testecitel.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testecitel.api.model.Dados;

@Repository
public interface DadosRepository extends JpaRepository<Dados, Integer>{

}
