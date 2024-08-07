package day18;

public class Finally_block {

	public static void main(String[] args) {
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Catch block handled exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Entered in finally block");
		}
		System.out.println("Program completed");
	}

}
