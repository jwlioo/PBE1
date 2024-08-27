package prjPokemon;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciamento classe
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Grass", 1, 50);
		
		Pokemon charmander = new Pokemon("Squirtle", "water", 1, 50);
		
		Pokemon Caterpie = new Pokemon("Caterpie ", "bug", 1, 50);
		
		Pokemon Venusaur = new Pokemon("Venusaur", "poison", 1, 50);
		
		Pokemon Pikachu = new Pokemon("Pikachu", "Elétrico", 1, 50);
		
		Bulbasaur.exibirinfo();
		Bulbasaur.evoluir();
		Bulbasaur.atacar();

		charmander.exibirinfo();
		charmander.evoluir();
		charmander.atacar();
		
		Caterpie.exibirinfo();
		Caterpie.evoluir();
		Caterpie.atacar();
		
		Venusaur.exibirinfo();
		Venusaur.evoluir();
		Venusaur.atacar();

		Pikachu.exibirinfo();
		Pikachu.evoluir();
		Pikachu.atacar();
		
	}

}

