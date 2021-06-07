package review.mycar;
/*
자동차를 표현하는 클래스
	1.기본속성(멤버변수)
		차주, 차량번호, 속도, 연료 
	 
	2.멤버변수 초기화(생성자) : 기본생성자, 인자생성자 
	  
	3.기능(멤버메소드)
	  	브레이크 : 속도가 -20 줄어든다. 연료소모는 없다.
	  	엑셀레이터 : 속도가 +20 증가한다. 연료소모는 -20
	  	주유(연료보충) : 전달된 매개변수만큼 보충함.
	4.제한조건(연습문제)
	   속도 : 0~200km/h 즉 음수가 될수없고, 200을 초과할수 없음
	   연료 : 0~100ℓ
	   
	   -멤버메소드 주유, 브레이크, 엑셀에 제한조건을 충족할수
	   있는 조건식을 삽입하시오.
 */
public class Car {
	
	//멤버변수
	private String owner;//소유주
	private String carNumber;//차량번호
	private int speed;//속도
	private int fuel;//연료량	
	
	//멤버상수 : 제약조건은 상수로 선언하는것이 좋다. 
	final int MAX_FUEL = 100;
	final int MAX_SPEED = 200;
	
	//기본생성자, 인자생성자	
	public Car() {}
	public Car(String owner, String carNumber, int speed, int fuel) {
		this.owner = owner;
		this.carNumber = carNumber;
		this.speed = speed;
		this.fuel = fuel;
	}
	//getter / setter	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	//주유하기
	public void refueling(int amount) {
		fuel += amount;
		
		if(fuel>MAX_FUEL) {
			System.out.println("연료의 최대치 "+ MAX_FUEL 
					+"을 초과하였습니다.");
			fuel = MAX_FUEL;
		}
		
		System.out.println(amount +"만큼 주유되었습니다.");
	}
	//브레이크
	public void breaking() {
		speed -= 20;
		
		if(speed<0) {
			System.out.println("속도는 음수가 될수 없습니다.");
			speed = 0;
			System.out.println("브레이크:속도 0Km/h");
		}
		else {
			System.out.println("브레이크:속도 20Km/h 감소");
		}		
	}
	//엑셀레이터
	public void accelerator() {		
		if(fuel<=0) {
			System.out.println("연료가 없으므로 주행할수 없습니다.");
			return;
		}
		else {		
			speed += 20;
			fuel -= 20;
			
			if(fuel < 0) {
				System.out.println("연료가 부족하므로 주행할수"
						+" 없습니다.");
				speed = 0;
				fuel = 0;
				return;
			}
			
			if(speed>MAX_SPEED) {
				System.out.println("최대속도를 초과하여 고정됩니다.");
				speed = MAX_SPEED;
			}
			
			System.out.println("엑셀레이터:속도 20Km/h 증가");
			System.out.println("연료 20ℓ 감소");
		}
	}
	//자동차 정보 출력
	public void showCarInfo() {
		System.out.printf("차주:%s\n차량번호:%s\n연료:%dℓ\n"
				+" 속도:%dKm/h\n",owner, carNumber, fuel, speed);
	}
}









