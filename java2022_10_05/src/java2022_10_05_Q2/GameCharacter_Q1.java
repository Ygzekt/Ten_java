package java2022_10_05_Q2;

public class GameCharacter_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("총 인원"+GameCharacter.getCount());
		GameCharacter g1=new GameCharacter();
		System.out.println("총 인원"+GameCharacter.getCount());
		g1.set_class("핑크공주");
		g1.setId("핑크는남자의색");
         
		
		System.out.println("총 인원 " + GameCharacter.getCount());
		GameCharacter g3  = new GameCharacter();
		g3.set_class("직훈교사");
		g3.setId("에러메시지좀보라고");
		g3.setLevel(34);
		System.out.println("총 인원 " + GameCharacter.getCount());
		
		
		
		GameCharacter.sayHello();
		g1.attack();
		g3.attack();
	}

}
