package javaSessions;

public class StringConcatinationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="Hello";
		String y="World";
		
		System.out.println(x+y); //HelloWorld
		
		int a=100;
		int b=200;
		
		System.out.println("value of a+b:"+a+b); //100200
		System.out.println("value of a+b:"+(a+b));//300
		
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(a+b+x+y+a+b); //300HelloWorld100200
		System.out.println(x+y+(a+b)); //HelloWorld300
		System.out.println(a+b+x+y+(a+b));//300HelloWorld300
		
		//A String can be concatenated with any kind of data
		
		double d1=12.33;
		double d2=23.44;
		System.out.println(x+d1+d2);//Hello12.3323.44
		
		char c1='a';
		System.out.println(x+c1); //Helloa
		
		char c2='b';
		System.out.println(x+(c1+c2)); //Hello195
		
		System.out.println(x+" "+y); //Hello World
		System.out.println(x+' '+y); //Hello World
	}

}
