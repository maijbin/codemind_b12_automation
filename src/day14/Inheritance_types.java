package day14;

class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

public class Inheritance_types {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.display();
		obj.show();
		System.out.println(obj.a);

	}

}
