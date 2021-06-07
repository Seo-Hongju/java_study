package test;

//요일을 표현하는 상수선언
interface WEEK_STR{
	int SUN=0, MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6;
}

public class ExCalendarVer01 {
	public static void main(String[] args) {
		
		System.out.println("2017년 켈린더");
		
		//각 월의 마지막날이 몇일인가??(2017년은 윤년이
		//아니므로 2월은 28일까지 있음.
		int[] lastDayOfMonth = {31, 28, 31, 30, 31, 30, 
			31, 31, 30, 31, 30, 31};
		
		//문제의조건 : 2017년 1월 1일은 일요일
		int firstDayOfYear = WEEK_STR.SUN;//0
		
		//요일을 출력하기 위한 배열선언
		String[] weekStr = {"SUN","MON","TUE","WED",
				"THU","FRI","SAT"};
		
		//매주의 시작은 일요일
		int monthStart = 0;
		
		//토요일이 되면 줄바꿈
		int weekNC = 0;		
		
		//1년은 12개월이므로 ... 
		for(int monCount=0 ; monCount<12 ; monCount++){
			
			//1월을 출력할때:2017/01/01을 일요일로 설정
			if(monCount==0){
				monthStart = firstDayOfYear;
			}
			else{
				//1월이 아닐때, 즉 2월부터 12월까지
				monthStart = weekNC;
			}
			
			//해당월 출력
			System.out.printf("\n%d월\n", monCount+1);
			
			//요일을 출력
			for(int wCnt=0 ; wCnt<weekStr.length ; wCnt++){
				System.out.printf("%s\t", weekStr[wCnt]);
			}
			System.out.println();//요일출력후 줄바꿈
			
			
			/*각 월의 시작이 일요일이 아니라면 
			그만큼 공백을 출력한다.*/
			for(int space=0 ; space<monthStart ; space++){
				System.out.printf("%c\t", ' ');
			}
			
			//날자를 출력
			for(int day=1;day<=lastDayOfMonth[monCount];day++){
				
				//본인의생일(11/15)을 출력
				if(monCount+1==11 && day==15){
					System.out.printf("%s\t","생일");
				}
				else{
					System.out.printf("%d\t", day);	
				}				
				
				//토요일이 되면 줄바꿈
				if(weekNC==6){
					System.out.println();
					weekNC = -1;//줄바꿈후 -1로 초기화
				}
				weekNC++;
			}
			System.out.println();
		}
	}
}






