package javaSessions;

public class IncrementaAndDecrementalConcept {

	public static void main(String[] args) {
		//Post increment 
		//++
		
		int i=1;
		int j=i++;//first assign the value of i to j, then increment the value of i by 1.
		System.out.println(i); //2
		System.out.println(j); //1
		
		int m=-23;
		int n=m++;
		System.out.println(m); //-22
		System.out.println(n); //-23
		
		int a=0;
		int b=a++;
		System.out.println(a); //1
		System.out.println(b); //0
		
		int total=1;
		System.out.println(total++); /* 1 	here,output is 1,as execution happens from left to right, so java will print the value of
										total then it will perform increment operation)**/
		System.out.println(total); //2 as on line 25, the value of total has been incremented.
		
		System.out.println("************************");
		
		//2.Pre-increment
		
		int x=1;
		int y=++x; //first increment the value by 1 and then assign
		System.out.println(x); //2
		System.out.println(y); //2
		
		int q=-89;
		int w=++q; 
		System.out.println(q); //-88
		System.out.println(w); //-88
		
		int pop=0;
		System.out.println(++pop); //1
		System.out.println(pop);   //1
		
		System.out.println("**************************");
		
		//3.Post decrement
		
		int s=2;
		int d=s--;
		System.out.println(s); //1
		System.out.println(d); //2
		
		int f=-89;
		int g=f--;
		System.out.println(f); //-90
		System.out.println(g); //-89
		
		int food=-99;
		System.out.println(food--); //-99
		System.out.println(food);   //-100
		
		System.out.println("**************************");
		
		//4.Pre-decrement
		
		int h=2;
		int l=--h;
		System.out.println(h); //1
		System.out.println(l); //1
		
		int c=-23;
		int v=--c;
		System.out.println(c); //-24
		System.out.println(v); //-24
		
		int google=-1000;
		System.out.println(--google); //-1001
		System.out.println(google);   //-1001
		System.out.println(google++); //-1001
		System.out.println(++google); //-999
		
		int bal=500;
		int totalBal= bal++ + 10;
		System.out.println(totalBal); //510
		System.out.println(bal);      //501
		
		int bal1=500;
		int totalbal1=++bal1 + 10;
		System.out.println(totalbal1);
		System.out.println(bal1);
		
		boolean flag = true;
               
        //System.out.println(flag++);//increment/decrement can not be applied on boolean.
        
	}

}
