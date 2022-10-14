package javaQ5;

public class Hellojava01_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java2022_10_05_Q2.Student1 s1 = new java2022_10_05_Q2.Student1();
		
		s1.setAge(25);
		s1.setName("±è¼ºÈ¯");
		s1.study();
		
		java2022_10_05_Q2.KBStudent kb1=new java2022_10_05_Q2.KBStudent();
		kb1.setName("±èÇý¹Î");
		kb1.setAge(40);
		kb1.setEducation("´ëÁ¹");
		kb1.setGender("¿©¼º");
		kb1.study();
		kb1.attend("ÀÔ½Ç");
		kb1.attend("Åð½Ç");
	}

}
