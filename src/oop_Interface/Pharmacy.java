package oop_Interface;

public class Pharmacy extends Medical {
	
	@Override
	public void covidVirus() {
		System.out.println("Covid Symptoms :Cough->med1,fever->pan-D,headache->Crocin");
	}
	public void alzymer() {
		System.out.println("Medicine: Med3");
	}

}
