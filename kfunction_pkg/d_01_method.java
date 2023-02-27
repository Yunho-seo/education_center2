package kfunction_pkg;
import java.util.Scanner;
public class d_01_method {		// class 자체가 사용자 정의 데이터 타입 = 메모리를 형성(확보)해야 함 => 인스턴스(instance)
	public static void main(String[] args) {
	/*
		System.out.println(100+300);				// 400
		int num1 = 100;
		int num2 = 200;
		int result = num1 + num2;
		System.out.println("덧셈결과 : " + result);		// 300
		
		float output = add(num1, num2);
		System.out.println("덧셈결과 : " + output);		// 300.0
	}

	// 코드 중복 방지, 한번을 실행하더라도 함수 생성하는 것이 유리 (수정, 유지보수가 용이함)
	// 오버로딩 : 함수 이름은 같되 매개변수 타입이 다르거나 매개변수 개수가 다르면, 다른 함수로 인식
	public static float add(float n1, float n2) {	// 매개변수를 입력
		float result = n1 + n2;
		return result;
	}
	*/
	// 연습문제 1 : * Multiply, / divide, - subtract
	// 두 수를 입력받아 곱셈, 나눗셈, 빼기 연산을 하는 함수 생성 후 입력으로 100, 200을 전달하여 함수 호출 결과를 출력
	
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int output = mul(a, b);
		System.out.println("곱셈결과 : " + output);
		
		double output1 = div(a, b);
		System.out.println("나눗셈결과 : " + output1);
		
		int output2 = sub(a, b);
		System.out.println("뺄셈결과 : " + output2);
	}	// main() 블럭 끝
	
	public static int mul(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public static double div(double a, double b) {
		double result = a / b;
		return result;
	}
	
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
	}
}