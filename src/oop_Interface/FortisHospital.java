package oop_Interface;

public class FortisHospital extends Pharmacy implements USMedical,UKMedical,INMedical {

	int total;
	@Override
	public void cardiologyService() {
		System.out.println("FH--cardiologyService");
		
	}

	@Override
	public void pathologyService() {
		System.out.println("FH--pathologyService");		
	}

	@Override
	public void radiologyService() {
		System.out.println("FH--radiologyService");		
	}

	@Override
	public void gyneoService() {
		System.out.println("FH--gyneoService");		
		
	}

	@Override
	public void orthopedicService() {
		System.out.println("FH--orthopedicService");		
		
	}

	@Override
	public void ENTService() {
		System.out.println("FH--pathologyService");		
		
	}

	@Override
	public void dentalService() {
		System.out.println("FH--dentalService");		
	}

	@Override
	public void emergencyService() {
		System.out.println("FH--emergencyService");		
		
	}

	@Override
	public int emergencyService(int t) {
		this.total=t;
		return total;
		
	}
	//individual method
	public void dermoServices() {
		System.out.println("FH -- Skin care");
	}
	
	//WHO methods:
	@Override
	public void covidProtocol() {
		System.out.println("FH -- covidProtocol");

	}

	@Override
	public void publishCovidNews() {
		System.out.println("FH -- publishCovidNews");
		
	}

}
