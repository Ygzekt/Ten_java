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
		//�͸�Ŭ���� : temp������ ���δ�.
		Food temp  = new Food() {
			public void eat() {
				System.out.println("�⵵�ϰ� �Դ´�.");
			}
		};
		temp.setName("��ȸ�Ĵ� ��");
		fs.add(temp);
		fs.add(new Food() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
			System.out.println("�����ϰ� �Դ´�.");	
			}
		});
	}

}
