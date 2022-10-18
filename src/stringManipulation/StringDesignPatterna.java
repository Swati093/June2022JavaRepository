package stringManipulation;

public class StringDesignPatterna {

	public static void main(String[] args) {
		
		String str="Demo";
		char[] ch=str.toCharArray();
		//System.out.println(ch.length);
		//System.out.println(str.length());
		//int k=0;
	
		for(int k=0;k<=str.length();k++)
			for (int i = 0; i< str.length(); i++) {
				for(int j = 0;j<=i;j++) {
					
					System.out.print(str.charAt(k));
					
				}
				System.out.println("");
				k++;
			}
		
	}

}
