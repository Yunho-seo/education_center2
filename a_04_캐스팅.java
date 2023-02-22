package javabasic;

public class a_04_캐스팅 { // 캐스팅 : 타입 변환
	public static void main(String[] args) {
		int myInt = 9;	// Int : 4바이트, Double : 8바이트
		double myDouble = myInt;					// 암묵적 캐스팅
		
		System.out.println(myInt);					// 9
		System.out.println(myDouble);				// 9.0, 작은 사이즈에서 큰 사이즈로 변환되면, 암묵적 캐스팅 (타입 변환)
		
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1;				// 명시적 캐스팅 : 큰 사이즈에서 작은 사이즈로 변환 시 명시해주어야 함.
		
		System.out.println(myDouble1);				// 9.78
		System.out.println(myInt1);					// 9
		System.out.println(myInt1 + myDouble1);		// 18.78, Int형 + Double형 연산 가능 (묵시적으로 큰 사이즈 타입으로 변환)
		
		
	}

}
