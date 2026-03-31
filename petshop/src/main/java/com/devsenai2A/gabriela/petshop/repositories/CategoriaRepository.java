package com.devsenai2A.gabriela.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsenai2A.gabriela.petshop.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	Categoria findByNome(String nome);

}
