package ex06array;
/*
문제1) 파일명 : ex06array.QuizNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 
저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 
몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

 */
public class QuizNumberCounter {

	public static void main(String[] args) {

		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		//answer 배열의 크기만큼 루프
		for(int i=0 ; i<answer.length ; i++) {
			
			//위 if~else문을 한줄로 바꾸면 다음과 같다.
			counter[answer[i]-1]++;
			
			
			/*if(answer[i]==1) {
				counter[0]++;
			}
			else if(answer[i]==2) {
				counter[1]++;
			}
			else if(answer[i]==3) {
				counter[2]++;
			}
			else if(answer[i]==4) {
				counter[3]++;
			}*/

		}
		
		for(int i=0 ; i<counter.length ; i++) {
			System.out.printf("counter[%d](%d)의갯수:%d %n"
					, i, i+1, counter[i]);
		}
		
	}

}







