package com.devsenai2A.gabriela.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsenai2A.gabriela.petshop.entities.Categoria;
import com.devsenai2A.gabriela.petshop.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@PostMapping
	public ResponseEntity <Categoria> criarCategoria(@RequestBody Categoria categoria) {
		Categoria novaCategoria = service.criar(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(novaCategoria);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarCategoria(@PathVariable Long id) {
		
		boolean removido = service.deletar(id);
		
		if(!removido) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> atualizarCategoria(
			@PathVariable Long id,
			@RequestBody Categoria categoria){
		
		Categoria categoriaAtualizada = service.atualizar(id, categoria);
		
		if(categoriaAtualizada == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(categoriaAtualizada);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
		Categoria categoria = service.buscarPorId(id);
		if(categoria == null) return ResponseEntity.notFound().build();
		return ResponseEntity.ok(categoria);
	}
	
	@GetMapping 
	public List<Categoria>listarCategorias(){
		return service.findAll();
	}

}
