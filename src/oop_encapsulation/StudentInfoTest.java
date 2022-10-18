package oop_encapsulation;

import javax.sound.midi.Synthesizer;

public class StudentInfoTest {

	public static void main(String[] args) {
		StudentInfo s1=new StudentInfo(34, "Ravi", 'M');
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGender());
		
		/*We can instialize the private member using constructor as well as setter method,
		 * but suppose in future we want to update the age of same user and we have defined 
		 * only constructor for intializing the member,then again we have to create object for 
		 * same user.Sp, to avoid this issue,we will use setter method.
		 * 	 * 
		 */
		s1.setAge(35);
		
		System.out.println("After updating.....");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGender());
		
	}
}
