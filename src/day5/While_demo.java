package day5;

public class While_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		/*while(i<=10)
		{
			System.out.println(i);
			i++;
		}*/
		/*while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}*/
		/* i=2
		while(i<=10)
		{
			System.out.println(i);
			i+=2;  //approach 1: print even number between 1 to 10
		}*/
		
		while(i<=10)
		{
			if(i%2==0)  // approach 2
			{
			System.out.println(i + "Even");
			}
			i++;
			}
		
		 
	}

}
