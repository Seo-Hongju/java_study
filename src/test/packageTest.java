package test;

class Circle{	
	private int age;
	
	void func() {
		age = 10;
	}
	public void accAge(int param) {
		age = param;
	}
}

class Ractangle{
	void acc() {
		Circle c = new Circle();
		//c.age = 20;
		c.accAge(20);
	}	 
}

public class packageTest {

	public static void main(String[] args) {
				

	}

}
