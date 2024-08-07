package day17;

import java.util.Scanner;

public class Handling_exception {

	public static void main(String[] args) {
		System.out.println("Program is started");
		Scanner sc=new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter a number");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num);  //num 0 then it will give airthmatic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid data");
		}
		System.out.println("Program is completed");
		

	}

}
