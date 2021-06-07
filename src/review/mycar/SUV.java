package review.mycar;

public class SUV extends Car {
	
	String suvName;
	
	Navigation navi;
	BlackBox box;
	
	public SUV(String suvName, String o, String n, int s, int f) {
		super(o, n, s, f);
		this.suvName = suvName;
	}
	public SUV(String suvName, String o, String n, int s, int f, 
			String nProduct, String bCapacity) {
		super(o, n, s, f);
		this.suvName = suvName;
		
		if(!nProduct.equals("")) {
			navi = new Navigation(nProduct);
		}
		if(!bCapacity.equals("")) {
			box = new BlackBox(bCapacity);
		}
	}	
	public void showSUVInfo() {
		super.showCarInfo();
		System.out.println("SUV명:"+ suvName);
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
