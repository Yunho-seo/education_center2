package m_inheritance;

// 인터페이스 : 반드시 구현을 해야함
// Cloneable 인터페이스 -> 객체 복사가 가능하도록 함
// 어떤 클래스던지 Cloneable 인터페이스를 구현하면 객체 복사가 가능
// 이처럼 공통 기능을 자바 측에서 만들어서 제공함 : 어떤 객체인지 Cloneable을 참조하면 clone 가능

// Cloneable 인터페이스
public class g_03_interface_cloneable implements Cloneable {	// Cloneable을 참조해야 clone()을 사용할 수 있다.
	int rollno;
	String name;
	public g_03_interface_cloneable(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	// clone()을 구현
	public Object clone() throws CloneNotSupportedException {
		return super.clone();		// Object를 상속받는다 (Object 안에 clone이 있다)
	}
	
	public static void main(String[] args) {
		try {		// 예외 처리
			g_03_interface_cloneable s1 = new g_03_interface_cloneable(101, "대한민국");	// rollno, name 생성자에 값 넣기 
			// Cloneable을 구현하면 clone 함수를 사용하는 것이 가능
			// 클래스 대입은
			// g_03_interface_cloneable s2 = s1;  이런 경우에는 복사가 아니라 주소를 전달하여 
			// s2, s1이 같은 주소를 가리키게 됨 : 하나를 바꾸면 다른 변수에도 영향을 줌
			g_03_interface_cloneable s2 = (g_03_interface_cloneable) s1.clone();
			// 위와 같이 clone을 하면 힙(Heap)에 별도의 공간을 만들어서 데이터를 복사하기 때문에
			// 두 변수가 가리키는 위치는 다르다
			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);
			
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
			
		}
	}
}