package javaSessions;

import java.util.ArrayList;

public class ArrayListGenericsConcept {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		//ar.add(10.22); Not applicable
		
		ArrayList<Double> bmiList=new ArrayList<Double>();
		bmiList.add(10.22);
		bmiList.add(23.54);
		
		//Acceptance Criteria
		/*Create an arraylist to store below employee data
		 * empName(String),	age(int),salary(double),permanent(boolean),gender(char)	 * 
		 */
		
		ArrayList<Object> empList=new ArrayList<Object>();
		empList.add("Swati");
		empList.add(28);
		empList.add(10.23);
		empList.add(true);
		empList.add('F');
		
		//WithhGeneric arraylist we can use foreach loop as we know the type of data in the arraylist
		for(Object e : empList) {
			System.out.println(e);
					}
	}

}
