package programacao_backend;
import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	double pi = 3.14159;
				

	System.out.println("Qual o raio do circulo? ");
	double raio = sc.nextDouble();
	
	System.out.printf("A area do circulo é: %.4f ", pi *raio*raio );
	}

}
