package com.carflux.carflux.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carflux.carflux.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

	
	List<Veiculo> findByMarca(String marca);
	List<Veiculo> findByAno(Integer ano);
	List<Veiculo> findByPreco(Double preco);
	List<Veiculo> findByCor(String cor);

}
