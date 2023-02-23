package javacontrol;

public class b_01_condition {
	public static void main(String[] args) {
		int x = 10;		// 데이터 입력 : 10으로 초기화
		System.out.println(x++);	// 10
		System.out.println(++x);	// 12
		System.out.println(x--);	// 12
		System.out.println(--x);	// 10
		
		int a = 10;		// 데이터 입력 : a = 10 초기화
		int b = 10;		// 데이터 입력 : b = 10 초기화
		System.out.println(a++ + ++a);	// 22 = 10 + 12
		System.out.println(b++ + b++);	// 21 = 10 + 11
		
		
		boolean c = true;		// true는 1과 의미가 같음
		c = !c;					// 논리 -> 단항 연산자
		System.out.println(c);	// false 출력
		c = !c;
		System.out.println(c);	// true 출력
		
		a = 10;			// 값 수정
		b = 5;
		int d = 20;		// 초기화
		System.out.println(a < b && a < d);		// false (a가 b보다 작아야 함 AND a가 d보다 작아야 함) (0 AND 1 -> false)(논리 연산)
		System.out.println(a < b  & a < d);		// false (a가 b보다 작아야 함 AND a가 d보다 작아야 함) (0 AND 1 -> false)(비트 연산)
		System.out.println(a < b || a < d);		// True	 (a가 b보다 작아야 함 OR a가 d보다 작아야 함)  (0 O R 1 -> True) (논리 연산)
		
		a /= 100;		// a = a/100;
		System.out.println(a);					// 0
		
		int number = -13;
		if (number>0) {			// false
			System.out.println("긍정(Positive)");
		}
		else if (number<0) {	// true
			System.out.println("부정(Negative)");
		}
		else {					// 같은 경우
			System.out.println("Zero");
		}
		
		// 단일명령인 경우, 블록({}) 생략이 가능, 블록 : 처리 명령의 집합
		if (number>0) System.out.println("긍정(Positive)");
		else if (number<0) System.out.println("부정(Negative)");
		else System.out.println("Zero");
		
		
	}
}