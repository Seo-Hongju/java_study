package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//사용자정의 예외처리 클래스
class OutOfRange100Exception extends Exception {
	public OutOfRange100Exception() {
		super("[예외발생]1~100사이의 숫자를 입력하세요");
	}
}

public class QuUpDownGameException {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		//boolean isSuccess = false;
		int restart;
		boolean forEnd = false;

		
		// 무한루프안에서 사용자가 7번안에 맞추는지
		while (true) {			
			try {			
				// 난수생성
				int computerNum = random.nextInt(1000) % 100 + 1; // 1~100까지 랜덤으로
				System.out.println(computerNum);
	
			
				for (int i = 1; i <= 7; i++) {
	
					System.out.print("1~100까지 숫자입력:");
					int userNum = scan.nextInt();
									
					try {
						//사용자정의 예외처리
						if(userNum<1 || userNum>100) {
							OutOfRange100Exception outExc = 
									new OutOfRange100Exception();
							throw outExc;
						}	
					}
					catch (OutOfRange100Exception e) {
						System.out.println(e.getMessage());
					}
	
					// 성공실패
					if (userNum > computerNum) {
						System.out.println("Down, 더 낮은 숫자입니다.");
					}
	
					else if (userNum < computerNum) {
						System.out.println("Up, 더 높은 숫자입니다.");
					}
	
					else {
						System.out.println("일치합니다.");
						//isSuccess = true;
						System.out.println(i+"번 안에 성공");
						System.out.println("-----------------------");
						
						forEnd = true;
						
						//for문 탈출
						break;
						 
					}//else(userNum == computerNum)	
	
				} // 재시작for
				
				if(forEnd == false) {
					System.out.println("실패");
				}
				
				while(true) {
					System.out.println("-----------------------");
					System.out.println("게임재시작(1), 종료(0) ");
					System.out.print("재시작여부를 입력하세요:");
					restart = scan.nextInt();
					// 0,1 이 입력되었을때 탈출
					if (restart == 0) {
						return;
					} else if (restart == 1) {
						System.out.println("게임 재시작!");
						break;
					} else {
						System.out.println("잘못입력해씸..");						
					}
				}
			}
			catch (InputMismatchException e) {
				/*
				숫자를 입력하는 지점에서 문자를 입력하는 경우 게임의 재시작을
				물어보면 안되고, 게임 자체가 문제가 생겼으므로 재시작해야 한
				 */
				System.out.println("[예외발생]문자는 입력할 수 없음");
				System.out.println("처음부터 게임을 재시작 합니다.");
				scan.nextLine();//버퍼날림
			}//try~catch end
		}// while end
	}// main end
}//class end






