package ex08class;

/*
해당 예제에서는 Human클래스를 외부파일로 선언하였다. 
동일한 패키지에 정의된다면 컴파일러는 해당 클래스를 찾아서
객체화 할수 있다. 만약 다른 패키지에 정의되면 import선언을
반드시 해야 한다. 
 */
public class HumanMain {
	
	public static void main(String[] args) {
		
		//1.객체생성
		Human human = new Human();

		//2.객체의 초기화
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;

		//3.멤버메소드를 통해 상태등 행동을 구현
		human.showState();
		human.eat();
		human.walk();
		human.thinking();
		human.showState();

		//4.에너지를 고갈시켜보자
		for(int i=1 ; i<=20 ; i++) {
			human.walk();
		}
		human.showState();

		//5.에너지가 최대치를 넘도록 해보자
		for(int i=1 ; i<=20 ; i++) {
			human.eat();
		}
		human.showState();
		
	}

}
