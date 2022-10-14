package java2022_10_05_Q1;

public class Square {

	private int wh;
	
	public int getwh() {
		return wh;
	}
	public void setwh(int wh) {
		if(wh<=0)
		{
			System.out.println("잘못된 wh 값");
			this.wh=0;
			return;
		}
		this.wh=wh;
	}
	public Square() {
		//super();
	}
	
	public Square(int wh) {
		//super();
		this.wh = wh;
	}
	
	
	
	
	
	
	
	
	
}