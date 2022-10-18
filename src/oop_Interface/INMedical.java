package oop_Interface;

public interface INMedical extends WHO {
	
	public void gyneoService();
	
	public void orthopedicService();
	
	public void emergencyService();
	
	public int emergencyService(int name);
	
	public void publishCovidNews();//parent interface WHO contains same method, no issue in writing here as well

}
