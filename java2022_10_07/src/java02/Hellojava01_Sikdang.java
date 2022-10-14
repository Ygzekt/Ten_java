package java02;

import java.util.ArrayList;

public class Hellojava01_Sikdang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Food f =new Food();
		Food f =new Taco();
		Ramen r =new Ramen();
		Bibimbab b =new Bibimbab();
		
		f.eat();
		r.eat();
		b.eat();
		
		ArrayList<Food> fs =new ArrayList<Food>();
		fs.add(f);
		fs.add(r);
		fs.add(b);
		for(Food food : fs) {
			food.eat();
		}
		//익명클래스 : temp에서만 쓰인다.
		Food temp  = new Food() {
			public void eat() {
				System.out.println("기도하고 먹는다.");
			}
		};
		temp.setName("교회식당 밥");
		fs.add(temp);
		fs.add(new Food() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
			System.out.println("묵상하고 먹는다.");	
			}
		});
	}

}
