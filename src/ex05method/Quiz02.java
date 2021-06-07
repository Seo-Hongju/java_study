package ex05method;
/*
문제) 파일명 : ex05method.Quiz02.java
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 
리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 
함수를 만들어라.
공식]
  화씨 = 1.8 * 섭씨 + 32
  섭씨 = (화씨 - 32) / 1.8
메소드명]
  섭씨를 화씨로변환 : CelsiusToFahrenheit()
  화씨를 섭씨로 변환 : FahrenheitToCelsius()

 */
public class Quiz02 {

	static double CelsiusToFahrenheit(double cel) {
		return 1.8 * cel + 32;
	}
	
	static double FahrenheitToCelsius(double fah) {
		return (fah - 32) / 1.8;
	}
	
	public static void main(String[] args) {
		//섭씨20도, 화씨120도를 변환
		double userCel = 20, userFah = 120;
		
		System.out.println("섭씨:"+userCel+" -> 화씨:"
				+CelsiusToFahrenheit(userCel));
		System.out.println("화씨:"+userFah+" -> 섭씨:"
				+FahrenheitToCelsius(userFah));
		
		System.out.printf("화씨:%f -> 섭씨:%6.2f",
				userFah, FahrenheitToCelsius(userFah));
	}

}










