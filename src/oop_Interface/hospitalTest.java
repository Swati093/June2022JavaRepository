package oop_Interface;

public class hospitalTest {

	public static void main(String[] args) {
		int tt=5;
		
		FortisHospital fh=new FortisHospital();
		fh.cardiologyService();
		fh.dentalService();
		fh.emergencyService();
		fh.dentalService();
		fh.dermoServices();
		int total=fh.emergencyService(tt);
		System.out.println("Total services are:"+total);
		//calling extended class
		fh.covidVirus();
		fh.alzymer();
		
		System.out.println("\n"+"Top casting output:");
		
		UKMedical uh= new FortisHospital(); //Top Casting
		uh.dentalService();
		uh.emergencyService();
		uh.ENTService();
		//uh.dermoServices(); ReferenceTypeCheck concept will be applied here,as this method is indvidua
								//method of Fortishospital class
		//uh.radiologyService(); method of USMedical interface
		uh.covidProtocol(); //WHO is the parent of UKMedical, so UKMedical can call WHO methods
		uh.publishCovidNews();
		
		System.out.println(UKMedical.min_fee); 
		//UKMedical.min_fee=34; //can not the value as this is final in nature
		
		System.out.println(FortisHospital.min_fee);//Interface variable can be called using implementing class also.
		
		
		
		
	}

}
