package java2022_10_05_Q2;

public class GameCharacter {
	private String Id;
	private String _class;
	private int Level;
	private static int Count;
	
	public GameCharacter(String id, String _class, int level) {
		Count++;
		Id = id;
		this._class = _class;
		Level = level;
	}

	public GameCharacter() {
		Count++;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}
 
	public static int getCount() {
		return Count;
	}
	
	public static void sayHello() {
		System.out.println("�ȳ�~!");
	}
	
	public void attack() {
		if(_class.contains("����")) {
			System.out.println("��������");
		}
		else if(_class.contains("����")) {
			System.out.println("��������");
		}
		else
		{
			System.out.println(Level+"Lv "+_class+"�� ������");
		}
	}
	
	

	
	
	

}
