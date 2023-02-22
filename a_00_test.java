package javabasic;	// 패키지 이름
// 자바는 패키지를 기본 + 클래스가 기본
// 접근 지정자
// 데이터 타입
// 변수 앞에는 데이터타입이 있어야 함. (class는 사용자 정의 데이터 타입 / 기본 데이터타입을 이용하여 사용자가 정의한 데이터타입)
public class a_00_test {
	// 프로그램 진입점 -> 시작하는 클래스
	// main 함수 (a_00_test 클래스에 들어있는 main 함수) 함수 : 접근 지정자 -> 데이터를 보호하기 위해 사용.
	// static : 정적 함수
	// 함수는 리턴해야 함 -> void는 리턴하지 않는다.
	// 함수는 괄호와 함께 함 / 문자열을 지정 [] 배열
	public static void main(String[] args) {				
		// 프로그래밍의 기본 : 데이터 입력 -> 처리 -> 출력
		int a = 100;
		int b = 200;
		int c = a + b;	// 처리
		System.out.println(c);	// 출력 // System : 패키지, out : 클래스, println(a) : 함수
		
	}
}