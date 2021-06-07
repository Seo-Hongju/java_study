package test;

class Man extends Object {
	String name;
	public Man(String n) {
		name = n;
		System.out.println("Man의 생성자");
	}
}
class BusinessMan extends Man {
	String company;
	String postion;
	public BusinessMan(String c, String p, String n) {
		super(n);
		System.out.println("BusinessMan의 생성자");
	}
}

public class Inher {
	public static void main(String[] args) {		
		//Man man = new Man();//생성자를 통해서 초기화		
		BusinessMan bMan = new BusinessMan();
	}
}
