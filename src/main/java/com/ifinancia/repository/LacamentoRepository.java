package com.ifinancia.repository;

import org.springframework.data.repository.CrudRepository;

import com.ifinancia.models.Lancamento;

public interface LacamentoRepository extends CrudRepository<Lancamento, String> {

}
