package com.carflux.carflux.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carflux.carflux.model.Veiculo;
import com.carflux.carflux.services.VeiculoService;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	@Autowired
	VeiculoService service;
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findAllVeiculos(){
		List<Veiculo> list = service.listarVeiculos();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Veiculo> buscarPeloId(@PathVariable Integer id){
		 Veiculo veiculo = service.buscarVeiculoPeloCodigo(id);
		 return ResponseEntity.ok(veiculo);
	}
	
	@PostMapping
	public ResponseEntity<String> cadastrarVeiculo(@RequestBody Veiculo veiculo){
		service.cadastrarVeiculo(veiculo);
		return ResponseEntity.ok("Veículo cadastrado com sucesso");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> atualizarRegistroDoVeiculo(@PathVariable Integer id,@RequestBody Veiculo veiculo){
		Veiculo veiculoExistente = service.buscarVeiculoPeloCodigo(id);
		if(veiculoExistente == null) {
			return ResponseEntity.notFound().build();
		}
	
		veiculoExistente.setAno(veiculo.getAno());
		veiculoExistente.setMarca(veiculo.getMarca());
	    veiculoExistente.setModelo(veiculo.getModelo());
	    veiculoExistente.setCor(veiculo.getCor());
	    veiculoExistente.setKm(veiculo.getKm());
	    veiculoExistente.setCombustivel(veiculo.getCombustivel());
	    veiculoExistente.setCambio(veiculo.getCambio());
		veiculoExistente.setPreco(veiculo.getPreco());
		service.atualizarDadosDoVeiculo(veiculoExistente);
		return ResponseEntity.ok("veiculo atualizadoc com sucesso!");
		
	}
	
	@DeleteMapping("/{id}")
	public void deletarVeiculo(@PathVariable Integer id) {
		
		service.apagarRegistroDoVeiculo(id);
	}
	
	@GetMapping("/marca/{marca}")
	public ResponseEntity<List<Veiculo>> buscarVeiculoPelaMarca(@PathVariable String marca) {
		return ResponseEntity.ok(service.listarVeiculoPelaMarca(marca));
	}
	
	@GetMapping("/ano/{ano}")
	public ResponseEntity<List<Veiculo>> buscarVeiculoPeloAno(@PathVariable Integer ano) {
		return ResponseEntity.ok(service.listarVeiculoPeloAno(ano));
	}
	
	@GetMapping("/preco/{preco}")
	public ResponseEntity<List<Veiculo>> buscarVeiculoPeloPreco(@PathVariable Double preco) {
		return ResponseEntity.ok(service.listarVeiculoPeloPreco(preco));
	}
	
	@GetMapping("/cor/{cor}")
	public ResponseEntity<List<Veiculo>> buscarVeiculoPelaCor(@PathVariable String cor) {
		return ResponseEntity.ok(service.listarVeiculoPelaCor(cor));
	}

}
