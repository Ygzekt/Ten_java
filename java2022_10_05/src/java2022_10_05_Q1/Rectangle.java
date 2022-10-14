package java2022_10_05_Q1;

public class Rectangle {
	private int w;
	private int h;
	//게터 세터
	//private한 변수(=속성)
	public int getW() {
		return w;
	}
	public void setW(int w) {
		if(w<=0)
		{
			System.out.println("오류!(w)");
			this.w=0;
			return;
		}
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		if(h<=0)
		{
			System.out.println("오류!(h)");
			this.h=0;
			return;
		}
		this.h = h;
	}
	public Rectangle(int w, int h) {
		setW(w);
		setH(h);
		//this.w = w;
		//this.h = h;
	}
	public Rectangle(int wh) {
		this.w = wh;
		this.h = wh;
	}
	public Rectangle() {
		
	}

	public int getArea() {
		if(w<=0||h<=0)
		{
			System.out.println("Error!");
			return -1;
		}
		else if(w==h) {
			System.out.println("정사각형!");
		}
		return w*h;
	}
	
	
	
	
	
	
	
}
