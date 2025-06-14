package com.carflux.carflux.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carflux.carflux.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
	
}
