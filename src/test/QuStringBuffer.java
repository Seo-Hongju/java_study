package test;

public class QuStringBuffer {
	public static void main(String[] args) {

		
		String str12 = "12345AB12AB345AB22";
		String[] aArr = str12.split("AB");
		System.out.println(aArr.length);
		
		System.out.println("===============");
		
		
		
		String str1 = "ABCDEFGHI";
		
		String str1Reverse = "";
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
			str1Reverse = str1Reverse+ str1.charAt(i);
		}
		System.out.println(str1Reverse);
		System.out.println("===============");
		
		
		
		StringBuffer sb1 = new StringBuffer(str1);
		System.out.println("거꾸로출력:"
				+sb1.reverse());
		System.out.println("===============");
		String str2 = "1234567-1212121";
		
		String str2NoH = str2.replace("-", "");
		System.out.println(str2NoH);
		System.out.println("===============");
		StringBuffer sb2 = new StringBuffer(str2);
		System.out.println("하이픈 삭제후 출력:"
				+sb2.deleteCharAt(str2.indexOf("-")));


		

		

	}

}
