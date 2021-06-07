package ex04controlstatement;

public class If02 {
	
	/*
	if문
		형식2]
			if(조건){
				조건이 참일때 실행문장;
			}
			else{
				조건이 거짓일때 실행문장;
			}
	 */
	public static void main(String[] args) {

		int num = 100;
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
		String numberResult = 
				(num%2==0) ? "짝수" : "홀수";
		System.out.println("숫자 "+num+"은 "+ 
				numberResult+" 입니다.");
		
		/*
		시나리오] 숫자를 짝/홀수인지 먼저 판단한후, 
			100이상인지를 판단하는 프로그램을 작성하시오.
			실행결과]
				짝수이면서 100이상입니다.
				or
				홀수이면서 100미만입니다. 
		 */
		int number = 110;
		if(number%2 == 0) {
			//짝수일때
			if(number>=100) {
				//짝수이면서 100 이상인경우
				System.out.println(number+"는 "
						+ "짝수이면서 100이상입니다.");
			}
			else {
				//짝수이면서 100 미만인경우
				System.out.println(number+"는 "
						+ "짝수이면서 100미만입니다.");
			}
		}
		else {
			//홀수일때
			if(number>=100) {
				//홀수이면서 100 이상인경우
				System.out.println(number+"는 "
						+ "홀수이면서 100이상입니다.");
			}
			else {
				//홀수이면서 100 미만인경우
				System.out.println(number+"는 "
						+ "홀수이면서 100미만입니다.");
			}
		}
		
		
	}

}
