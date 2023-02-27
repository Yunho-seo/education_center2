package kfunction_pkg;
// 함수 이름은 같되 매개변수 타입과 매개변수 숫자가 다르면 다른 함수로 인식하는 것 : 오버로딩 (Overloading)
// 함수 이름을 데이터 타입마다 기억해야 하는 번거로움을 덜어주는 방법

public class d_05_overloading {
	public static void f(char c) {
		System.out.println("문자(char)입니다. ");
	}
	public static void f(int i) {
		System.out.println("int형입니다. ");
	}
	public static void f(long l) {
		System.out.println("long형입니다. ");
	}
	
	// public이 없으면, 클래스 내부에서만 사용	
	public static void m() {
		
	}
	public static void m(int i) {
		i = 99;
	}
	public static void m(Integer i) {
		i = 99;
	}
	public static void m(int [] arr) {
		arr[0] = 99;						// arr 0번을 99로 바꾸기.
	}
	
	
	public static void main(String[] args) {
		f('a');
		f(2);
		f(2L);
		// 데이터 타입마다 함수를 만들어서 사용해야 함
		
		m();
		int i = 10;
		m(i);
		System.out.println(i);				// 10
		
		Integer val = 10;					// 정수 wrapper class라고 함. (ex, parseInt() )
		m(val);
		System.out.println(val);			// 10
		
		int [] arr = {10, 20, 30};
		m(arr);
		// reference는 배열, class instance인 경우 : new를 사용하는 경우에 reference가 됨.
		System.out.println(arr[0]);			// 99 : reference로 전달되었을때는 수정시 원본에 영향을 미침
		System.out.println(arr.length);		// 3
		
	}
		
}