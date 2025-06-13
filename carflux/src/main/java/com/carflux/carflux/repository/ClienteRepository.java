package com.carflux.carflux.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.carflux.carflux.model.Cliente;

public interface ClienteRepository extends Repository<Cliente, Integer> {
	List<Cliente> findByNome(String nome);
	List<Cliente> findByDocumento(String documento);
	List<Cliente> findByPerfil(String perfil);
}
