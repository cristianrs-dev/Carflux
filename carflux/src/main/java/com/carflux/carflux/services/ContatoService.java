package com.carflux.carflux.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carflux.carflux.model.Contato;
import com.carflux.carflux.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository repository;
	
	public List<Contato> buscarContatos(){
		
		return repository.findAll();
		
	}
	
	public Contato buscarContatoPeloId(Integer id) {
		
		return repository.findById(id).orElse(null);
		
	}
	
	public Contato buscarContatoClientePeloIdCliente(Integer id) {
		
		return repository.findByClienteCodigoCliente(id).orElse(null);
		
	}
}
