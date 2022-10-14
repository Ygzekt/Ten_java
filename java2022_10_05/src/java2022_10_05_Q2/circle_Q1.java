package java2022_10_05_Q2;

public class circle_Q1 {

	public static void main(String[] args) {
		circle c1=new circle(2);
		circle c2=new circle(3);
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());

		circle.setPI(3.0);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
	}

}
