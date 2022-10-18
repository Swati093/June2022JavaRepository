package oop_encapsulation;

public class EmployeeRegTest {

	public static void main(String[] args) {
		
		EmployeeReg e1=new EmployeeReg();
		e1.setName("Tom");
		e1.setAge(20);
		e1.setGender('M');
		e1.setSalary(30);
		e1.setActive(true);
		
		e1.getEmployeeInfo();
		
		EmployeeReg e2=new EmployeeReg();
		
		e2.setName("Tommy");
		e2.setAge(24);
		e2.setGender('M');
		e2.setSalary(50);
		e2.setActive(true);
		
		e2.getEmployeeInfo();
		

		EmployeeReg e3=new EmployeeReg();
		
		e3.setName("Jenny");
		e3.setAge(24);
		e3.setGender('F');
		e3.setSalary(60);
		e3.setActive(true);
		
		e3.getEmployeeInfo();
	}

}
