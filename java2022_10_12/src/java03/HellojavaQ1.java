package java03;

import java.util.Scanner;

public class HellojavaQ1 {

	public static void main(String[] args) {
		//1. 3���� 8������ ���� �� Ȧ���� ���ϱ�
		int sum=0;
		for(int i=3;i<=8;i++)
		{
			if(i%2!=0) {
				sum+=i;				
			}
		}
		System.out.println(sum);
		
		//2. ���ڿ� �Է� �� ������ϱ�
		Scanner s= new Scanner(System.in);
		System.out.println("���ڿ� �Է�");
		String sentense=s.nextLine();
		for(int i= sentense.length()-1;i>=0;i--)
		{
			System.out.println(sentense.charAt(i));
		}
		
		//3.����Ʈ �� �Է� �� ��Ʈ�� ���
		System.out.println("�� ����Ʈ��?");
		try {
			int num=s.nextInt();
			System.out.println(num+"����Ʈ="+(num*8)+"��Ʈ");
		} catch (Exception e) {
			System.out.println("�� �߸� �Է���.");
		}
		
		
		
		
		
	}

}
