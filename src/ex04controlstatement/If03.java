package ex04controlstatement;

public class If03 {
	
	/*
	if문
		형식3]
			if(조건1){
				실행문1;
			}
			else if(조건2){
				실행문2;
			}
			else{
				위 모든 조건이 거짓일때 실행할문장;
			}
	 */
	public static void main(String[] args) {
		
		/*
		시나리오] 국, 영, 수 점수의 평균을 구하여 학점을 
			출력하는 프로그램을 작성하시오. 90점이상 A학점, 
			....60점 미만은 F학점으로 판단하면 된다. 
		 */
		int kor=99, eng=70, math=64;
		double avg = (kor+eng+math) / 3.0;
		System.out.println("평균점수는 "+ avg +"점입니다.");
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고 ㅜㅜ;");
		}
		
		
		System.out.println("===================");
		
		/*
		※if~else 구문을 구성할때는 조건의 구간을 어떻게 
		설정하느냐에 따라 전혀 다른 결과가 나올수 있으므로
		주의해야 한다. 
		아래 if문은 높은 점수라 할지라도 60점 이상의 조건에 
		만족하기때문에 무조건 D학점이 출력되게 된다. 
		 
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고 ㅜㅜ;");
		}
		*/
		
		
		/*
		시나리오] 문자하나를 입력해서 숫자이면 "숫자", 
		알파벳이면 "알파벳"을 출력하고 둘다 아니라면 "듣보잡"을
		출력하는 프로그램을 작성하시오. 단 아스키코드를 모른다고
		가정한다. 
			출력]
				a => 알파벳
				4 => 숫자
				% => 듣보잡
		 */
		char chr = '7';// 혹은 '4', '%'
		if(chr>='0' && chr<='9') {
			//숫자인지판단
			System.out.printf("%c는 숫자", chr);
		}
		else if((chr>='a' && chr<='z') 
					|| (chr>='A' && chr<='Z')) {
			//알파벳인지판단
			System.out.printf("%c는 알파벳", chr);
		}
		else {
			//듣보잡
			System.out.printf("%c는 듣보잡", chr);
		}
		
		
		
		
		
		
	}

}
