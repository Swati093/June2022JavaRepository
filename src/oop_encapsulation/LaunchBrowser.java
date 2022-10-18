package oop_encapsulation;

public class LaunchBrowser {
	//methods can also be encapsulated.
	
	public void launchBrowserOnClick() {
		System.out.println("Launching browser.....");
		checkOSCompatibility();
		checVersion();
		checkPlugin();
	}
	
	private void checkOSCompatibility() {
		System.out.println("checking OS compatibility...");
	}
	
	private void checVersion() {
		System.out.println("Checking version......");
	}
	private void checkPlugin() {
		System.out.println("Checking Plugins....");
	}

	public void openBrowser() {
		System.out.println("browser launched successfully...");
	}
}
