package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissorsGameException {

	//로직1
	public static void rpsGameStart1() {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;//게임의 횟수를 카운트하기 위한 변수
				
		while(true) {
		
			//1.난수생성 - 컴퓨터입장의 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1;//1~3사이의난수생성
			System.out.println("컴퓨터:"+ com);
			
			try {
				//2.사용자 입력
				System.out.println("가위바위보를 입력하세요");
				System.out.println("가위(1),바위(2),보(3)=>");
				int user = scanner.nextInt();
			
			
				//3.승부판단 및 결과출력
				if( !(user<1 || user>3) ) {
					//정확하게 입력했을때 승부를 판단
					System.out.printf("사용자:%s, 컴퓨터:%s ",
							displayRPS(user), displayRPS(com));
					
					//승부판단로직
					switch(user - com) {
					case 0:
						System.out.println("비겼습니다");break;
					case 1: case -2:
						System.out.println("이겼습니다");break;
					case -1: case 2:
						System.out.println("졌습니다");break;
					}
					
					//게임카운트 증가
					gameCount++;
				}
				else {
					System.out.println("가위바위보 할줄 모름??븅신~");
				}
						
				//6.5번의 게임이 되었는지 판단후 재시작/종료 확인
				if(gameCount>=5) {
					
					int restart;
					while(true) {
						System.out.print("게임재시작(1), 종료(0):");
						restart = scanner.nextInt();
						if(restart==0 || restart==1) {
							//정상입력이면 루프탈출
							break;
						}
						else {
							System.out.println("잘못입력해씸ㅜㅜ\n");
						}
					}								
					if(restart==0) {
						//게임종료를 위해 while루프 탈출
						break;
					}
					else {
						System.out.println("게임 재시작^^");
						gameCount=0;
					}
				}			
			}
			catch(Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
				//버퍼에 남아있는 엔터키 제거(소멸시킴)
				scanner.nextLine();
			}
		}	
	}	
	
	//로직2
	public static void rpsGameStart2() {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;//게임의 횟수를 카운트하기 위한 변수
		
		while(true) {
		
			//1.난수생성 - 컴퓨터입장의 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1;//1~3사이의난수생성
			System.out.println("컴퓨터:"+ com);
			
			//2.사용자 입력
			System.out.println("가위바위보를 입력하세요");
			System.out.println("가위(1),바위(2),보(3)=>");
			int user = scanner.nextInt();
			
			//3.승부판단 및 결과출력
			if( !(user<1 || user>3) ) {
				//정확하게 입력했을때 승부를 판단
				System.out.printf("사용자:%s, 컴퓨터:%s ",
						displayRPS(user), displayRPS(com));
				
				//승부판단로직
				if(com==1 && user==1){
					System.out.print("사용자:가위,컴퓨터:가위\n비겼습니다.\n");
				}
				if(com==1 && user==2){
					System.out.print("사용자:바위,컴퓨터:가위\n이겼습니다.\n");
				}
				if(com==1 && user==3){
					System.out.print("사용자:보,컴퓨터:가위\n졌습니다.\n");
				}
	
				if(com==2 && user==1){
					System.out.print("사용자:가위,컴퓨터:바위\n졌습니다.\n");
				}
				if(com==2 && user==2){
					System.out.print("사용자:바위,컴퓨터:바위\n비겼습니다.\n");
				}
				if(com==2 && user==3){
					System.out.print("사용자:보,컴퓨터:바위\n이겼습니다.\n");
				}
	
				if(com==3 && user==1){
					System.out.print("사용자:가위,컴퓨터:보\n이겼습니다.\n");
				}
				if(com==3 && user==2){
					System.out.print("사용자:바위,컴퓨터:보\n졌습니다.\n");
				}
				if(com==3 && user==3){
					System.out.print("사용자:보,컴퓨터:보\n비겼습니다.\n");
				}
				
				//게임카운트 증가
				gameCount++;
			}
			else {
				System.out.println("가위바위보 할줄 모름??븅신~");
			}
					
			//6.5번의 게임이 되었는지 판단후 재시작/종료 확인
			if(gameCount>=5) {
				
				int restart;
				while(true) {
					System.out.print("게임재시작(1), 종료(0):");
					restart = scanner.nextInt();
					if(restart==0 || restart==1) {
						//정상입력이면 루프탈출
						break;
					}
					else {
						System.out.println("잘못입력해씸ㅜㅜ\n");
					}
				}								
				if(restart==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				else {
					System.out.println("게임 재시작^^");
					gameCount=0;
				}
			}
		}	
	}	
	//가위 바위 보를 출력하는 메소드
	public static String displayRPS(int n) {
		String str = "";
		switch (n) {
		case 1:
			str = "가위";break;
		case 2:
			str = "바위";break;
		case 3:
			str = "보";break;
		}
		return str;
	}
	public static void main(String[] args)
	{
		//가위바위보 게임 메소드 호출
		rpsGameStart1();
		//rpsGameStart2();
	}
	
}



//승부판단1
/**/
