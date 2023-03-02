package m_inheritance;
// 추상 클래스는 추상 메서드(추상함수)가 하나라도 있으면 만들어진다 (abstract)
// 클래스의 함수가 모두 추상함수라면, 순수추상 클래스라고 하고, 이를 java에서는 interface 라고 한다.
// 인터페이스에서는 멤버변수를 사용하지 말라 -> 사용하면 멤버 변수는 public, static(인스턴스하지 않고 사용)
// final은 수정이 불가능하다.
//인터페이스는 인스턴스 하면 안됨 : 추상 클래스처럼 부모로는 사용이 가능
interface MyInterface {
	public String hello = "인터페이스 변수는 기본적으로 public static final 접근이 가능하다";
	public void sayHello();
}

// 인터페이스는 상속(extends)이라 하지 않고, 구현(implements)이라고 한다.
// 클래스가 인터페이스를 구현
// 인터페이스 상속이라고 함 (인터페이스 간에도 상속이 된다.)
// 인터페이스는 인스턴스 하면 안됨 : 추상 클래스처럼 부모로는 사용이 가능
class MyInterfaceImpl implements MyInterface {
	public void sayHello() {		// 반드시 오버라이딩 해야 함.
		System.out.println(MyInterface.hello);
	}
}

public class g_02_interface {
	public static void main(String[] args) {
		System.out.println(MyInterface.hello);				// 직접 호출이 가능하다.
		MyInterface myinterface = new MyInterfaceImpl();	// 인스턴스에서 사용
		myinterface.sayHello();
		MyInterface [] mydim = new MyInterface[3];			// 인터페이스 배열 : 부모 배열과 마찬가지.
		mydim[0] = new MyInterfaceImpl();				// 구현 클래스에서만 인스턴스가 가능하다.
		mydim[1] = new MyInterfaceImpl();
	}
}
