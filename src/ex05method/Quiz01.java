package ex05method;

import java.util.Scanner;

/*
문제) 파일명 : ex05method.Quiz01.java
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 
반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 
정의하라.
메소드명 : circleArea() > 원의넓이, 
	circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름
실행예 :
---------- java ----------
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
--------------------------

 */
public class Quiz01 {
	
	//원의 넓이를 계산하여 반환하는 메소드
	static double circleArea(double rad) {
		double result;
		result = rad * rad * 3.14;
		return result;
	}
	
	//원의 둘레를 계산하여 반환하는 메소드
	static double circleRound(double rad) {
		return 2 * 3.14 * rad;
	}

	public static void main(String[] args) {
		
		System.out.print("원의 반지름 입력:");
		Scanner scanner = new Scanner(System.in);
		double radian = scanner.nextDouble();
		
		System.out.println("원의넓이:"+ 
				circleArea(radian));
		System.out.println("원의둘레:"+ 
				circleRound(radian));

	}

}
