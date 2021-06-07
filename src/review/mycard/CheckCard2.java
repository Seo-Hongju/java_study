package review.mycard;

/*
체크카드 클래스 Ver.02

버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
 */
public class CheckCard2 {
	
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
	
	//초기화메소드
	public void initMembers(long c,String o,int b,int p) {
		cardNumber = c;
		owner = o;
		balance = b;
		point = p;		
	}
	//기본생성자, 인자생성자
	public CheckCard2() {}	
	public CheckCard2(long cardNumber, String owner, int balance, int point) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
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
		balance += amount;
		System.out.printf("[%s님 충전]%d원 완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
	}
	
	//결제
	public void payment(int amount) {
		balance -= amount;
		System.out.printf("[%s님 결제]%d원 출금완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
		//결제금액의 0.1% 포인트 적립
		savingPoint(amount);
	}	
	
	//적립 	
	public void savingPoint(int amount) { 
		int plusPoint = amount / 1000;
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

