package javaSessions;

public class StaticVariableConcept {
	
	String name;
	int carPrice;
	String numberPlate;
	static int wheels=4; //Every car will have 4 hweels only so this is a common preperty.Hence,will be considered as static property. 

	public static void main(String[] args) {
		StaticVariableConcept c1=new StaticVariableConcept();
		
		c1.name="BMW";
		c1.carPrice=70;
		c1.numberPlate="MH14J2345";
		
		System.out.println(c1.name+" "+c1.carPrice+" "+c1.numberPlate+" "+StaticVariableConcept.wheels);
		
		

	}

}
