package lclass;
// class의 기본 개념
// 캡슐화 : 데이터 보호
// 추상화
// 상속성
// 다형성

// public이 없어서 외부에서 접근 불가
class test_class {			// 내부 클래스 (public이 없는 경우 2개 이상의 클래스가 있을 수 있다.)
	int data;
	int change(int data) {
		data = data + 100;
		return data;
	}
}

public class e_01_class {
	int data = 50;			// 클래스에 데이터를 받는다, 멤버변수 // python으로부터 java 측이 받아들인 것. public이 생략되어도 기본이 됨.
	int change(int data) {	// static을 안붙인 경우, 멤버함수
		// 이름이 같다면(data), 함수의 지역변수가 우선 (change 함수 내의 data 변수)
		data = data + 100;		
		return data;
	}
	// 프로그램 진입점
	public static void main(String[] args) {
		// 클래스에 있는 변수는 반드시 동적 메모리를 할당해주어야 함 (new)
		// 변수는 메인함수 stack에 저장되고, 데이터는 heap에 저장된다.
		e_01_class op = new e_01_class();		// 인스턴스, class는 new를 통하여 동적 메모리 할당(메모리 확보)
		System.out.println(op.data);
		int ret = op.change(500);
		System.out.println(ret);
		System.out.println(op.data);			// 함수 밖의 data 변수
		
		test_class tc = new test_class();		// 테스트 클래스 사용시, 인스턴스를 해주어야 함
		ret = tc.change(1000);
		System.out.println(ret);
	}
}