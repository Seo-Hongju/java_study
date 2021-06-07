package ex10accessmodifier;

//과일판매자를 정의한 클래스
class FruitSeller5{
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
  	/*
  	상수는 딱 한번만 초기화 되므로 일반적인 메소드에서는
  	초기화 할수 없다. 단, 생성자메소드에서는 초기화가
  	가능하다. 생성자 역시 딱 한번만 호출되고, 임의로 호출
  	할수 없기 때문이다. 
  	 */
	public FruitSeller5(int money, 
			int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	/*
	사과를 판매하기 위한 멤버메소드
	 */
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money; 
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

//과일구매자를 정의한 클래스
class FruitBuyer5{
	
	int myMoney;	//보유금액
	int numOfApple; //보유한 사과의 갯수
	
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	/*
	사과를 구매하는 행위를 표현한 멤버메소드
	 */
	public void buyApple(FruitSeller5 seller, 
									int money) {		
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class FruitSalesMain5 {
	
	public static void main(String[] args) {
		
		/*
		생성자를 통해 객체생성과 동시에 초기화를 진행하므로
		초기화메소드 호출없이도 객체를 생성할수 있다. 
		 */
		
		//보유금액0원, 사과갯수:100개, 단가:1000원
		FruitSeller5 seller1 = 
			new FruitSeller5(0, 100, 1000);
		//보유금액0원, 사과갯수:80개, 단가:500원
		FruitSeller5 seller2 = 
				new FruitSeller5(0, 80, 500);
		//구매자 : 보유금액:10000원, 사과갯수:0개
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		
		//객체의 초기상태 확인
		System.out.println("구매전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		/*
		아래의 코드는 문법적으로는 오류가 없으나 지불금액과
		구매갯수에 논리적 오류가 발생되어 코드를 통한 규칙이
		완전히 무너졌다. 이와같은 논리적 오류를 차단하기 위해
		객체지향에서는 "정보은닉" 하도록 권장하고 있다. 		
		 */
		seller1.myMoney += 1000;//판매자1에게 1000원 지불하고
		seller1.numOfApple -= 100;//사과 100개를 구매한다.
		
		seller2.myMoney += 500;//판매자2에게 500원 지불하고
		seller2.numOfApple -= 90;//사과 90개를 구매한다. 		
		
		
		
		
		System.out.println("구매후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}
}








