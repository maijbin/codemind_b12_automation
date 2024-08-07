package day15;

class Test
{
	final int x=100;
}
final class Test1
{
	final void m()
	{
		System.out.println("this is m method from test1");
	}
}

/*class Test2 extends Test1
{
	void m()    // m is final method we cant use m again if it is final
	{
		System.out.println("this is m method from test1");
	}
}
*/
public class Final_keyword {

	public static void main(String[] args) {
		
		Test t=new Test();
		//t.x=500;
		System.out.println(t.x);
			}

}
