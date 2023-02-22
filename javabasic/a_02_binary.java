package javabasic;

public class a_02_binary {
	public static void main(String[] args) {
			System.out.println(Integer.toBinaryString(8));
			//  128,  64,  32,  16,  8,  4,  2,  1
			//    0	   0    0    0   1   0   0   0
			
			System.out.println(Integer.toBinaryString(-8));		// 마이너스는 보수를 취함 (2진수 거꾸로)
			//  128,  64,  32,  16,  8,  4,  2,  1
			//    1	   1    1    1   0   1   1   1				=> 2의 보수 + 1
			//    1	   1    1    1   1   0   0   0 
			
			// 연습문제 1 : 48을 이진수로 만들어보고 toBinaryString을 이용하여 확인하기
			System.out.println(Integer.toBinaryString(48));
				//  128,  64,  32,  16,  8,  4,  2,  1
				//    0	   0    1    1   0   0   0   0
			System.out.println(Integer.toBinaryString(-48));
				//  128,  64,  32,  16,  8,  4,  2,  1
				//    1	   1    0    0   1   1   1   1				=> 2의 보수 + 1
				//    1	   1    0    1   0   0   0   0 
			
			// 시프트 연산
			int temp = 8 >> 2;		  // 오른쪽으로 2비트 이동 (비트 시프트)
			System.out.println(temp); // 2
			
			// 비트 연산자 (&는 and 연산, |(pipe)는 or 연산)
			int x = 123;
			int y = 205;
			System.out.println(Integer.toBinaryString(x)); // 01111011 (123의 2진수)
			System.out.println(Integer.toBinaryString(y)); // 11001101 (205의 2진수)
														   // 01001001 (x와 y의 AND 연산)
														   // 11111111 (x와 y의 OR 연산)
			int z = x & y;	// AND 연산
			int v = x | y;	// OR 연산
			int n = x ^ y;	// XOR 연산
			int t = z ^ y;
			System.out.println(Integer.toBinaryString(z));
			System.out.println(Integer.toBinaryString(v));
			System.out.println(Integer.toBinaryString(n)); // 10110110
			System.out.println(Integer.toBinaryString(t)); // z와 y의 XOR 연산. 결과는 123의 2진수의 보수
			
			// 삼항 연산자
			// 비교 : 관계 연산자(>, >=, <, <=, ==) -> 결과값 : T or F
			// 숫자 -> 큰수, 문자 -> ASCII CODE 순 (8비트-> 256, 최근에는 유니코드 UTF-8로 통일 : 2바이트 문자열)
			// 아스키 코드 ('A'는 65번, 'a'는 97번)
			x =  10;
			y = -10;
			int absX = (x >= 0) ? x : -x;	// x가 (x >= 0) 조건에 참이면, x를 출력 / 아니면 -x 출력
			int absY = (y >= 0) ? y : -y;	// y가 (y >= 0) 조건에 참이면, y를 출력 / 아니면 -y 출력
			System.out.println("x= " + absX);
			System.out.println("y= " + absY);
	}

}
