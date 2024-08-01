package programacao_backend;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
	
  Scanner sc = new Scanner(System.in);
  
  
  
  System.out.print("digite o codigo de uma peça1: ");
	int pecas = sc.nextInt();
	
	System.out.print("digite o numero de peças1: ");
	int npecas = sc.nextInt();
	
	System.out.print("digite o valor unitario de cada peças1: ");
	int valorun = sc.nextInt();
	
	
	System.out.print("digite o codigo de uma peça2: ");
	int  peca02 = sc.nextInt();
	
	System.out.print("digite o numero de peças2: ");
	int  npecas2 = sc.nextInt();
	
	System.out.print("digite o valor unitario de cada peças2: ");
	int  valorun2 = sc.nextInt();
	
	
	
	
	
	System.out.print("o valor a ser pago é " + (npecas*valorun+npecas2*valorun2));

		
		
	}

}
