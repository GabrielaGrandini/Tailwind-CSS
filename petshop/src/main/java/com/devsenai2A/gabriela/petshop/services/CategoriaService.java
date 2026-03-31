package com.devsenai2A.gabriela.petshop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenai2A.gabriela.petshop.entities.Categoria;
import com.devsenai2A.gabriela.petshop.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	private final CategoriaRepository repository;
	
	
	public CategoriaService(CategoriaRepository repository) {
		this.repository = repository;
	}
	
	public Categoria criar(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	
	public Categoria atualizar(Long id, Categoria dados) {
		Categoria categoria = repository.findById(id).orElse(null);
		if (categoria == null) {
			return null;
		}
		
		categoria.setNome(dados.getNome());
		categoria.setDescricao(dados.getDescricao());
		categoria.setAtivo(true);
		
		return repository.save(categoria);
	}
	
	public boolean deletar(Long id) {
		if(!repository.existsById(id)) {
			return false;
		}
		
		repository.deleteById(id);
		return true;
	}
	
	public Categoria buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}
	

}
