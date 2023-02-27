package kfunction_pkg;
// 프로그램은 순차적으로 실행
// 분기 : if문 분기, for문 분기, 함수 분기, 클래스 영역으로 분기
public class d_02_method_order {
	/*
	int b;		// 멤버 변수
	int c;
	static String name;		// static 변수 : 한번만 만들어지는 변수, 클래스 공유변수(이름 바뀔 수 있음)
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작 첫 함수 호출");
		staticMethod1();		// 함수 영역으로 분기
		staticMethod1();
		System.out.println("메인으로 복귀");
		System.out.println("종료합니다.");
	}
	
	public static void staticMethod1() {	// stack 영역에 생성 -> 함수와 생명을 같이 함.
		// 함수 처리에 필요한 모든 데이터는 stack에 저장되어야 한다. -> 데이터를 직접 저장하지 않고 주소로 참조하는 것도 가능 (참조변수가 stack에 만들어져야함)
		int a = 10;			// 지역변수(local variables)
		System.out.println("첫 함수 진입");
		staticMethod2();
		System.out.println("두번째 함수 호출 종료");
	}
	
	public static void staticMethod2() {
		System.out.println("두번째 함수 진입");
		System.out.println("두번째 함수 종료");
	}
	*/
	
	// 연습문제 2
	// y = ax^2 + bx + c일때 이를 함수로 구현하고 a=2, b=4, c=1일때,
	// x가 2라면 어떤 값이 리턴되는지 확인해보시오.
	// 제곱(Math.pow( , )
	public static void main(String[] args) {
		ex2(2);
		System.out.println(ex2(2));
	}
	
	public static int ex2(int x) {
		int a=2, b=4, c=1;
		
		int result = a*(int)(Math.pow(x, 2)) + b*x + c;
		
		return result;
	}
	
	/*
	// 방안 1
	public static int fun(int x) {
		int ret = (int) (2*Math.pow((double)x, 2)) + (4*x) + 1;
		return ret;
	}
	
	// 방안 2
	public static int fun(int a, int b, int c, int x) {
		// casting이 필요한 함수(pow()) => pow() 함수는 double로 캐스팅 해주어야 함
		int ret = (int) (a*Math.pow((double)x, 2)) + (b*x) + c;
		return ret;
	}
	*/
}
