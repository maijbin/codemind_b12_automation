package day7;

import java.util.Scanner;

public class taking_input_after_runthe_program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter number"); // asking int value
		int num=sc.nextInt();
		System.out.println(num);
		*/
		
		/*
		System.out.println("enter decimal number");  // asking double value
		double num=sc.nextDouble();
		System.out.println(num);
		*/
		
		System.out.println("Enter your city:");
		String city=sc.next();
		System.out.println("your city is:"+city);
	}

}
