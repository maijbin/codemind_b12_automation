package day3;

public class Operators_demo2 {

	public static void main(String[] args) {
		// increment operator
		
		int a=10;
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a++);
		
		int b=20;
		int res=++b;
		System.out.println(res);
		
		//ternary operators
		int x=200, y=300;
		int m=(x>y)? x: y;
System.out.println(m);
		int n=(x<y)? x: y;
		System.out.println(n);

	}

}
