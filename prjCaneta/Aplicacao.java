package PrjCaneta;

import java.util.Scanner;

public class Aplicacao {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in); 
			
			Caneta caneta01 = new Caneta();
			caneta01.modelo = "BIC";
			caneta01.cor = "azul";
			caneta01.ponta = 0.5;
			caneta01.tampada = false;
			
			Caneta caneta02 = new Caneta();
			caneta02.modelo = "Faber";
			caneta02.cor = "verde";
			caneta02.ponta = 1.0;
			caneta02.tampada = true;
			
			caneta01.status();
			
			System.out.println("qual a carga da caneta01 ?");
			caneta01.carga = sc.nextInt();
			
			
			System.out.println("qual a carga da caneta01 ?");
			caneta02.carga = sc.nextInt();
			
			caneta01.status();
			caneta02.status();
			
		}

	}