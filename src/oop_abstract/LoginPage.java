package oop_abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login Page Default Const...");
	}

	@Override
	public void title() {
		System.out.println("Login Page title....");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page url....");
		
	}
	
	public void resetPwd() {
		System.out.println("Login password Reset");
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("Login credentials:"+un+","+pwd);
	}
	
	
}
