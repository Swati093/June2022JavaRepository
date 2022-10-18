package oop_encapsulation;

public class StudentInfo {
	private int age;
	private String name;
	private char gender;
	//Tp differentiate b|w contructor and setter method
	//const..
	public StudentInfo(int age, String name, char gender) {
		
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}
