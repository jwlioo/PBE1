package PrjCaneta;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro Livro01 = new Livro("alice no pais","julio Trigueiro");
		Livro Livro02 = new Livro("Quarto de despejo","Pedro Franscisco");

		
		System.out.println("Livros disponiveis :");
		System.out.print("01. ");
		Livro01 status();
		System.out.print("02. ");
		Livro02 status();
		
		System.out.println("qual livro deseja alugar? ");
		int escolha = sc.nextInt();
	}

}
