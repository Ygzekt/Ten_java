package java01;

public class Sushi extends Food {

	private String wasabiBrand;

		public Sushi(String name) {
			super(name);
	}

		
		
		public Sushi(String name, int price) {
			super(name, price);
		}

		

		public Sushi(String name, int price, String wasabiBrand) {
			super(name, price);
			this.wasabiBrand = wasabiBrand;
		}



		public String getWasabiBrand() {
			return wasabiBrand;
		}



		public void setWasabiBrand(String wasabiBrand) {
			this.wasabiBrand = wasabiBrand;
		}



		public void namnam() {
			System.out.println(wasabiBrand+"∏¶ ∏‘¿∏∏Á");
		}
	

}
