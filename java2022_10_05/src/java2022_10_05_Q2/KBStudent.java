package java2022_10_05_Q2;

public class KBStudent extends Student1{

	private String gender;
	private String education;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void attend(String att) {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!");
	}
}
