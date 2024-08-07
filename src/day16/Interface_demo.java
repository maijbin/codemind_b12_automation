package day16;

interface Shape
{
	int length=10;   // by default variables are static and final
	int width=20;
	
	void circle();   //abstract method
	
	default void square() // we can use only default, abstract and static methods inside the interface
	
	{
		System.out.println("this is square");
	}
	
	static void rectangle()
	{
		System.out.println("this is rectangle -static methd");
	}
}

public class Interface_demo implements Shape {

	public void circle()
	{
		System.out.println("This is circle-abstract method");
	}
	
	void triangle()
	{
		System.out.println("This is triangle");
	}
	
	public static void main(String[] args) {
		
		Interface_demo id=new Interface_demo();
		id.circle();
		id.square();
		Shape.rectangle();
		id.triangle();
		
		//Scenario 2
		Shape sp=new Interface_demo();
		sp.circle();
		sp.square();
		Shape.rectangle();
		

	}

}
