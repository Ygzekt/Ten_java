package java04;

import java.util.Set;

public class Hellojava02_TestSet {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("�ȼ���", "001"));
		employees.add(new Employee("�ȼ���", "001"));
		employees.add(new Employee("������", "002"));
		for(Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
		
	}
}
