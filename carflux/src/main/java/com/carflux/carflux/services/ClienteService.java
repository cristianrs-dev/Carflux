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
	private EnderecoRepository enderecoRepository;
	private ContatoRepository contatoRepository;
	
	public void cadastrarCliente(Cliente cliente) {
		
		repository.save(cliente);
		
	}
	
	public Cliente buscarClientePeloCodigo(Integer id) {
		
		 return repository.findById(id).orElse(null);
		 
	}
	
	public List<Cliente> listarClientes(){
		
		return  repository.findAll();
		
	}
	
	//adicionar o id do endereço e o id contato para não duplicar
	public void atualizarRegistroDeCliente(Cliente cliente,Integer id) {
		Cliente clienteExistente = buscarClientePeloCodigo(id);
	    if (clienteExistente == null) {
	        System.out.println("CLIENTE INEXISTENTE");
	        return;
	    }

	    Optional<Endereco> enderecoOpt = enderecoRepository.findById(clienteExistente.getEndereco().getIdEndereco());
	    Optional<Contato> contatoOpt = contatoRepository.findById(clienteExistente.getContato().getIdContato());

	    if (enderecoOpt.isEmpty() || contatoOpt.isEmpty()) {
	        System.out.println("ENDEREÇO OU CONTATO INEXISTENTE");
	        return;
	    }

	    Endereco endereco = enderecoOpt.get();
	    Contato contato = contatoOpt.get();

	    // Verifica se o endereço e contato estão realmente associados ao cliente
	    boolean dadosConferem = clienteExistente.getEndereco().getIdEndereco().equals(endereco.getIdEndereco())
	                          && clienteExistente.getContato().getIdContato().equals(contato.getIdContato());

	    if (!dadosConferem) {
	        System.out.println("RELACIONAMENTOS INVÁLIDOS");
	        return;
	    }

	    // Atualiza os dados necessários do cliente existente
	    clienteExistente.setNome(cliente.getNome());
	    clienteExistente.setDocumento(cliente.getDocumento());
	    clienteExistente.setEndereco(cliente.getEndereco());
	    clienteExistente.setContato(cliente.getContato());

	    repository.save(clienteExistente);
		
		
	}
	
	
}
