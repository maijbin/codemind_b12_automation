package day9;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome";   // approach 1 for dynamic string
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
				
		}
		System.out.println(rev);
		
		String m="mahi";              // approach 2 for dynamic string
		String revr="";
		char a[]=m.toCharArray();
	
		for(int i=a.length-1;i>=0;i--)
		{
			
			revr=revr+a[i];
		}
		System.out.println(revr);
		
		StringBuffer s1=new StringBuffer("Arsh");  //built in
		System.out.println(s1.reverse());
		
		StringBuilder s2=new StringBuilder("Javed"); // built in
		System.out.println(s2.reverse());
	}

}
