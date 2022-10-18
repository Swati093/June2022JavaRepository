package javaSessions;

public class ForEachLopp {

	public static void main(String[] args) {
		// for each loop is an enhanced version of for loop.
		
		int a[]=new int[4];//[0-3]
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//For loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-------------------");
		
		/*Foreach loop :Disadvantage: 1. Always goes in increment order. so with foreach loop, we can print 
		 * array in reverse order as decrease operation is not supported by for each loop.
		 * 2. Performance wise, both for and foreach loop are same.
		 * 3.Foreach loop can be used with any kind of array.
		 * 
		 */
		for(int e : a) {		//here,data type of e will always be equal to data type of array(a). DT of a=int, so e=int
			System.out.println(e);
		}
		System.out.println("------------------");
		double d[]=new double[4];
		d[1]=12.33;
		d[3]=2;
		
		for(double e: d) {
			System.out.println(e);
		}
		
		char c[]=new char[4];
		c[0]='A';
		c[1]='a';
		c[3]='$';
		c[2]=' ';
		
		System.out.println("------------------");
		System.out.println("Concatenation  is:"+c[0]+c[1]);
		System.out.println("Sum is:"+(c[0]+c[1]));
		System.out.println("------------------");
		
		for(char e : c) {
			System.out.println(e);
		}

	}

}
