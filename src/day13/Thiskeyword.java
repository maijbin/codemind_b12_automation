package day13;

public class Thiskeyword {
	
	int x,y;
	
	Thiskeyword(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Thiskeyword th=new Thiskeyword(100,900);
		th.display();

	}

}
