package java03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hellojava01_KBStudent{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("몇 명 입력할까요?");
		try {
			int count=Integer.parseInt(s.nextLine());
			if(count<=0)
				throw new Exception("길이가 0 이하일 수 없다.");
		} catch (Exception e) {
			System.out.println("숫자입력 잘못됨"+e.getMessage());
			return;
		}finally {
			System.out.println("프로그램을 재시작해주세요.");
		}
		
		List<KBStudent> students= new ArrayList<KBStudent>();
		
		for(int i=0; i<count;i++)
		{
			String name="";
			String gender="";
			int age=0;
			int number=0;
			System.out.println("이름은?");
			name=s.nextLine();
			System.out.println("성별은?");
			gender=s.nextLine();
			try {
				System.out.println("나이?");
				age=Integer.parseInt(s.nextLine());
				System.out.println("번호?");
				number=Integer.parseInt(s.nextLine());
				if(age<=0)
				{
					System.out.println("나이 값이 잘못되었습니다.");
					age=0;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			KBStudent k= new KBStudent(name, gender, age, number);
			if(students.contains(k));
			{
				System.out.println("중복!");
				i--;
				continue;
			}
			students.add(k);
		}
		for(KBStudent kbStudent : studnets) {
			System.out.println(kbStudent);
		}
		Collections.sort<students>;
		System.out.println("---나이순 출력(오름차순)---");
		for(KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
	}

}
