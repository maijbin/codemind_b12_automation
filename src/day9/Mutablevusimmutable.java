package day9;

import java.util.Arrays;

public class Mutablevusimmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,10,60,30,40,50};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); // mutable we can change
		
		System.out.println(Arrays.toString(a));

		String s=new String("welcome");
		s.concat("to java"); // immutable we can not change
		System.out.println(s);
	}

}
