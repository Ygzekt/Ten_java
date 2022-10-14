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
				System.out.println("������ �پ��.");
			}
			
			@Override
			public void Move() {
				System.out.println("��������");
			}
			
			@Override
			public void Charming() {
				System.out.println("�Ǳ���!~");
				
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
				System.out.println("�ɸ�� ������ �ڶ���.");
			}
			@Override
			public void Charming() {
				System.out.println("(�����췷����) �̻���~~~��!!!");
			}
		};
		pokemons.add(megaVenu);
		
		
		for (Animalable animalable : pokemons) {
			animalable.Charming();
		}
	}

}
