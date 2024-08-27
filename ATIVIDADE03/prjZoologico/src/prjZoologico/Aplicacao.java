package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal() ;
			elefante.atributoNome = "Dumbo";
			elefante.atributoRaca = "Africano";
			elefante.atributoSexo = "Macho";
			elefante.atributoPeso = 170;
			
			ClasseAnimal girafa = new ClasseAnimal("github", "russa", "femea",50);
			
			SubClasseCarnivoro leao = new SubClasseCarnivoro();
			leao.atributoNome = "Simba";
			leao.atributoRaca = "Australiano";
			leao.atributoSexo = "macho";
			leao.atributoPeso = 128;
			
			elefante.exibirInfo();
		
			elefante.metodoComer();
			
			elefante.exibirInfo();
			
			
			girafa.exibirInfo();
			
			
			
	
		

	}
	
	}

