package day18;

public class Multiple_catch {

	public static void main(String[] args) {
		System.out.println("Program started");
		//Scanner sc=new Scanner(System.in);
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		/*catch(NullPointerException e)
		{
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException a)
		{
			System.out.println("Exception handled");
		}
		*/
		catch(Exception e)
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}

	}

}
