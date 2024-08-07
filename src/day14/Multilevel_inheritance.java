package day14;

class M
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class N extends M
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

class P extends N
{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		
		P object=new P();
		object.display();
		object.show();
		object.print();
		System.out.println(object.a);
		System.out.println(object.b);
		System.out.println(object.c);

	}

}
