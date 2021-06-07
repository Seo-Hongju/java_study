package test;

class Friend {
	String name;	//이름
	String phone;	//전화번호
	String addr;	//주소
	public void showBasicInfo() {
		//오버라이딩의 목적으로 정의된 메소드
		//(그래서 실행부가 없음)
	}
}
//고딩친구
class HighFriend extends Friend {
	String nickname;
	
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("이름"+ name);
		System.out.println("전번:"+ phone);
		System.out.println("별명:"+ nickname);
	}
}
class UnivFriend extends Friend	{
	String major;	//전공과목

	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phone);
		System.out.println("전공:"+ major);
	}
}

public class Test {

	public static void main(String[] args) {
			
		
	}

}
