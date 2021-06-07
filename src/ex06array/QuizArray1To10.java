package ex06array;
/*
문제2) 파일명 : ex06array.QuizArray1To10.java
다음 절차에 따라 프로그램을 작성하시오.
1. 크기가 10인 정수타입의 배열을 선언한다.
2. 반복문을 이용하여 배열을 채운다. 
이때 배열은 1,2,3,4....순서대로 채운다.
3. 2번에서 채운 배열을 출력한다.
4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
5. 누적해서 더한 값을 출력한다. 

 */
public class QuizArray1To10 {

	public static void main(String[] args) {

		//크기10인 배열생성
		int[] arr = new int[10];
		
		//크기만큼 반복해서 1~10까지 채움
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		
		//배열의 초기화가 잘 되었는지 출력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		//배열 크기만큼 반복해서 누적합을 구하라
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("배열전체요소의합:"+ sum);		
		
	}

}
