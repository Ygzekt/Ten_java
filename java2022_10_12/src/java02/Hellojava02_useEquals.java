package java02;

public class Hellojava02_useEquals {

	public static void main(String[] args) {
		String a= "�̵���";
		String b= "�̵���";
		String c= new String("�躸��");
		String d= new String("�躸��");
		
		Student s1= new Student("�̵���",340);
		Student s2= new Student("�̵���",340);
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(s1==s2);
		
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(s1.equals(s2));
		
		
		Worker w1=new Worker("����ȣ", "001");
		Worker w2=new Worker("����ȣ", "001");
		Worker w3=new Worker("����ȣ", "002");

		System.out.println(w1.equals(w2));
		System.out.println(w2.equals(w3));
		
	}

}
