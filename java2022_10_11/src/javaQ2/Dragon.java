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
		System.out.println("�޸��� �ʴ´�");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("�ο��ο�");
	}

	@Override
	public void FlapWing() {
		// TODO Auto-generated method stub
		System.out.println("��û ���� ������ �ִ�..");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("�ڴµ� ����� �״´�.");
	}

	public void polymorph() {
		System.out.println(species+"����");
	}
}
