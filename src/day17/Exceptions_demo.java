package day17;

import java.util.Scanner;

public class Exceptions_demo {

	public static void main(String[] args) {
		System.out.println("Program is started");
		Scanner sc=new Scanner(System.in);
		
		/*Example 1
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(100/num);  //num 0 then it will give airthmatic exception
		*/
		
		/*Example 2
		int a[]=new int[5];
		
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		System.out.println("Enter a value");
		int value=sc.nextInt();
		a[pos]=value;
		System.out.println("Program is completed");
		*/
		
		/* Example 3
		String s="12345";    //instead of number if write string it will throug expt
		int num=Integer.parseInt(s);
		System.out.println(num);
		System.out.println("Program is completed");
		*/
		
		//Example 4
		String s="Welcome"; // if we write null then null pointer expt
		System.out.println(s.length());
		System.out.println("program is completed");
	}

}
