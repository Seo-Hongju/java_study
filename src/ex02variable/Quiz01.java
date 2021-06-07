package ex02variable;
/*
문제1] 파일명 : Qu_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 
변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
5.평균값을 구해서 출력하시오. 단 실수로 출력하시오.
실행결과 
 	국어점수:XX점, 수학점수:XX점, 영어점수:XX점
 	3과목의 총점은 : XXX점
 */
public class Quiz01 {

	public static void main(String[] args) {
		
		//1.변수선언 : 국어, 영어, 수학, 총점
		int kor, eng, math, totalScore;
		
		//2.변수 초기화
		kor = 89;
		eng = 99;
		math = 78;
		
		//3.총점을 구해서 변수에 대입
		totalScore = kor + eng + math;
		
		//4.출력
		System.out.println("국어:"+kor+",영어="+eng
				+", 수학:"+math);
		System.out.printf("총점:%d\n", totalScore);
		
		//5.평균
		System.out.println("평균1:"+(totalScore/3));
		
		//정수와 정수의 연산결과를 실수로 형변환 : 정수
		System.out.println("평균2:"+
				(double)(totalScore/3));
		
		//실수와 정수의 연산결과 : 실수
		System.out.println("평균3:"+
				((double)totalScore/3));
		System.out.println("평균4:"+
				(totalScore/3.0));
		
		//소수점 이하 자리수 결정하기 
		double avg = (double)totalScore / 3;
		System.out.printf("평균:%9.3f\n", avg);
		System.out.printf("평균:%-9.3f\n", avg);
		
	}

}




