package javaQ5;
import java2022_10_05_Q2.circle;
public class Sphere extends circle{

	public Sphere(int r) {
		super(r);
	}
	
	public double getVolume() {
		return (4.0/3.0)*getPI()*getR()*getR()*getR();
	}
	protected String Color;
	protected void spin() {
		System.out.println("ºù±Ûºù±Û");
	}
}
