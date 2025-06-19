package com.carflux.carflux.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carflux.carflux.model.Endereco;

import java.util.Optional;


public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
	public Optional<Endereco> findByClienteCodigoCliente(Integer idCliente);

	
}
