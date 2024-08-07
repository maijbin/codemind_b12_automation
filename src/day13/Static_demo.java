package day13;

public class Static_demo {

	static int a=10;
	int b=20;
	static void m1()
	{
	System.out.println("this is static method....");	
	}
	
	void m2()
	{
		System.out.println("this is non static methd");
	}
		public static void main(String[] args) {
	
		System.out.println(a);
		m1();
		Static_demo st=new Static_demo();
		st.m2();
System.out.println(st.b);

	}

}
