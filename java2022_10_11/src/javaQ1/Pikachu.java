package javaQ1;

public class Pikachu implements Animalable {

	private String Name;
	
	
	
	public Pikachu(String name) {
		super();
		Name = name;
	}

	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("��ī��ī");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
}
