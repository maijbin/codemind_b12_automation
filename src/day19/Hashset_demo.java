package day19;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Set;

public class Hashset_demo {

	public static void main(String[] args) {
		//Declaration
		
		HashSet<Comparable> myset=new HashSet<Comparable>();
		//Set myset=new HashSet();
		
		//HashSet <String>myset=new HashSet<String>();
		
		//Adding elements
		myset.add(100);
		myset.add(10.5);
		myset.add('A');
		myset.add("Mahi");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		myset.add(true);
		System.out.println(myset); //printing the data
		myset.remove(100);
		System.out.println(myset); // after removing
		//converting hashset to arraylist
		ArrayList al=new ArrayList(myset);  //inserting and accessing specific element 
		System.out.println(al);				//not possible by hashset
		System.out.println(al.get(3));
	
		

	}

}
