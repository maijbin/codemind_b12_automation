package day3;

public class Operators_demo {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		int a=20, b=10;
		System.out.println("Addition is:"+(a+b));
		System.out.println("substraction is:"+(a-b));
		System.out.println("multiplication is:"+(a*b));
		System.out.println("division is:"+(a/b));
		System.out.println("module division is:"+(a%b));
		
		//Relational comparison operators return either true or false
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// Logical Operators && || !
		boolean x=true, y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		System.out.println((10<20)&&(20>10));
		
	}

}
