package ex09package.korea.buyer;

import ex09package.korea.seller.FruitSeller4;

//과일구매자를 정의한 클래스
public class FruitBuyer4{
	
	int myMoney;	//보유금액
	int numOfApple; //보유한 사과의 갯수
	
	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	/*
	사과를 구매하는 행위를 표현한 멤버메소드
	 */
	public void buyApple(FruitSeller4 seller, 
									int money) {		
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}
