package com.carflux.carflux.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carflux.carflux.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
	
	public Optional<Contato> findByClienteCodigoCliente(Integer idCliente);
	
}
