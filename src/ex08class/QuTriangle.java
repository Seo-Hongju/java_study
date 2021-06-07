package ex08class;

class Triangle{
	//멤버변수
	private int bottom;//밑변
	private int height;//높이
	
	//밑변과 높이를 초기화
	public void init(int bo, int he) {
		bottom = bo;
		height = he;
	}
	
	
//	public void setBottom(int bo) {
//		
//	}
//	public void setHeight(int he) {
//		
//	}
	
	/*
	setter()메소드 자동생성 순서
	멤버변수선언 -> 우클릭 -> source -> getter and setter
	-> 선택후 만들기 
	 */
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	public double getArea() {
		//삼각형의 넓이를 반환
		return bottom * height * 0.5;
	}
}
public class QuTriangle {

	public static void main(String[] args) {
			
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
