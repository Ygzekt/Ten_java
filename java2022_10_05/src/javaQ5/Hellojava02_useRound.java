package javaQ5;

import java2022_10_05_Q2.circle;


public class Hellojava02_useRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1=new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
	
		circle.setPI(1);
		System.out.println(sp1.getVolume());
	
		
	}

}
