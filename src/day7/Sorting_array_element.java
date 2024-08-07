package day7;

import java.util.Arrays;

public class Sorting_array_element {

	public static void main(String[] args) {
		
		int a[]= {400,900,300,700,100,500,200};
		
		System.out.println("Before Sorting.......");
		System.out.println(Arrays.toString(a));  //just for printing array values
		/*
		for(int value:a)
		
		{
			System.out.println(value);
		}*/
		
		Arrays.sort(a);
		System.out.println("After sorting........");
		System.out.println(Arrays.toString(a));
		
		}

	}


