package com.senaidev.principal.controllers;

import com.senaidev.principal.entities.Autor;
import com.senaidev.principal.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    public Autor adicionarAutor(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }

    @GetMapping
    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }
}