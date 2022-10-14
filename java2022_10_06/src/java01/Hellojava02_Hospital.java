package java01;

import java.util.ArrayList;

public class Hellojava02_Hospital {

	public static void main(String[] args) {

		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		
		Animal a1= new Animal();
		Animal a2= new Dog();
		Cat a3= new Cat();
		
		if(a2 instanceof Dog)
			((Dog) a2).setHairColor("Èò»ö");
		
		a3.setEyeColor("È£¹Ú»ö");
		animalHospital.add(a1);
		animalHospital.add(a2);
		animalHospital.add(a3);
		
		for(Animal al1 : animalHospital) {
			al1.Sleep();
			if(al1 instanceof Dog)
				((Dog) al1).back();
			else if(al1 instanceof Cat)
				((Cat) al1).meow();
			System.out.println("-------------");
		}
		
	}

}
