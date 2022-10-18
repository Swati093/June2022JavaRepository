package stringManipulation;

import javax.sound.midi.Synthesizer;

public class StringConcept {

	public static void main(String[] args) {
		
		String str="hello Hi this is my first java code";
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
		//System.out.println(str.charAt(str.length()));
		
		//System.out.println(str.indexOf('X'));//-1
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('i'));//1st 
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		int index = str.indexOf('i',str.indexOf('i')+1);
		System.out.println(str.indexOf('i', index+1));
		
		System.out.println(str.indexOf("this"));
		
		
	}

}
