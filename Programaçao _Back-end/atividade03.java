package programacao_backend;

import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu numero? ");
		int num= sc.nextInt();
		
		System.out.println("Qual é o seu numero de horas trabalhada? ");
		int horas = sc.nextInt();
		
		System.out.println("Qual é o valor que voce ganha por hora? ");
		int valor= sc.nextInt();
		
		System.out.println("funcionario"+(num)+ "tem"+ (horas)+ "horas trabalhadas, o valor de sua hora é R$"+(valor));
		
		System.out.println("Seu salario é de : "+ (horas *valor)+ ".00 reais");
		
		
		
		

		
	}

}
