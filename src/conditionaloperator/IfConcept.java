package conditionaloperator;

public class IfConcept {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		if(i >= j) {	//the codition will always be a boolean value
			System.out.println("i is gr or equal to j");
		}
		else {
			System.out.println("i is not gr or equal to j");
		}
		
		if(true) {
			System.out.println("Selenium");
		}
		else {			//Line 20:getting warning as condition is alwasys true so else 
						//part will never get executed.so,its a dead code which we should avoid
			System.out.println("Cypress");
		}
		
		boolean flag=true;
		if(flag) {
			System.out.println("Testing in Selenium");
		}
		else {
			System.out.println("Testing in Cypress");
		}
		
		//nested if
		int total=50;
		
		if(total <= 100) {
			System.out.println("PASS");
			
			if(total >=90) {
				System.out.println("A Grade");
				if(total>=95) {
					System.out.println("Eligible for scholarship");
				}
			}
			else {
				System.out.println("B Grade");
			}
		}
		else {
			System.out.println("Invalid");
		}
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch the chrome...");
		}
		if(browser.equals("Opera")) {
			System.out.println("Launch the Opera...");
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch the firefox...");
		}
		if(browser.equals("ie")) {
			System.out.println("Launch the ie...");
		}
		else {
			System.out.println("Please enter the correct browser:"+browser);
		}
		/**1.if browser="chrome" then output will be:
		 * Launch the chrome...
Please enter the correct browser:chrome
		here,else part also got executed bcoz even in theif first if condtion is satisfied,java will still check all the conditions
		and since else part is associated with last if,java will check browser != ie hence will goto else part and execute.
		 * 2.Here,unnecessarily,all condnts are getting checked even hough first if condtn is satisfied, so performance wise, its not good.
		 */
		
		//If-else-if
		
	}

}
