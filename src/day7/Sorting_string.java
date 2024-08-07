package day7;

import java.util.Arrays;

public class Sorting_string {

	public static void main(String[] args) {
		
		String s[]= {"mahi","arsh","javed","shaikh"};
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(s));
		
		char c[]= {'m','l','t','k','x','f','j'};
		
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
	
	
	

}
