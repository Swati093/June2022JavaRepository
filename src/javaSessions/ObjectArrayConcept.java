package javaSessions;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		//Object static array : We can store different types of data in Object Array but size is still fixed,hence object array is still a static array.
		Object emp[]=new Object[5];
		emp[0]="Swati";
		emp[1]=28;
		emp[2]="India";
		emp[4]=12.33;
		emp[3]='F';
		//emp[5]=948545684;// AIOB(ArrayIndexOutOfBoundException) as 5th index is not present inside the memory.
						   // These mistakes/memory allocation related mistaked will be captured at run time not compile time.
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		//System.out.println(emp[5]); AIOB
		
		System.out.println("-------------------");
		
		for(Object e : emp) {
			System.out.println(e);
				if(e.equals("Swati")) {
					System.out.println("Hi..."+e);
				}
		}
		System.out.println("-------------------");
		for(Object e : emp) {
			System.out.println(e);
				if(e.equals("Swati")) {
					System.out.println("Hi..."+e);
					break;
				}
		}
		

	}

}
