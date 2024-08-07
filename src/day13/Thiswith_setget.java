package day13;

public class Thiswith_setget {
	
	int x,y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	public static void main(String[] args) {
		
		Thiswith_setget th=new Thiswith_setget();
		
		th.setX(500);
		System.out.println(th.getX());
		th.setY(500);
		System.out.println(th.getY());

	}

}
