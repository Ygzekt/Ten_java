package java05;

import java.util.ArrayList;

public class Hellojava01_PokemonWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulbasaur b = new Bulbasaur();
		Bulbasaur i = new Ivysaur(); 
		Venusaur v = new Venusaur();

		Animalable p = new Animalable() {
			
			@Override
			public void Run() {
				System.out.println("빠르게 뛰어간다.");
			}
			
			@Override
			public void Move() {
				System.out.println("종종걸음");
			}
			
			@Override
			public void Charming() {
				System.out.println("피까쮸!~");
				
			}
		};
		ArrayList<Animalable> pokemons 
		= new ArrayList<Animalable>();
		pokemons.add(b);
		pokemons.add(i);
		pokemons.add(v);
		pokemons.add(p);
		Venusaur megaVenu = new Venusaur() {
			@Override
			public void Grow() {
				System.out.println("꽃모양 나무가 자란다.");
			}
			@Override
			public void Charming() {
				System.out.println("(좀더우렁차게) 이상해~~~꽃!!!");
			}
		};
		pokemons.add(megaVenu);
		
		
		for (Animalable animalable : pokemons) {
			animalable.Charming();
		}
	}

}
