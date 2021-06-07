package ex07string;
/*
문제2] 파일명 : QuStringBuffer.java
1. String str1 = "ABCDEFGHI";
이 문자열을 역순으로 다시 출력하는 프로그램을 작성하자.

2. String str2 = "1234567-1212121"
위 문자열에서 중간에 삽입된 하이픈(-)을 삭제하는 
인스턴스를 생성해보자.

-위 1,2번은 하나의 파일에서 동시에 구현하면 된다. 

 */
public class QuStringBuffer {

	public static void main(String[] args) {
		
		String str1 = "ABCDEFGHI";
		StringBuffer sb1 = new StringBuffer(str1);
		System.out.println("거꾸로출력:"
				+sb1.reverse());
		
		
		String str2 = "1234567-1212121";
		StringBuffer sb2 = new StringBuffer(str2);
		System.out.println("하이픈 삭제후 출력:"
				+sb2.deleteCharAt(str2.indexOf("-")));
				
	}

}



