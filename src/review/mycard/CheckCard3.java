package review.mycard;
/*
체크카드 클래스 Ver.03
: initMembers 초기화 메소드는 삭제처리 

1.충전은 10000원 단위로만 가능하다.
만약 5000원을 충전하면 충전불능으로 처리한다.

2.잔고가 부족하면 결제불능으로 처리해야 한다.

3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야
한다.

4.생성자 오버로딩 처리
	new CheckCard3(카드번호, 소유자, 잔고, 포인트);
	new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
	new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화

5.포인트 적립율 변경
	10만원 이하결재 : 0.1%적립
	10만원 초과결재 : 0.3%적립
*/
public class CheckCard3 {
	
	//멤버변수
	/*
	멤버변수를 private 접근지정자를 통해서 정보은닉 처리하면
	해당 클래스 외부에서는 절대로 접근할수 없다. 
	상속관계, 동일한 패키지, 동일한 파일내부 조차도 접근은 
	불가능하다. 
	 */
	private long cardNumber;
	private String owner;
	private int balance;
	private int point;
		
	//기본생성자, 인자생성자
	public CheckCard3() {}	
	public CheckCard3(long cardNumber, String owner, int balance, int point) {
		if(cardNumberRange(cardNumber)==true) {
			this.cardNumber = cardNumber;	
		}
		else {
			System.out.println("카드번호가 잘못되었습니다.");
			/*
			생성자메소드 내에서 return을 만나면 그 즉시 실행이
			종료된다. 즉 여기서는 해당 객체는 생성이 되지만
			멤버변수가 null인 상태로 생성되게 된다. 
			 */
			return;
		}
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	public CheckCard3(long cardNumber, String owner, 
			int balance) {
		if(cardNumberRange(cardNumber)==true) {
			this.cardNumber = cardNumber;	
		}
		else {
			System.out.println("카드번호가 잘못되었습니다.");
			return;
		}
		this.owner = owner;
		this.balance = balance;
		this.point = 0;//point는 무조건 0으로 초기화
	}
	public CheckCard3(long cardNumber, String owner) {
		if(cardNumberRange(cardNumber)==true) {
			this.cardNumber = cardNumber;	
		}
		else {
			System.out.println("카드번호가 잘못되었습니다.");
			return;
		}
		this.owner = owner;
		this.balance = 0;//balance 무조건 0으로 초기화
		this.point = 0;//point는 무조건 0으로 초기화
	}
	
	//카드번호 자리수가 16자리인지 체크하는 메소드
	public boolean cardNumberRange(long cn) {
		if(cn>=1000_0000_0000_0000L && 
				cn<=9999_9999_9999_9999L) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// getter / setter 메소드 정의
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//충전(입금)
	public void charge(int amount) {
		
		//amount가 10000원 단위인지 확인
		if(amount%10000==0) {
			balance += amount;
			System.out.printf("[%s님 충전]%d원 완료\n", owner, amount);
			System.out.printf("[잔고]%d원 입니다\n\n", balance);
		}
		else {
			System.out.println("10,000원 단위만"
					+ " 충전할 수 있습니다.");
		}		
	}
	
	//결제
	public void payment(int amount) {
		
		//결제금액이 잔고보다 크면 결재불가 처리
		if(balance>=amount) {
			balance -= amount;
			System.out.printf("[%s님 결제]%d원 출금완료\n", owner, amount);
			System.out.printf("[잔고]%d원 입니다\n\n", balance);
			//결제금액의 0.1% 포인트 적립
			savingPoint(amount);	
		}
		else {
			System.out.println("결제가 불가능합니다");
		}
	}	
	
	//적립 	
	public void savingPoint(int amount) { 
		
		int plusPoint = 0;
		
		if(amount>100000) {
			//결제금액이 10만원을 초과하는경우
			plusPoint = amount / 3000;
		}
		else {
			//10만원 이하인 경우
			plusPoint = amount / 1000;			
		}
		
		point += plusPoint;
		System.out.printf("[적립]%d포인트 완료\n", plusPoint);
		System.out.printf("[포인트잔액]%d 입니다\n\n", point);
	}	
	
	//현재상태출력
	public void showState() {
		System.out.println("=============================");
		System.out.println("카드번호:"+cardNumber);
		System.out.println("소유자:"+owner);
		System.out.println("잔고:"+balance);
		System.out.println("포인트:"+point);
		System.out.println("=============================");
	}	
}

