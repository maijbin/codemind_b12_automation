package day6;

public class Object_type_array {

	public static void main(String[] args) {
		// By using object type array we can store multiple type of data|
		
		Object a[]= {100,"mahi",10.25,'a',true};
		
		for(Object x:a)
		{
			System.out.println(x);
		
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}

	}

}
