package day11;

public class Greetings {
	
	// Types of methods in java
	
	void m1()   // no parameters no return value
	{
		System.out.println("hello.....");
	}

	String m2()       // no parameters return some value
	{
		return("hello how are u?");
	}
	
	void m3(String name)  //some parameters no return value
	{
		System.out.println("hello"+name);
	}
	
	String m4(String name)  // parameters and return type
	{
		return("Hello"+name);
	}
}
