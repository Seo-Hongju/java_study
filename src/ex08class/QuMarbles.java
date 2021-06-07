package ex08class;
class ChildProperty {
	//멤버변수
	int beadCnt;//보유한 구슬의 갯수
	
	//생성자
	public ChildProperty(int beadCnt) {
		this.beadCnt = beadCnt;
	}
	
	//멤버메소드
	public void showProperty() {
		System.out.println("보유 구슬의 개수:"+beadCnt); 
	}
	
	public void obtainBead(ChildProperty child, int oBead) {
		/*
		구슬을 획득하는 주체가 되는 어린이는 해당 함수를 호출한
		객체이므로 this를 사용하여 멤버변수를 증가시킨다.
		 */
		this.beadCnt += oBead;
		
		/*
		구슬을 잃는 어린이는 매개변수로 전달되는 객체이므로
		갯수만큼 차감한다. 
		 */
		child.beadCnt -= oBead;
	}	
}
public class QuMarbles {

	public static void main(String[] args) {
		
		//해당 클래스에 매개변수 1개인 생성자 호출하여 객체생성
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); //보유 구슬의 개수 20
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);
		

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}

}
