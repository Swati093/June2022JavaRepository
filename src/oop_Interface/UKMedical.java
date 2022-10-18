package oop_Interface;

public interface UKMedical extends WHO {
	
	public void ENTService();
	
	public void dentalService();
	
	public void emergencyService();
	
	int min_fee=10; //by default interface variable will be static and final in nature

}
