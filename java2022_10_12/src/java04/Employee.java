package java04;

public class Employee {
	private String name;
	private String Sabeon;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSabeon() {
		return Sabeon;
	}
	public void setSabeon(String sabeon) {
		Sabeon = sabeon;
	}
	
	public Employee(String name, String sabeon) {
		this.name = name;
		Sabeon = sabeon;
	}
	@Override
	public int hashCode() {
		return (name+Sabeon).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	Employee temp = (Employee)obj;
	return temp.getName().equals(name) && temp.getSabeon().equals(Sabeon);
	}
}
