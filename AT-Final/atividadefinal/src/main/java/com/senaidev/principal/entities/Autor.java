package com.senaidev.principal.entities;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class Autor {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String email;
	    private String dataNascimento;

	    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
	    private List<Livro> livros;

	    // Getters e Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public List<Livro> getLivros() {
	        return livros;
	    }

	    public void setLivros(List<Livro> livros) {
	        this.livros = livros;
	    }
	}


