package ex08class;
/*
연습문제] 은행계좌를 추상화 해보자
	멤버변수 : 예금주(name)
			계좌번호(accountNumber)
			잔고(balance)
			
	멤버메소드 : 입금하다(deposit())
	 		출금하다(withdraw())
	 		계좌잔고 출력하기(showAccount())
	
	조건1 : 입금은 무제한으로 가능함
	조건2 : 잔고가 부족할 경우에는 출금불능 처리
 */
class Account {
	//멤버변수
	String name;//예금주
	String accountNumber;//계좌번호
	int balance;//잔고
	
	//생성자 
	
	//멤버메소드
	void deposit(int money){//입금하다()
		balance += money;
		System.out.println(money+"원이 입금되었습니다");
	} 
	void withdraw(int money){//출금하다()
		
		if(balance>=money) {
			//출금처리
			balance -= money;
			System.out.println(money+"원이 출금되었습니다");
		}
		else {
			//출금불가
			System.out.println("잔액부족으로 출금불가");
		}
		
	}  
	void showAccount(){//계좌잔고 출력하기()
		System.out.println("예금주:"+name);
		System.out.println("계좌번호:"+accountNumber);
		System.out.println("잔액:"+balance);
	}
	
	//초기화 메소드
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}


public class AccountMain {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		account1.name = "홍길동";
		account1.accountNumber = "123-45-67890";
		account1.balance = 10000;
		account1.deposit(5000);
		account1.withdraw(8000);
		account1.withdraw(10000);
		account1.showAccount();
		
		Account account2 = new Account();
		account2.init("홍길순", "999-777-12334", 1000);
		account2.deposit(9000);
		account2.withdraw(7000);
		account2.showAccount();
	}

}





