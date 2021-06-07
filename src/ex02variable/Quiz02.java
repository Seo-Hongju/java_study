package ex02variable;
/*
연습문제] 반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면적을 저장하는 변수의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명]
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14
 */
public class Quiz02 {

	public static void main(String[] args) {
		
		int radius = 10;//반지름
		double pi = 3.14;//원주율
		final double PI = 3.14;//원주율
		
		//3가지 타입의 변수선언
		int area_int;
		float area_float;
		double area_double;
		
		//연산의 결과가 double형이므로 각각 Casting 필요함
		area_double = radius * radius * pi;
		area_float = (float)(radius * radius * pi);
		area_int = (int)(radius * radius * pi);
		
		System.out.println("int형 넓이:"+ area_int);
		System.out.println("float형 넓이:"+ area_float);
		System.out.println("double형 넓이:"+ area_double);

	}

}
