package java01;

public class PorkCutlet extends Food {

	public PorkCutlet(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
//		super.eat();
		System.out.println(getName()+"�� �ְ��� ���");
		System.out.println(getPrice()+"���� ������ �Ʊ��� �ʳ�~");
		
	}
	public void eat(int count) {
		System.out.println(count+"�� ��� ����");
		
	}
	public void eat(String source) {
		System.out.println(source+"�� ������");
	}
	
}
