package test;

public class Quiz01 {
	static String strCount(String compStr, String findStr)
	{
		/*
		"12345AB12AB345ABAB345ABAB345ABAB345ABAB345AB"
		 */
		int startIndex = 0;
		int strCount = 0;
		while(true) {
			int idx = compStr.indexOf(findStr, startIndex);
			if(idx==-1) {
				break;
			}
			else {
				startIndex = idx + 1;
				strCount++;
			}			
		}
		
		return findStr+"의 갯수는:"+strCount;
		
		
//		StringBuffer sb = new StringBuffer
//		(
//			String.format("문자열 "+ str1 +"에서 "+ str2 +"의 갯수 : ")
//		);
//		
//		int count = 0;
//		int x = 0;
//		for(int i=1 ; i<=5 ; i++)
//		{
//			if(str1.indexOf(str2,x) != -1);
//			{
//				x += (str1.indexOf(str2,x)+ 1);
//				count++;
//			}
//		}
//		return sb.append(count);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(strCount("12345AB12AB345AB","AB"));
		System.out.println(strCount("12345","AB"));
	}

}
