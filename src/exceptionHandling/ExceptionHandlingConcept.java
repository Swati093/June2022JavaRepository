package exceptionHandling;

public class ExceptionHandlingConcept {
	
	public static void a() {
		
		try {
			int i=9/0;
		}catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		a();
		System.out.println("Bye");
	}

}
