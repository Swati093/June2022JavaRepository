package callByValueAndReference;

public class CallByReference {
	
	String name;
	int age;
	
	public void getInfo(CallByReference t1) {
		t1.name="Nitin";
		t1.age=30;
		sendInfo(t1);
	}
	
	public void getInfo(String nameValue) {
		System.out.println(nameValue);
	}
	
	public void sendInfo(CallByReference t2) {
		t2.name="Peter";
		t2.age=35;
	}

	public static void main(String[] args) {
		
		CallByReference obj=new CallByReference();
		obj.name="Tom";
		obj.age=25;
		
		System.out.println(obj.name+"  "+obj.age);
		
		obj.getInfo(obj);
		System.out.println(obj.name+"  "+obj.age);	
		
		obj.getInfo(obj.name);

	}

}
