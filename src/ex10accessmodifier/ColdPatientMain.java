package ex10accessmodifier;

//시나리오] 감기환자는 아래 1,2,3순서대로 약을 복용해야한다고
//		가정.
class SnuffleCap {
	public void take() {
		System.out.println("3.코막힘이 치료됩니다.");
	}
}
class SneezeCap {
	public void take() {
		System.out.println("2.기침이 멈춥니다.");
	}
}
class SinivelCap {
	public void take() {
		System.out.println("1.콧물이 멈춥니다.");
	}
}
//감기환자를 추상화한 클래스
class ColdPatient {	
	//멤버변수
	SneezeCap sneeze = new SneezeCap();
	SinivelCap sinivel = new SinivelCap();
	SnuffleCap snuffle = new SnuffleCap();
	public void take() {		
		snuffle.take();//1
		sneeze.take();//3
		sinivel.take();//2
	}
}
class ColdPatientCapsule {
	Contack600 contack600 = new Contack600();
	public void take() {
		contack600.take();
	}
}

public class ColdPatientMain {
	
	public static void main(String[] args) {
		//감기환자가 약을 복용하는것을 표현
		System.out.println("--캡슐화 이전의 복용--");
		ColdPatient patient = new ColdPatient();		
		patient.take();
		
		System.out.println("--캡슐화 이후의 복용--");
		ColdPatientCapsule patient2 = 
				new ColdPatientCapsule();
		patient2.take();
	}
}



