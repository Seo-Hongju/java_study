package ex12inheritance;
/*
문제3) QuRectangleMain.java

정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오. 


실행결과 :
직사각형 면적: 12
정사각형 면적: 49

 */
//직사각형을 표현한 클래스
class Rectangle
{
	//멤버변수 : 가로, 세로
	private int width;
	private int height;
	//생성자 : 가로, 세로 초기화
	public Rectangle(int w , int h) {
		width = w;
		height = h;
	}
	//getter()메소드 : private멤버변수를 외부로 값 전달(반환)
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	//멤버메소드 : 넓이를 계산해서 출력
	public void ShowAreaInfo() {
		System.out.println("직사각형 면적:"+(width*height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	//멤버변수 : 여기서는 필요없음
	/*
	부모클래스에 이미 정의되어있는 멤버변수를 사용하므로 추가적인
	정의는 필요없다. 
	 */
	
	/*
	생성자 : 정사각형은 가로, 세로의 길이가 동일하므로 매개변수
		1개로 2개를 초기화할수 있다. 
	 */
	public Square(int w) {
		super(w, w);
	}
	//멤버메소드 : 오버라이딩 정의(자동완성)
	@Override
	public void ShowAreaInfo() {
		System.out.println("정사각형넓이:"+
				(getWidth()*getHeight()));/*
			부모클래스의 멤버변수가 private이므로 직접 접근할수
			없고, getter()를 통해 간접적으로 접근한다. 
			*/
	}
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}
