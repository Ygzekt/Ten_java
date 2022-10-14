package javaQ2;

public class Dragon extends Cryptid implements Fliable, Runsable{

	private String species;
	
	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("´Ş¸®Áö ¾Ê´Â´Ù");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("ÄôÄô");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("ºÎ¿õºÎ¿õ");
	}

	@Override
	public void FlapWing() {
		// TODO Auto-generated method stub
		System.out.println("¾öÃ» ¸ÚÁø ³¯°³°¡ ÀÖ´Ù..");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("ÀÚ´Âµ¥ ±ú¿ì¸é Á×´Â´Ù.");
	}

	public void polymorph() {
		System.out.println(species+"º¯½Å");
	}
}
