package PrjCaneta;


public class Livro {
	String nomeLivro;
	String nomeAutor;
	boolean alugado;
	
	
	public Livro (String nomeLivro, String nomeAutor) {
		this.nomeLivro = livro;
		this.nomeAutor =  autor;
		this.alugado = false;
	}
	
	void status() {
	
	System.out.println(this.nomeLivro + (this.alugado ? "alugado": "disponivel"));
	}
	void alugar() {
		this.alugado = true;
	}
}
	void devolver() {
		this.alugado = false;
		
		
	}