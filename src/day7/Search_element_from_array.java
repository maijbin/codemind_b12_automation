package day7;

public class Search_element_from_array {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int search_element=90;
		boolean status=false;   // not found if true found
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Elment Found:");
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
	System.out.println("element not found");
	}*/
		
		for (int x:a)   // enhanced for loop
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
