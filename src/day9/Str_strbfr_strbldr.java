package day9;

public class Str_strbfr_strbldr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		s.concat("to java");  //immutable can not change
		System.out.println(s);
		
		StringBuffer b=new StringBuffer("mahi");
		b.append("to java");  //mutable can change
		System.out.println(b);
		
		StringBuilder a=new StringBuilder("arsh");
		a.append("is good boy");
		System.out.println(a);
		

	}

}
