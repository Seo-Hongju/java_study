package ex14usebasicclass;

/*
Math 클래스 
	: 수학관련 메소드를 제공하는 클래스로 모든 메소드가
	static으로 선언되어있다. 객체생성없이 바로 사용이 가능하다. 
 */
public class MathClass {
	public static void main(String[] args) {

		System.out.println("원주율:"+ Math.PI);

		float f = -3.14f;
		double d = -100.9;
		int num = -10;

		//절대값
		System.out.println("Math.abs:"+ Math.abs(f));
		System.out.println("Math.abs:"+ Math.abs(d));
		System.out.println("Math.abs:"+ Math.abs(num));

		/*올림값(무조건올림)
			: 소수점에서 큰 수로 가장 가까운 정수를 찾아서
			반환한다. 
		 */
		System.out.println("Math.ceil:"+ Math.ceil(3.4));
		System.out.println("Math.ceil:"+ Math.ceil(-3.4));//-3반환
		System.out.println("Math.ceil:"+ Math.ceil(3.9));

		/*내림값(무조건내림)
			: 소수점에서 작은수로 가장 가까운 정수를 찾아 
			반환한다. 
		 */
		System.out.println("Math.floor:"+ Math.floor(3.4));
		System.out.println("Math.floor:"+ Math.floor(-3.4));//-4반환
		System.out.println("Math.floor:"+ Math.floor(3.9));

		/*반올림
			: 무조건 소수점 첫째자리에서 반올림 처리하여 
			반환한다. 
		 */
		System.out.println("Math.round:"+ Math.round(3.49999));//버림처리
		System.out.println("Math.round:"+ Math.round(3.54444));//올림처리
		System.out.println("Math.round:"+ Math.round(-1.4));
		System.out.println("Math.round:"+ Math.round(-1.5));
		System.out.println("Math.round:"+ Math.round(-3.51));

		//최대 최소값
		System.out.println("Math.max:"+ Math.max(100, 99));
		System.out.println("Math.min:"+ Math.min(100, 99));

		//난수생성
		System.out.println((int)(Math.random()*45)+1);

	}
}
