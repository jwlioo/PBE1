package prjZoologico;

public class ClasseAnimal {
	//Atributos
	String atributoNome;
	String atributoRaca;
	String atributoSexo;
	double atributoPeso;
	//construtores
	
	public ClasseAnimal () {
		
		
	}
	public ClasseAnimal (String parametroNome,String parametroRaca,String parametroSexo, double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoSexo = parametroSexo;
		this.atributoRaca = parametroRaca;
		this.atributoPeso = parametroPeso;
		
	}
	//metodos
		public void metodoComer() {
			if(this.atributoPeso >= 170)
				System.out.println(this.atributoNome + ", esta obeso, vamos exercitar");
			else {
				this.atributoPeso = this.atributoPeso += 10;
			
		}
			
		}
		public void metodoExercitar() {
			if (this.atributoPeso <= 50)
				System.out.println(this.atributoNome + ",esta magro demais que tal comer?");
	
			else {
				this.atributoPeso -= 10;
			}
			public void exibirInfo() {
				System.out.println("nome: "+ this.atributoNome);
				System.out.println("peso: "+ this.atributoPeso);
			
		}

}
