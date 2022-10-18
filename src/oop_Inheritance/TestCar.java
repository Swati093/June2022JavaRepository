package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b1=new BMW();
		b1.start();//Overridden
		b1.stop();//Inherited
		b1.refuel();//inherited
		b1.autoRefule();//Individual
		
		//Top/up-casting
		Car c1=new BMW();
		c1.start();//BMW
		c1.stop();
		c1.refuel();
		//c1.autoRefuel; ReferenceTypeCheck
		
		//Down-casting
		BMW b2=(BMW)new Car();
		//b2.autoRefule(); //ClassCastException

	}

}
