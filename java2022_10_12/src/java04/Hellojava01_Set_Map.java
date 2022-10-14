package java04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import java03.KBStudent;

public class Hellojava01_Set_Map {

	public static void main(String[] args) {
		List<Integer> ex1=new ArrayList<Integer>();
		List<Integer> ex2=new LinkedList<Integer>();
		List<Integer> ex3=new Stack<Integer>();
		List<Integer> ex4=new vector<Integer>();
		
		Map<Integer, String> students = new HashMap <Integer, String>();
		
		students.put(1, "�ȼ���");
		students.put(2, "�̵���");
		students.put(1, "����ȣ");
		for(int key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		Set<String> workers = new HashSet<String>();
		workers.add("������");
		workers.add("�躸��");
		workers.add("������");
		workers.add("�̵���");
		workers.add("�̵���");
		System.out.println("--set test---");
		for(String string : workers) {
			System.out.println(string);
		}
		
		java03.KBStudent k1= new KBStudent("������", "����", 30,3);
		java03.KBStudent k2= new KBStudent("������", "����", 30,3);
		
		Set<KBStudent> kbstudents=new HashSet<KBStudent>();
		kbstudents.add(k1);
		kbstudents.add(k2);
		for(KBStudent kbStudent : kbstudents) {
			System.out.println(kbStudent);
		}
		
	}

}
