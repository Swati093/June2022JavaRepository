package assignments;

public class Grades {
	
	int total;
	
	public void enterMarks(int i)
	{
		total=i;	
	if(total>40) {
	   if(total>100)
			System.out.println("Please enter a valid number");
	   else {
		System.out.println("Pass");
		if(total>=91 && total<=100)
			System.out.println("AA Grade");
		else if(total>=81 && total<=90)
			System.out.println("AB Grade");
		else if(total>=71 && total<=80)
			System.out.println("BB Grade");
		else if(total>=61 && total<=70)
			System.out.println("BC Grade");
		else if(total>=51 && total<=60)
			System.out.println("CD Grade");
		else if(total>=41 && total<=50)
			System.out.println("AB Grade");
	   }
	}
	else 
		System.out.println("Fail");
	}
	public static void main(String[] args) {
		Grades g=new Grades();
		int totalMark=34;
		g.enterMarks(totalMark);
		
	}

	
}
