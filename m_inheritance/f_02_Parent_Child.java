package m_inheritance;
class Parent {			// 부모 클래스
	int x = 100;
	public void setValue(int x) {	// 값을 대입
		this.x = x;
	}
	void method() {
		System.out.println("부모 함수");
	}
}

class Child extends Parent {	// 부모 클래스를 자식에게 상속
	int x = 200;				// 재정의
	Child() {
		x = 1000;				// 자식 생성자
	}
	public void setValue(int x) {
		this.x = x;
	}
	void method() {				// 부모 함수 오버라이딩(Overriding)
		System.out.println("자식 제1-1함수: " + x);
	}
	
	void method2() {			// 자식에서 추가된 함수
		System.out.println("자식 제1-2함수: " + x);
	}
}

class Child2 extends Parent {
	int x = 300;
	Child2() {
		x = 2000;
	}
	public void setValue(int x) {
		this.x = x;
	}
	void method() {
		System.out.println("자식 2-1함수");
	}
	void method2() {
		System.out.println("자식 2-2함수");
	}
	void method3() {
		System.out.println("자식 2-3함수");
	}
}

public class f_02_Parent_Child {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		// Upcasting은 자동 발생
		Parent p = new Child();		// 부모는 자식을 가리킬 수 있다.
		p.method();					// 자식의 메서드가 출력
		
		c.method2();
		// p.method2();				// 컴파일 타임에 에러가 발생 ( 부모가 가리킬 수 있지만 추가된 자식 메서드를 출력 불가)
		
		// Downcasting으로 처리한 다음 호출
		Child d = (Child) p;
		d.method2();
		
		
		// 배열을 이용한 처리 : 같은 클래스인 경우는 클래스 배열을 만들어서 처리
		Child ch[] = new Child[3];		// 배열의 형태를 지정
		for(int i=0; i<3; i++) {
			ch[i] = new Child();		// 실제 메모리를 확보
		}
		
		ch[0].setValue(100);
		ch[1].setValue(20);
		ch[2].setValue(10);
		for(int i=0; i<3; i++) {
			ch[i].method();				// 메서드를 호출
		}
		
		
		// Child 3개, Child2 3개 필요한 경우
		// 부모의 이름으로 Child 3개, Child2 3개를 동시에 호출 가능
		Parent chp[] = new Parent[6];
		for(int i=0; i<3; i++) {
			chp[i] = new Child();
		}
		
		for(int i=3; i<6; i++) {		// 3, 4, 5
			chp[i] = new Child2();
		}
		
		for(int i=0; i<6; i++) {
			chp[i].method();
		}
		
		// 추가되는 메서드는 부모가 알 수 없다. 그래서 downcasting을 한 다음 호출한다.
		
		
		Child ch1[] = new Child[3];		// 0, 1, 2
		Child2 ch2[] = new Child2[3];	// 0, 1, 2
		
		for(int i=0; i<3; i++) {
			ch1[i] = (Child) chp[1];		// (Child) : 다운캐스팅 후 호출
			ch1[i].method2();
		}
		
		for(int i=3; i<6; i++) {
			ch2[i-3] = (Child2) chp[i];		// 
			ch2[i-3].method3();
		}
	}
}