package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_demo {

	public static void main(String[] args) {
		//Declaration
		
		//ArrayList al=new ArrayList();
		
		List mylist=new ArrayList();
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add('A');
		mylist.add(true);
		mylist.add("java");
		
		System.out.println("Size of arraylist is: "+mylist.size()); // size
		System.out.println("Values in arraylist are:"+mylist);// to print
		mylist.set(4, "Python"); //replace
		System.out.println("After replacing:"+mylist);
		System.out.println(mylist.get(2));  //getting data by using index
		
		//reading data
		/*Approch 1
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		Approach 2
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		//using iterator
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
		 	System.out.println(it.next());
		}
		//chceking list is empty or not
		System.out.println(mylist.isEmpty());
		
		//mylist.removeAll(mylist); remove all elements
		// remove specific but multiple elements
		List mylist2=new ArrayList();
		mylist2.add("Python");
		mylist2.add('A');
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);

	}

}
