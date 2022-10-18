package oop_abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.title();//Overridden  method
		lp.url();
		lp.doLogin("Swati", "Swati123");//individual method of LoginPage class
		lp.resetPwd();
		lp.timeOut();//inherited method
		lp.pageLogo();
		LoginPage.maximizeWindow();

	}

	

}
