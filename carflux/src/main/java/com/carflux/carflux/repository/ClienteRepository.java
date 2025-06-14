package com.carflux.carflux.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carflux.carflux.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	List<Cliente> findByNome(String nome);
	List<Cliente> findByDocumento(String documento);
	List<Cliente> findByPerfil(String perfil);
}
