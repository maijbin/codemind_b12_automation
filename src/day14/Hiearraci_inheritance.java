package day14;

class parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class child1 extends parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class child2 extends parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}
public class Hiearraci_inheritance {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.show(700);
		c1.display(900);
		
		child2 c2=new child2();
		c2.display(800);
		c2.print(600);

	}

}
