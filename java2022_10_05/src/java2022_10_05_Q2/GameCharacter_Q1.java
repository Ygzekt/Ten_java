package java2022_10_05_Q2;

public class GameCharacter_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� �ο�"+GameCharacter.getCount());
		GameCharacter g1=new GameCharacter();
		System.out.println("�� �ο�"+GameCharacter.getCount());
		g1.set_class("��ũ����");
		g1.setId("��ũ�³����ǻ�");
         
		
		System.out.println("�� �ο� " + GameCharacter.getCount());
		GameCharacter g3  = new GameCharacter();
		g3.set_class("���Ʊ���");
		g3.setId("�����޽����������");
		g3.setLevel(34);
		System.out.println("�� �ο� " + GameCharacter.getCount());
		
		
		
		GameCharacter.sayHello();
		g1.attack();
		g3.attack();
	}

}
