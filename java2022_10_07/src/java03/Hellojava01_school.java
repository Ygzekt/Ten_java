package java03;

public class Hellojava01_school {
	
	public static void main(String[] args) {
	Teacher t= new MathTeacher();
	MathTeacher m= new MathTeacher();
	ProgramingTeacher p= new ProgramingTeacher();
	JavaProgramingTeacher j=new JavaProgramingTeacher("�̵���","�Ӻ����");
	
	t.Teach();
	m.Teach();
	p.Teach();
	j.Teach();
	
	Teacher t2 =new Teacher() {
		
		public void Teach() {
			System.out.println("������ ���°� �Բ� ���� ����");
		}
	};
	t2.Teach();
	
	ProgramingTeacher p2 =new ProgramingTeacher() {
		public void Teach() {
			System.out.println(getName()+"���� c�� �����ĵ帳�ϴ�.");
		}
	};
	p2.setName("������");
	p2.Teach();
}
}
