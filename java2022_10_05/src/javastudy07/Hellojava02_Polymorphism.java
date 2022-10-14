package javastudy07;

import java.util.ArrayList;

import java2022_10_05_Q2.GameCharacter;

public class Hellojava02_Polymorphism {

	public static void main(String[] args)ArrayList<E>eCharacter g=new Novice();
		
		ArrayList<GameCharacter> players=new ArrayList<Gamecharacter>();
		
		players.add(new Novuce());
		players.add(new Magicuan());
		players.add(new GameCharacter());
		
		GameCharacter gg=new Magician();
		gg.set_class("대마법사");
		gg,setIP("djlee");
		gg.setLevel(250);
		
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow(0);
}

}
