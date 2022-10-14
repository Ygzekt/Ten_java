package javastudy07;

import javastudy03.GameCharacter;

public class Hellojava03_players {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	players.add(new Worrior());
	if(players.get(players.size()-1)instanceof worrior)
	{
		Worrior w=(Worrior)players
	}
	
	
	
	for(GameCharacter gameCharacter : players) {
		gameCharacter.printInfo();
		gameCharacter.attack();
		if(gameCharacter instanceof Novice)
		{
			((Novice) gameCharacter).sleep();
			if(gameCharacter instanceof Worrior)
				((Worrior) gameCharacter).punch();
		}
		else if(gameCharacter instanceof Magician)
			((Magician)gameCharacter).magicArrow();
		
	}
}
