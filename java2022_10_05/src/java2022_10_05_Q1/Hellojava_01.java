package java2022_10_05_Q1;

public class Hellojava_01 {

	public static void main(String[] args) {
		Square s1= new Square();
		s1.setwh(-1);
		System.out.println(s1.getwh());
		s1.setwh(10);
		System.out.println(s1.getwh());
	}
}
