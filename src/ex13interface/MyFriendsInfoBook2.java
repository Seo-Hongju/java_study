package ex13interface;

import java.util.Scanner;

/*
상속을 목적으로 정의한 클래스로 해당 클래스로는 객체를 생성하지
않는다. 
 */
class Friend2 {
	String name;	//이름
	String phone;	//전화번호
	String addr;	//주소
	public Friend2(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showBasicInfo() {
		//오버라이딩의 목적으로 정의된 메소드
		//(그래서 실행부가 없음)
	}
}
//고뒹친구
class HighFriend2 extends Friend2 {
	String nickname;//별명
	public HighFriend2(String name, String phone, String addr,
			String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	/*
	부모에서 생성된 메소드를 오버라이딩(재정의) 선언
	 */
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("이름"+ name);
		System.out.println("전번:"+ phone);
		System.out.println("주소:"+ addr);
		System.out.println("별명:"+ nickname);
	}
}
class UnivFriend2 extends Friend2	{
	String major;//전공과목
	public UnivFriend2(String name, String phone, String addr,
			String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phone);
		System.out.println("사는곳:"+ addr);
		System.out.println("전공:"+ major);
	}
}
public class MyFriendsInfoBook2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		상속관계에 있어 Friend클래스는 최상위 클래스이므로
		해당 객체배열에 하위 클래스의 객체를 한꺼번에 저장할수
		있다. 상위클래스의 객체가 하위클래스의 객체를 참조할수
		있다는 "다형성" 개념을 활용한 방법이다. 
		 */
		Friend2[] friArr = new Friend2[100];
		//객체배열의 index로 사용할 변수
		int frIndex = 0;
		
		String iName,iPhone,iAddr,iNickname,iMajor;

		for (int i = 0; i < 2; i++) {
			System.out.println("==고딩 친구를 입력하세요==");
			System.out.print("이름:");iName = scan.nextLine();
			System.out.print("전화번호:");iPhone = scan.nextLine();
			System.out.print("주소:");iAddr = scan.nextLine();		
			System.out.print("별명:"); iNickname = scan.nextLine();
			HighFriend2 high =
					new HighFriend2(iName, iPhone, iAddr, iNickname);
			//high.showBasicInfo();
			/*
			frIndex의 초기값은 0이므로, 0번 index에 데이터가
			저장된후 +1 증가한다. 
			 */
			friArr[frIndex++] = high;
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("==대딩 친구를 입력하세요==");
			System.out.print("이름:");iName = scan.nextLine();
			System.out.print("전화번호:");iPhone = scan.nextLine();
			System.out.print("주소:");iAddr = scan.nextLine();		
			System.out.print("전공:"); iMajor = scan.nextLine();
			UnivFriend2 univ =
					new UnivFriend2(iName, iPhone, iAddr, iMajor);
			//univ.showBasicInfo();
			friArr[frIndex++] = univ;
		}
		
		/*
		주소록에 저장된 모든 친구정보를 출력한다. 친구의 구분에
		상관없이 showBasicInfo() 메소드를 호출하면 오버라이딩
		처리된 가장 하위의 메소드가 호출되므로 별도 처리는
		필요없다.
		 */
		for (int i = 0; i < frIndex; i++) {
			friArr[i].showBasicInfo();
		} 
		
		/*
		Friend2클래스의 showBasicInfo()메소드에는 아무런 기능이
		정의되어 있지 않으므로 아래에서는 정보가 전혀 출력되지
		않는다. 즉 상속의 목적으로만 정의한 클래스를 통해
		객체를 생성한것은 논리적오류(실수)가 발생된 것이다. 
		 */
		System.out.println("==친구 정보를 입력하세요=="); 
		System.out.print("이름:");
		iName = scan.nextLine(); 
		System.out.print("전화번호:");
		iPhone = scan.nextLine();		
		System.out.print("주소:");
		iAddr = scan.nextLine(); 
		Friend2 fri = new Friend2(iName, iPhone, iAddr); 
		fri.showBasicInfo();
		 	
	}

}
