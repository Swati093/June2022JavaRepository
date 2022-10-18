package stringManipulation;

public class splitString {

	public static void main(String[] args) {
		
		String str="My naMe is Swati";
		str=str.toLowerCase();
		String[] str1=str.split(" ");
		int co =  0;
		int vowel=0;
		for(String e : str1) {
			//System.out.println(e);
			for(int i=0;i<e.length();i++) {
			char letter=e.charAt(i);
			if(letter=='a' || letter=='e' || letter=='i' ||letter=='o' ||letter=='u') {
				vowel++;
				
			}
			else {
				co++;
				}
			
			}
		}
System.out.println("const count:"+co);
System.out.println("vowel count:"+vowel);
	}

}
