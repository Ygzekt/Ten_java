package java2022_10_05_Q2;

import java01.공부합니다;

public class Student1 {
	public static void main(String[] args) {
		
private String name;
private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void study() {
	System.out.println(this.name+"학생이 ");
	System.out.println(this.age+"살 답게 ");
	System.out.println("공부합니다.");

	}
}
