package java03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hellojava01_KBStudent{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("�� �� �Է��ұ��?");
		try {
			int count=Integer.parseInt(s.nextLine());
			if(count<=0)
				throw new Exception("���̰� 0 ������ �� ����.");
		} catch (Exception e) {
			System.out.println("�����Է� �߸���"+e.getMessage());
			return;
		}finally {
			System.out.println("���α׷��� ��������ּ���.");
		}
		
		List<KBStudent> students= new ArrayList<KBStudent>();
		
		for(int i=0; i<count;i++)
		{
			String name="";
			String gender="";
			int age=0;
			int number=0;
			System.out.println("�̸���?");
			name=s.nextLine();
			System.out.println("������?");
			gender=s.nextLine();
			try {
				System.out.println("����?");
				age=Integer.parseInt(s.nextLine());
				System.out.println("��ȣ?");
				number=Integer.parseInt(s.nextLine());
				if(age<=0)
				{
					System.out.println("���� ���� �߸��Ǿ����ϴ�.");
					age=0;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			KBStudent k= new KBStudent(name, gender, age, number);
			if(students.contains(k));
			{
				System.out.println("�ߺ�!");
				i--;
				continue;
			}
			students.add(k);
		}
		for(KBStudent kbStudent : studnets) {
			System.out.println(kbStudent);
		}
		Collections.sort<students>;
		System.out.println("---���̼� ���(��������)---");
		for(KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
	}

}
