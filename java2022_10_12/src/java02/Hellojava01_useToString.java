package java02;

public class Hellojava01_useToString {

	public static void main(String[] args) {
		Student s =new Student("�̵���", 34);
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s);
		System.out.println(s.toString());
		
		Student s2= new Student("�̵���",34);
		System.out.println(s2);
	}

}
