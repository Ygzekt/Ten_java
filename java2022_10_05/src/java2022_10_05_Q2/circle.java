package java2022_10_05_Q2;

public class circle {
	private int r;

	private static double PI;
	
	public static double getPI() {
		return PI;
	}

	public static void setPI(double pI) {
		PI = pI;
	}
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public circle(int r) {
		super();
		this.r = r;
		PI=3.14;
	}

	public double getArea() {
		return r*r*PI;
	}

	
}
