package javaSessions;

public class ArithematicConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(9/2); //4 both value is integer on output is 4 not 4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2);//4.5
		System.out.println(9.0/2.0);//4.5, if any one of the value is in decimal then output will be in decimal
		
		//System.out.println(9/0); //ArithematicException: / by zero
		
		System.out.println(9.0/0); //Infinity not ArithematicException as java is designed differently to handle decimal no.
		System.out.println(9/0.0); //Infinity);
		
		System.out.println(0/9); //any no / by 0 is 0.
		
		//System.out.println(0/0); //ArithematicException: / by zero
		
		System.out.println(0.0/0); //Nan as 0.0 is not a number
		System.out.println(0.0/0.0); //Nan as 0.0 is not a number
		System.out.println(0/0.0); //Nan as 0.0 is not a number
		System.out.println(9/0.0);//Infinity as here one of the number is integer so output is not NaN.
		
				
		
	}
	
}
