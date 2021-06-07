package ex12inheritance;
class Car
{
	int gasoline;
	
	public Car(int gas) {
		//최상위 클래스이므로 super없이 멤버변수만 초기화
		gasoline = gas;
		System.out.println("Car생성자호출");
	}
}
class HybridCar extends Car
{
	int electric;
	
	public HybridCar(int gas, int ele) {
		//멤버변수 electric 초기화, 나머지 1개는 부모에게 전달
		super(gas);
		electric = ele;
		System.out.println("HybridCar생성자호출");
	}
}
class HybridWaterCar extends HybridCar
{
    int water;
    
    public HybridWaterCar(int gas, int ele, int wat) {
    	//멤버변수 water초기화, 나머지2개는 부모에게 전달
    	super(gas, ele);
    	water = wat;
    	System.out.println("HybridWaterCar생성자호출");
    }
 
   	public void showNowGauge()
   	{
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar (10,20,30);
		hcar.showNowGauge();
	}
}
