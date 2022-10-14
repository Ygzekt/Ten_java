package java04;

public class Hellojava01_pcRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drmundo d=new Drmundo();
		d.Q();
		d.W();
		d.E();
		d.R();
		
		Cogmo c=new Cogmo();
		c.Q();
		c.W();
		c.E();
		c.R();
		c.passive();
		
		Lol chogas=new Lol() {
			public void Q() {
				System.out.println("¿ïºÎÂ¢À½");
			}
			public void W() {
				System.out.println("ÈäÆ÷");
			}
			public void E() {
				System.out.println("ÆÄ¸ê");
			}
			public void R() {
				System.out.println("³¯Ä«·Î¿î °¡½Ã");
			}
			
		};
	chogas.Q();
	chogas.W();
	chogas.E();
	chogas.R();
	
	
	}

}
