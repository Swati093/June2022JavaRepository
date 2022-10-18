package oop_abstract;

public abstract class Page {
	
	//can not create object of abstract class
	//abstract claas can contain abs method and non-abs method
	
	public Page() {
		System.out.println("Page Default const.....");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void timeOut() {
		System.out.println("Page time out is: 20 secs");
	}
	
	public final void pageLogo() {
		System.out.println("page logo....");
	}
	
	public static void maximizeWindow() {
		System.out.println("Page---maximization");
	}


}
