package review.mycar;

public class SportsCar extends Car {
	//자식에서 확장한 멤버변수
	String carName;//자동차이름
	//차량용품에 관련된 멤버변수(객체) - 포함관계를 표현함
	Navigation navi;
	BlackBox box;
	
	//생성자 메소드 오버로딩
	public SportsCar(String carName, 
			String o, String n, int s, int f) { 
		super(o, n, s, f);
		this.carName = carName;
	}
	//생성자 - 차량용품까지 초기화 할수 있도록 정의됨.
	public SportsCar(String carName, 
			String o, String n, int s, int f, 
			String nProduct, String bCapacity) {
		super(o, n, s, f);
		this.carName = carName;
		
		/*
		매개변수가 빈값이 아니라면 객체를 생성한다.
		만약 빈값이 전달된다면 객체가 생성되지 않으므로 해당 
		멤버변수는 null값을 가지게된다. 즉 해당 차량용품을
		소유하지 않은 자동차 객체가 된다.  
		 */
		if(!nProduct.equals("")) {
			navi = new Navigation(nProduct);
		}
		if(!bCapacity.equals("")) {
			box = new BlackBox(bCapacity);
		}
	}	
		
	public void showSportsCarInfo() {
		super.showCarInfo();
		System.out.println("스포츠카명:"+ carName);
		
		/*
		만약 해당 차량용품이 장착되었다면 정보를 출력한다. 
		 */
		if(navi==null) {
			System.out.println("Navigation이 없습니다.");
		}
		else {
			navi.showNaviInfo();
		}
		if(box==null) {
			System.out.println("BlackBox가 없습니다.");
		}
		else {
			box.showBoxInfo();
		}
	}
}
