package day4;
/*
 * a>b and a>c -- a is largest
 * b>a and b>c -- b is largest
 * c>a and c>b -- c is largest
 */

public class Largest_num {

	public static void main(String[] args) {
		
		int a=10,b=50,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c)	
		{
			System.out.println("b is largest number");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is largest number");
		}
	}

}
