package review;

public class R02while_for {
	/*
	반복문
		while문 : 조건을 먼저 검사한후 참일때 while문의 루프를
			반복하는 반복문. 조건에 맞지 않으면 단 한번도 실행
			되지 않을수 있다. 
			형식]
				반복을 위한 초기식;
				while(조건식){
					실행문장;
					while을 탈출하기위한 증감식;
				}
		
		do~while문 : 조건검사없이 무조건 1번 실행후 조건을
			판단한다. 따라서 1번은 반드시 실행되는 문장인경우
			사용한다. 
			형식)
				초기식;
				do{
					실행문;
					증감식;
				}while(조건식); <- 세미콜론이 반드시 들어감.
		
		for문 : 반복의 횟수가 일정하게 정해져있을때 주로 사용하는
			반복문. 반복의 횟수가 명확하지 않다면 while문을
			사용하는것이 좋다. 
			형식)
				for(초기화식 ; 조건식 ; 증감식){
					실행문;
				}
	 */
	public static void main(String[] args) {
		
		//1~10까지 누적합을 구하는 프로그램을 작성하시오.
		//(while문)
		int a = 1;
		int sum = 0;
		while(a<=10) {			
			sum += a;
			a++;
		}
		System.out.println("sum="+ sum);
		
		
		//1~10까지 누적합을 구하는 프로그램을 작성하시오.
		//(do~while문)
		int b = 1;
		int total = 0;
		do {
			total += b;
			b++;
		}while(b<=10);
		System.out.println("total="+ total);
		
		
		//1~10까지 누적합을 구하는 프로그램을 작성하시오.
		//(for문)
		int hap = 0;
		for(int c=1 ; c<=10 ; c++) {
			hap += c;
		}
		System.out.println("hap="+ hap);
		
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 
		경우를 모두 출력하는 프로그램을 for문과 if문을 이용하여 
		작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		System.out.println("for문을 이용한 주사위문제 구현");
		for(int i=1 ; i<=6 ; i++) {
			for(int j=1 ; j<=6 ; j++) {				 
				if((i + j)==6) {
					System.out.printf("%d+%d=%d%n",i,j,(i+j));					
				}				
			}			
		}
		
		
		/*
		위 주사위 문제를 do~while문으로 변경하시오.
		 */
		int m=1;//바깥while문
		do {
			int n=1;//안쪽while문
			do {
				if(m+n==6) {
					System.out.println(m +"+"+ n +"="+ (m+n));
				}
				
				n++;
			}while(n<=6);	
			
			m++;
		}while(m<=6);
		
		
		/*
		연습문제] 방정식 2x+4y=12를 만족하는 모든 x,y값을 
		구하시오. 단, x,y의 범위는 0~10사이의 정수이고 
		while문을 통해 구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */
		int x=0;
		while(x<=10) {
			int y=0;
			while(y<=10) {
				if(2*x + 4*y == 12) {
					System.out.printf("2x+4y=12만족하는"
						+ "x,y값:%d,%d\n", x, y);
				}
				y++;
			}			
			x++;
		}
		
		/*
		연습문제] 1-2+3-4+5- ..... +99-100 의 합계를 구하는 
		프로그램을 작성하시오.(for문으로 작성)
		 */	
		int sw, hapsan = 0;
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==0) {
				//짝수일때는 마이너스
				sw = i * -1;
			}
			else {
				//홀수일때는 플러스
				sw = i;
			}						
			hapsan += sw;
		}
		System.out.println("1-2+3-4.....-100의합은?"+
				hapsan);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
