package day18;

class parent
{
	String name="john";
	void m1()
	{
		System.out.println("this is parent");
	}
}
class child extends parent
{
	void m2()
	{
		System.out.println("this is m2 from child");
	}
}

public class Typecasting_concept {

	public static void main(String[] args) {
		/* child c=new child();
		System.out.println(c.name);
		c.m1();
c.m2(); */
		
		parent p=new child(); // upcasting
		p.m1();
System.out.println(p.name);

	}

}
