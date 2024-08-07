package day5;

public class WhilevsDowhile {

	public static void main(String[] args) {
		int i=10;     // if condition not satisfied while not show output but dowhile show
		/*while(i<=5) {
			System.out.println(i);
			i++;
		}*/
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=5);

	}

}
