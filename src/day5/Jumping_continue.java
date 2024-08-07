package day5;

public class Jumping_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2<=0) // odd (i==5) skip only 5,(i%2==0) i=2 even number
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
