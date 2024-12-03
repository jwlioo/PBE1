package com.senaidev.principal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.principal.entities.Livro;
import com.senaidev.principal.repositories.LivroRepository;

@RestController
@RequestMapping("/livros")

public class LivroController {
	@Autowired
	private LivroRepository livroRepository;
	
	@PostMapping
	public Livro adicionarLivro(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
	@GetMapping
	public List<Livro> ListarLivros(){
		return livroRepository.findAll();
	}
	

	
}
