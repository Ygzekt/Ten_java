package java01;

public class Hellojava04_Finally {

	public static void main(String[] args) {
		int a=0,b=0,c=0,d=0;
		try {
			a=10;
			c=a/b;
		} catch (Exception e) {
			System.out.println("�߸���");
			return;
		}finally {
			System.out.println("�� �κ��� ���� �� �� ���� �ִ�.");
		}
		
		System.out.println("���� �ȵ�.");
	}

}
