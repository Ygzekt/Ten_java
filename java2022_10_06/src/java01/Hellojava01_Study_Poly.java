package java01;

import java.util.ArrayList;

public class Hellojava01_Study_Poly {

	public static void main(String[] args) {

		Animal a= new Animal();
		Dog d =new Dog();
		Cat c =new Cat();
		
		Animal a1= new Dog();
		Animal c2= new Cat();
		
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(a);
		zoo.add(d);
		zoo.add(c);
		zoo.add(a1);
		zoo.add(c2);
		zoo.add(new Animal());
		zoo.add(new Dog());
		zoo.add(new Cat());
		
		ArrayList<Animal> animalHospital =new ArrayList<Animal>();
		Animal aa1=new Animal();
		aa1.setAge(5);
		aa1.setName("노을");
		aa1.setSpecies("사막여우");
		
		Dog d1=new Dog();
		d1.setAge(3);
		d1.setHairColor("애쉬블루");
		d1.setName("블루");
		
		Cat cc=new Cat();
		cc.setAge(2);
		cc.setEyeColor("황금색");
		cc.setName("아반");
		   
	                                                                                                              }

}
