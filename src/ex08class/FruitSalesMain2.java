package ex08class;

//과일판매자를 정의한 클래스
class FruitSeller2{
	
	int numOfApple;
	int myMoney;
	int apple_price;/*
		1차버전에서 상수였던 단가를 변수로 변경함. 
		'상수'의 경우에는 단 한번만 초기화 되는 특성상
		언제든 호출이 가능한 초기화메소드에서는 초기화
		할수 없다. 
	*/
  
	/*
	1차버전에서는 멤버변수의 초기화가 고정값이었다면, 
	2차버전에서는 초기화 메소드를 통해 멤버변수를 초기화
	한다. 
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	/*
	사과를 판매하기 위한 멤버메소드
	
	1.매개변수를 통해서 금액을 받는다. 
	 */
	public int saleApple(int money) {
		//2.금액에 해당하는 사과의 갯수를 구함
		int num = money / apple_price;
		//3.사과에 갯수만큼 차감한다. 
		numOfApple -= num;
		//4.판매수익금이 증가한다. 
		myMoney += money;
		//5.구매자에게 판매한 사과의 갯수를 반환한다. 
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

//과일구매자를 정의한 클래스
class FruitBuyer2{
	
	int myMoney;
	int numOfApple;
	
	/*
	초기화메소드 : 멤버변수를 초기화할때 사용한다. 2차버전
		에서는 생성자 대신 사용하고 있다.  
	 */
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	/*
	사과를 구매하는 행위를 표현한 멤버메소드
	
	1.판매자에게 금액을 지불한다.(매개변수로 전달)
	 */
	public void buyApple(FruitSeller2 seller, int money) {
		/*
		 2.판매자가 금액에 해당하는 사과의 갯수를 반환하면
		 그 값을 통해 보유한 사과의 갯수를 증가시킨다.
		 */
		numOfApple += seller.saleApple(money);
		//3.판매자에게 지불한 금액만큼 보유금액을 차감한다. 
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class FruitSalesMain2 {
	
	public static void main(String[] args) {
		
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);

		//판매자2
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);

		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);

		//해당 객체의 초기상태를 출력함.
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		//판매자1, 판매자2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
