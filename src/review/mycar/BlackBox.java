package review.mycar;

public class BlackBox {
	//메모리카드 용량을 표현
	String mCapacity ;
	
	public BlackBox(String c) {
		this.mCapacity = c;
	}
	
	public void showBoxInfo() {
		System.out.println("블렉박스의 메모리용량:"+ mCapacity);
		System.out.println("주행 영상을 녹화합니다.");
	}
}
