package javabasic;

public class a_01_variables {
	public static void main(String[] args) {
		System.out.println("대한민국");		// 오버로딩
		// System.out.
		System.out.println("천안시");
		
		String str = "대전시";		// '싱클 쿼테이션(문자인 경우)', "더블 쿼테이션(문자열인 경우)"
			// 변수는 물리적 주소 위치를 가치킴. ex)0x0000000123
		String str2 = "공주시";
		str = "만세";
		
		System.out.println(str + "에 살아요 ");
		System.out.println(str2 + "에 살아요 ");
		
		int korea = 90;
		korea = 97;
		int english = 100;
		int result = korea + english;
		float average = result / 2.0f;	// float 타입의 데이터는 f를 붙여줘야 함. 
		System.out.println("평균은 " + average);
		
		// Math는 클래스, static 함수들로 구성
		// 클래스는 인스턴스화 해야함 -> Math는 인스턴스화 X -> static 함수로 구성되어 있기에.
		System.out.println("평균은 " + Math.round(average));	// 반올림 round
		
		// 연습문제 ( 3.141592를 변수에 대입하고 출력하시오 )
		final float pi = 3.141592f;
		System.out.println(pi);
		
		// 연습문제2 ( 소수점 4째 자리에서 반올림하세요. )
		System.out.println(Math.round(pi*1000)/1000f);
	
		/*
		float shortPi = Math.round(pi * 1000) / 1000f;
		System.out.println(shortPi);
		*/
		
		// 증감 연산자
		int i = 5;
		i++;		// i=i+1 후위 증가 연산자
		System.out.println(i++); // 6
		System.out.println(i);   // 7
		i=5;
		++i;		// 전위 증가 연산자
		System.out.println(i);   // 6
		System.out.println(i++); // 6
		System.out.println(++i); // 8
		
		System.out.println("십의 3승 " + Math.pow(10, 3));  // power  ex) power(x, y) => x의 y제곱
		
		// 데이터 변환 => 데이터가 송수신될 때는 문자로 변환
		// 데이터 타입과 데이터가 불일치하면 입력이 안됨
		int num = 200;	// 변수를 사용
		String s = String.valueOf(num);  // 숫자 200을 문자열 200으로 변환, num과 s의 타입이 달라서 바꿔줘야 함
										 // String은 문자열을 다루는 class
										 // String을 선언하고 변수 s를 사용 => 인스턴스
		System.out.println(i+100);	// 8 + 100
		System.out.println(s+100);  // 200100 (문자열끼리 더한 값) ("200" + "100")
		
		// Wrapper class
		int num1 = Integer.parseInt(s);
		System.out.println(num1);	// 200 (문자열 s가 정수형 200으로 변환)
		// class는 인스턴스 되어야 함 -> 클래스는 사용자 정의 데이터타입
		// int는 프리미티브(기본형, 기본형은 숫자형, 문자형, 논리형), String은 프리미티브가 아님 (참조형)
		
		boolean isExisted = false;		// boolean(논리형, T or F)
		System.out.println(isExisted);
		double dl = 123455.56;
		System.out.println(dl);
		
		
	}
}