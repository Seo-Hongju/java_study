package ex12inheritance;
/*
문제4) QuRingMake.java
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 해당 문제는 상속을 통해 구현하는것이 아니라 복합관계를 이용하여 해결한다.


이 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
main 메소드는 다음과 같다.


 
실행결과는 다음과 같다.
---------- 자바실행 ----------
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]

 */
//원의 중심점을 표현하기 위한 클래스로 x,y좌표값을 가지고있음.
class Point
{
   	int xDot, yDot;
   	public Point(int x, int y)
   	{
 		xDot=x;
 		yDot=y;
   	}
   	//멤버메소드 : 좌표의 정보를 출력
   	public void showPointInfo()
   	{
        System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	
	//생성자
	public Circle(int x, int y, int r) {
		radian = r;//반지름 초기화
		center = new Point(x, y);//point객체 생성
	}
	
	//멤버메소드 : 원의정보를 출력
	public void showCircleInfo() {
		System.out.println("반지름:"+radian);
		/*
		원의중심좌표 정보출력 : 상속관계가 아니므로 객체를 
			이용해서 멤버메소드를 호출한다. 
		 */
		center.showPointInfo();
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	//생성자(안쪽원의 좌표와 바깥쪽원의 좌표를 초기화)
	public Ring(int inX, int inY, int inR, 
				int outX, int outY, int outR ) {
		/*
		상속관계가 아니라 복합관계로 표현되었으므로 super()
		대신 new 키워드로 객체를 생성해야 한다. 
		 */
		innerCircle = new Circle(inX, inY, inR);
		outerCircle = new Circle(outX, outY, outR);
	}
	//멤버메소드
	public void showRingInfo() {
		/*
		링의 정보 출력 : 링은 2개의 원으로 구성되므로 각각의 
			정보를 출력하면 된다. 
		 */
		System.out.println("안쪽원의정보:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의정보:");
		outerCircle.showCircleInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
		/*
		Ring클래스의 매개변수
			: 안쪽원의 중심점(1,1)과 반지름(3)
			    바깥쪽원의 중심점(2,2)과 반지름(9)
		 */
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
