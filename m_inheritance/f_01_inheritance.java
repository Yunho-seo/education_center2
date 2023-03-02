package m_inheritance;				// Inheritance : 상속
// 모든 클래스는 보이지는 않지만 extends Object
class Super_class {					// 부모(Super, parent), 자식(Sub, Child) 관계
	int num = 20;					// 멤버 변수
	public void display() {			// 멤버 함수
		System.out.println("슈퍼 클래스에서 출력");
	}
}

public class f_01_inheritance extends Super_class {		// 인스턴스를 해야 사용 가능, 슈퍼 클래스 상속받기
	int num = 10;		// 상속 받은 부모 클래스를 재정의 (이름은 같되 하는 일이 다름)
	public void display() {
		System.out.println("서브 클래스에서 출력");
	}
	
	public void my_method() {		// 자식에서 추가된 메서드
		f_01_inheritance sub = new f_01_inheritance();		// 메서드 내 인스턴스
		sub.display();		// 자식의 메서드 실행
		super.display();	// 부모의 메서드 실행	// 문법적으로 부모(super)는 프로그램 내에서 정의됨
		// 자기 자신은 this로 정의 (메모리에서 실행될 때 부모의 주소값이나 자식의 주소값을 가지고 있는 객체)
		display();			// 자식의 메서드 실행
		System.out.println("자식의 변수: " + sub.num);
		// 메모리에서 부모의 영역과 자식의 영역은 별도로 존재한다.
		System.out.println("부모의 변수: " + super.num);	// 부모 값도 자식 메서드에서 출력 가능
		System.out.println("자식의 변수: " + num);
	}
	
	public static void main(String[] args) {
		f_01_inheritance obj = new f_01_inheritance();	// 인스턴스
		obj.display();		// 재정의 없으면 부모 없이 출력
		obj.my_method();
	}	
}