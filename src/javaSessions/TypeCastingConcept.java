package javaSessions;

public class TypeCastingConcept {

	public static void main(String[] args) {
		//Type casting types:
		//1.Widening typecasting: Converting lower data type to upper data type
		byte b=2;
		short s=b;
		int i=b;
		long l=b;
		
		System.out.println(b);
		System.out.println(s);
		//here, short,int and long can hold byte b as they are bigger in size,so here java will do auto-conversion
		
		//2.Narrowing typecasting : Conversion of higher data types to lower data type.
		
		int a=3;
		short a1=(short)a;//size of int>short , so we need to explicitly convert into short here.
		System.out.println(a1);
		
		byte m=110;
		byte n=100;
		int t=m+n;
		byte t1=(byte)(m+n);
		System.out.println(t);
		System.out.println(t1);/*this will give some -ve value as m+n=210> the range of byte(-128 to 127) and on line no.26 we are forcefully
		 						converting 210 value to byte so this will give a -ve value*/
		
		
		char c=97;
		System.out.println(c);//a
		System.out.println(c+'b');//195
		

	}

}
