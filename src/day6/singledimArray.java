package day6;

public class singledimArray {

	public static void main(String[] args) {
		// Approach 1
		
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;

		//Approach 2
		
		int b[]= {100,200,300,400,500,600};
		
		//find the length of an array
		
		System.out.println(a.length);
		System.out.println("Length of b array is: "+b.length);
		
		//Read single value from an array
		System.out.println(a[4]);
		System.out.println(b[5]);
		
		//Reading all values of array
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		
		//Enhanced for loop
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
