package oop_encapsulation;

import java.util.List;
import java.util.ArrayList;

public class TestBrowser {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Chropath");
		a.add("SelectorHub");
		a.add("TestPlugin");
		Browser b1=new Browser("Google", "3.8.1",a) ;
		System.out.println(b1.getName());
		System.out.println(b1.getVersion());
		System.out.println(b1.getPlugin());

	}

}
