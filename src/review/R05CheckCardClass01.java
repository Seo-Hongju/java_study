package review;

import review.mycard.CheckCard1;
import review.mycard.CheckCard2;
import review.mycard.CheckCard3;

public class R05CheckCardClass01 {

	public static void main(String[] args) {
		
		//체크카드 클래스 Ver.01
		CheckCard1 cc1 = new CheckCard1();
		/*
		멤버변수 초기화 : public으로 선언되어 있으므로 다른
			패키지에서도 멤버변수에 접근가능함.
		 */
		cc1.owner = "홍길동";
		cc1.cardNumber = 1234_2222_3333_4444L;/*
			숫자를 표현할때 구분자로 언더바(_)를 사용할수있다.
			JDK7.0부터 지원되었으며 숫자사이에 쓰는것만 
			허용된다. 
			잘못된사용법]
				3._1415 or 123_456_ or _123_456 
				위와같이 언더바로 시작하거나 끝날수 없으며
				소수점과 같이 사용할수도 없다. 				
		*/
		cc1.balance = 10000;
		cc1.point = 0;
		
		cc1.payment(5000);//5000원 결제		
		cc1.payment(10000);//10000원 결제
		cc1.showState();//현재상태보기
		
		
		//체크카드 클래스 Ver.02
		CheckCard2 cc2 = new CheckCard2();
		
		//인자생성자를 통한 객체 초기화
		CheckCard2 cc3 = new CheckCard2(9876_6543_1234_5678L,
				"김말똥", 3000, 0);
		
		//기본생성자를 통해 생성한 객체를 초기화메소드로 초기화
		cc2.initMembers(1111_2222_3333_4444L, "이말년",
				10000, 0);
		
		//카드사용 및 충전
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();
		
		cc3.charge(50000);
		cc3.payment(15000);
		cc3.showState();	
		
		//멤버변수가 private으로 선언되었으므로 외부에서 접근불가
		//cc2.balance = 1000;
		//cc3.owner = "아무개";
		//정보은닉된 멤버 접근시에는 setter를 통해서 접근해야함
		cc2.setBalance(1000);
		cc3.setOwner("아무개");
		cc2.showState();
		cc3.showState();
		
		
		
		//체크카드 클래스 Ver.03
		CheckCard3 cc4 = 
				new CheckCard3(123_4567_8901_2345L,
						"객체생성불가", 1000, 0);
		cc4.payment(3000);
		cc4.showState();
		
		CheckCard3 cc5 = 
				new CheckCard3(1111_2222_3333_4444L, 
						"정상카드", 5000, 0);
		cc5.payment(30000);//결제불가
		cc5.charge(25000);//10000원 단위 아니므로 충전불가
		cc5.charge(30000);//정상충전
		cc5.payment(30000);//정상결제
		cc5.showState();
	}
}


