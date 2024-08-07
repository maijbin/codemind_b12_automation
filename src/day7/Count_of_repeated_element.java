package day7;

public class Count_of_repeated_element {

	public static void main(String[] args) {
		
		int a[]= {100,200,100,400,100,100,200};
		int num=400;
		int count=0;
			
		/*for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println(count);*/
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
				
		}
		System.out.println(count);

	}

}
