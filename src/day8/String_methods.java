package day8;

import java.util.Arrays;

public class String_methods {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		System.out.println(s.length()); //approach 1 for length
		System.out.println("mahi".length()); // approach 2 for length
		
		String s1="Arsh";
		String s2="is good boy";
		String s3="and healthy boy";
		
		System.out.println(s1+s2); // approach 1 we can use many strings by + sign
		System.out.println(s1.concat(s2));  // approach 2 at a time it will join 2 strings only
		System.out.println(s1.concat(s2).concat(s3)); // approach for concat methd for more than 2str
		System.out.println(s1.concat(s2+s3));
		System.out.println("Mahi is learning"+"Automation");
		
		String m="   mahi    ";
		System.out.println(m);
		System.out.println(m.length());
		System.out.println(m.trim().length());
		
		//charAt() returns a character from string based on index
		
		System.out.println(s.charAt(3));
		
		//contains() particular is part of main string or not
		System.out.println(s.contains("wel")); // case sensitive thatswhy false
		System.out.println(s.contains("Wel"));
		
		//Equals() , equalsignorecase(),  compare string
		
		s1="arsh";
		s2="Arsh";
		System.out.println(s1==s2);  // false bcoz case sensitive
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Arsh"));
		
		System.out.println(s1.equalsIgnoreCase(s2));  // true bcoz ignore
		
		//replace() - replace single or multiple sequence of characters
		
		s="welcome to java for learning java with selenium";
		
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.replace("to", "in"));
		
		//substring() 
		
		System.out.println(s.substring(8,10));
		System.out.println(s.length());
		
		// converting the cases upper and in lower
		String a="Arsh";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		//split
		
		a="mahi@gmail.com";
		String b[]=a.split("@");
		System.out.println(a.substring(0,4)); // the problem is we need to insert indexes
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		System.out.println(Arrays.toString(b));
		
		String amount="$15,70,80";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace(",", " "));
		System.out.println(amount.replace("$", "").replace(",", " "));
		
		String l="abc,123@xyx";
		String arr[]=l.split("@");
		
		System.out.println(Arrays.toString(arr));
		
		String name="John kenedy";
		System.out.println(name.contains("john"));  // false case sensitive
		System.out.println(name.replace("J","j").contains("john"));
		
		

	}

}
