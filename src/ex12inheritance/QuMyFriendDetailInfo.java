package ex12inheritance;

class MyFriendInfo
{
	private String name;
	int age;
	
	//생성자 
	public MyFriendInfo(String na, int ag) {
		this.name = na;
		this.age = ag;
	}
	
	public void ShowMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
    private String phone;
    
    //생성자정의 : 부모의 멤버변수2개, 자신의 멤버변수2개를 
    // 		초기화 할수있도록 정의한다. 
    public MyFriendDetailInfo(String ad, String ph,
    		String na, int ag) {
    	//부모의 생성자 호출
    	super(na, ag);
    	//자신의 멤버변수 초기화
    	this.addr = ad;
    	this.phone = ph;
    }

	public void ShowMyFriendDetailInfo()
	{
		ShowMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo
{
	public static void main(String[] args)
	{
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo mfdi
			= new MyFriendDetailInfo("신도림", "02-1234-5678",
					"한국직업전문학교", 20);
		//정보Print
		mfdi.ShowMyFriendDetailInfo();
	}
}



