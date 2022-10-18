package arrays;

public class staticArray {

	public static void main(String[] args) {
		/*int i=10;
		i=20*/;//10 got replaced with 20.
		
		//Declaring array
		
		//a.using new keyword
		int i[]=new int[4];//0-3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException:
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException:
		
		int len = i.length;
		int li = 0;
		int hi = len-1;
		System.out.println("hi is:"+hi);
		System.out.println("li is:"+li);
		System.out.println("length is:"+len);
		System.out.println("------------------");
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("------------------");
		
		//Print in reverse order
		for(int k=i.length-1;k>=0;k--) {
			System.out.println(i[k]);
		}
		System.out.println("------------------");
		int j[]=new int[5];
		j[4]=20;
		System.out.println(j[4]);
		System.out.println(j[0]);//0;default value of integer if assignment operation is not performed.
		System.out.println("------------------");
		
		System.out.println(i[0]+i[1]);
		
		System.out.println("------------------");
		
		double d[]=new double[2];//0-1
		System.out.println(d[0]);//0.0
		
		d[0]=12.33;
		d[1]=13.44;
		System.out.println(d[0]);
		System.out.println("------------------");
		char c[]=new char[3];//0-2
		c[0]='a';
		c[1]='b';
		c[2]='$';
		System.out.println(c[2]);
		System.out.println(c[0]+c[1]);//195 (ascii value of a and b got computed)
		System.out.println("------------------");
		
		
	}

}
