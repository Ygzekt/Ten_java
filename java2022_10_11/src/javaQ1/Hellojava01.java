package javaQ1;

import java.util.ArrayList;
import java.util.List;

public class Hellojava01 {

	public static void main(String[] args) {
		//��ī��� �������ڸ��� �̸��� �־�� ��
		//����Ʈ �����ڰ� ����
		Pikachu p = new Pikachu("����");
		
		// ����Ʈ ������ �̿��ؼ� �ٷ� �ν��Ͻ� ���� ����
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();
		
		//Animalable�� �����ϴ� �͸�Ŭ����. ���⼱ �������� �������.
		Animalable d = new Animalable() {
			
			@Override
			public void Charming() {
				System.out.println("�۸� ¢�´�.");
				
			}
		};
		
		Plantable myp = new Plantable() {
			
			@Override
			public void Grow() {
				System.out.println("LG Ʒ���迡�� �ڶ�� �� ��");
				
			}
		};
		
		Pokemonable1 g = new Pokemonable1() {
			
			@Override
			public void Grow() {
				System.out.println("�ٴټӿ��� �ڶ���.");
				
			}
			
			@Override
			public void Charming() {
				System.out.println("���������");
				
			}
			
			@Override
			public void fight() {
				System.out.println("�źϰź� ��Death");
				
			}
		};
		
		
		//ArrayList�� List��� �������̽��� ��ӹ��� Ŭ����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> ns = new ArrayList<Integer>();
		
		//try catch ���� - java, c#���� ���� ����
		//try�� ������ �κ��� ������ ���� catch�κ����� �Ѿ��
		//���α׷��� ������� �ʴ´�.(try catch �� �� ���¼� ��������
		//�״�� �����)
		try {
			//���� ���� �̽��� �ذ��� ���� - Clonable�̶�� �������̽�
			Pikachu pipi = (Pikachu)p.clone();
			pipi.setName("����׶���");
			//p�� �̸��� �����ε�!? �� pipi�� ����׶��̷� �ٲٴ�, p�� �ٲ���!?
			//���� : pipi�� p�� �Ȱ��� ��ġ�� �����ϱ� �����̴�.(�����Ͷ� ����)
			System.out.println(p.getName());
			System.out.println(pipi.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Plantable myFlower = ()->{
			System.out.println("�������� �ڶ��");
		};
		myFlower.Grow();
		
		
		
		
	}

}





