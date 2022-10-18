package oop_encapsulation;

public class EmployeeReg {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean getisActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void getEmployeeInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSalary());
		System.out.println(getGender());
		System.out.println(getisActive());
		System.out.println(" ");
		
	}

}
