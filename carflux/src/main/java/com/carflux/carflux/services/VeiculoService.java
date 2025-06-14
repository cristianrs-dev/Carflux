package com.carflux.carflux.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carflux.carflux.model.Veiculo;
import com.carflux.carflux.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;
	
	public Veiculo cadastrarVeiculo(Veiculo veiculo) {
		return repository.save(veiculo);
	}
	
	public Veiculo  buscarVeiculoPeloCodigo(Integer codigoVeiculo) {
		
		return repository.findById(codigoVeiculo).orElse(null);

	}
	
	public List<Veiculo> listarVeiculos(){
		return repository.findAll();
	}
	
	public void atualizarDadosDoVeiculo(Veiculo veiculo) {
		repository.save(veiculo);
	}
	
	public void apagarRegistroDoVeiculo(Integer codigoVeiculo) {
		repository.deleteById(codigoVeiculo);
	}
	
	public List<Veiculo> listarVeiculoPelaMarca(String marca) {
		return repository.findByMarca(marca);
	}
	
	public List<Veiculo> listarVeiculoPeloAno(Integer ano) {
		return repository.findByAno(ano);
	}
	
	public List<Veiculo> listarVeiculoPeloPreco(Double preco) {
		return repository.findByPreco(preco);
	}
	
	public List<Veiculo> listarVeiculoPelaCor(String cor) {
		return repository.findByCor(cor);
	}
	
}
