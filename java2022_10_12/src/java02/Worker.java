package java02;

public class Worker {
	private String Name;
	private String cNum;
	
	public Worker(String name, String cNum) {
		super();
		Name = name;
		this.cNum = cNum;
	}
	@Override
	public String toString() {
		return "�̸� : "+Name+", ��� : "+ cNum;
	}
	@Override
	public boolean equals(Object obj) {
		Worker w= (Worker)obj;
		return w.getName().equals(Name) && w.getcNum().equals(cNum);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getcNum() {
		return cNum;
	}
	public void setcNum(String cNum) {
		this.cNum = cNum;
	}
	
}
