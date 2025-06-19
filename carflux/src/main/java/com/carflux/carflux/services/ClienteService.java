package com.carflux.carflux.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carflux.carflux.model.Cliente;
import com.carflux.carflux.model.Contato;
import com.carflux.carflux.model.Endereco;
import com.carflux.carflux.repository.ClienteRepository;
import com.carflux.carflux.repository.ContatoRepository;
import com.carflux.carflux.repository.EnderecoRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private ContatoService contatoService;
	

	public void cadastrarCliente(Cliente cliente) {
		
		repository.save(cliente);
		
	}
	
	public Cliente buscarClientePeloCodigo(Integer id) {
		
		 return repository.findById(id).orElse(null);
		 
	}
	
	public List<Cliente> listarClientes(){
		
		return  repository.findAll();
		
	}
	
	
	public void atualizarRegistroDeCliente(Cliente cliente,Integer id) {
		
		
			Cliente clienteExistente = buscarClientePeloCodigo(id);
			Endereco enderecoExistente = enderecoService.buscarEnderecoPeloIdCliente(id);
			Contato contatoExistente = contatoService.buscarContatoClientePeloIdCliente(id);
			
			Contato novoContato = clienteExistente.getContato();
			Endereco novoEndereco = enderecoExistente;
			
			 cliente.getEndereco().setIdEndereco(enderecoExistente.getIdEndereco());
		     cliente.getContato().setIdContato(contatoExistente.getIdContato());
		        
		        novoEndereco.setRua(cliente.getEndereco().getRua());
				novoEndereco.setNumero(cliente.getEndereco().getNumero());
				novoEndereco.setBairro(cliente.getEndereco().getBairro());
				novoEndereco.setCidade(cliente.getEndereco().getCidade());
				novoEndereco.setEstado(cliente.getEndereco().getEstado());
				
				novoContato.setIdContato(cliente.getContato().getIdContato());
				novoContato.setTipo(cliente.getContato().getTipo());
				novoContato.setValor(cliente.getContato().getValor());
		        
		        
		        clienteExistente.setCodigoCliente(id);
		        clienteExistente.setContato(novoContato);
		        clienteExistente.setEndereco(novoEndereco);
		        clienteExistente.setDocumento(cliente.getDocumento());
		        clienteExistente.setNome(cliente.getNome());
		        clienteExistente.setPerfil(cliente.getPerfil());
			
	    
	        
		    repository.save(clienteExistente);
	    

	  
		
	}
	
	
}
