package day6;

public class two_dim_array {

	public static void main(String[] args) {
		// approach 1
		
		int a[][]= new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//Approach 2
		
		int b[][]= {{100,200},{300,400},{500,600},{700,800}};
		
		//Find size of an array
		
		System.out.println("Length of rows:"+a.length);
		System.out.println("Length ofcolumns: "+a[0].length);
		System.out.println(b.length);
		System.out.println(b[0].length);
		
		//read single value
		
		System.out.println(a[2][0]);
		System.out.println(b[3][1]);
		
		//read all the rows and columns
		
		for(int r=0;r<=3;r++) // we use r<=length-1
		{
			for(int c=0;c<=1;c++) // we can use c<=a[r].length-1
			{
				System.out.print(b[r][c]+" ");
			}
			System.out.println();
		}
		
		//Enhanced for loop
		for(int arr[]:b)
		{
		for(int x:arr)
		{
			//System.out.println(x); // output shows in single line
			System.out.print(x+" "); // output will show in tabular format
		}
		System.out.println(); // extra print for tabular not for single line
		}
	}

}
