package day7;

import java.util.Scanner;

public class Taking_multiple_inputs_from_console {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number;");
		int num2=sc.nextInt();
		
		System.out.println("The addition is:"+(num1+num2));
		System.out.println("The multiplication is:"+(num1*num2));

	}

}
