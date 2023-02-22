package javabasic;

public class a_03_math {
	public static void main(String[] args) {
		System.out.println(Math.max(5, 10));	// x, y 중 최대값
		System.out.println(Math.min(5, 10));	// x, y 중 최소값
		System.out.println(Math.abs(-4.1));		// 절대값
		System.out.println(Math.random());		// 의사난수 : 0~1 사이 임의의 부동소수점을 리턴, 1.000은 포함 안됨
		
		System.out.println(Math.sqrt(64));		// 루트 (제곱근)
		System.out.println(Math.pow(10, 3));	// x의 y제곱
		System.out.println(Math.log(28));		// 28의 로그
		System.out.println(Math.log10(28));		// 28의 10의 로그
		System.out.println(Math.exp(3));		// 지수 함수
		
		// 연습문제 : random 사용하여 0~100 사이 정수형 값으로 변환하기
		System.out.println((int)(Math.random()*101));
		
		/*
		int randomNum1 = (int) (Math.random() * 101); // 숫자에서 타입의 변환
		System.out.println(randomNum1);
		*/
		
		
		// 삼각함수 : 회전하거나 두 벡터의 사이각을 구할때 사용
		// 컴퓨터에서는 각도 개념으로 사용 X, radian 개념으로 사용
		// sin(30) -> 30도 대신, 라디안을 사용(toRadians)
		// toDegrees -> 라디안을 각도로 변환
		// 라디안(radians) : 원의 지름을 1로 했을때, 그 각도에 해당되는 호의 길이
		// 어느 한 원 위의 점이 원점을 중심으로 반지름의 길이만큼 한 방향으로 움직였을 때 대응하는 각의 크기를 1 라디안
		double b = Math.toRadians(10);		// 각도 -> 라디안
		System.out.println(Math.sin(b));	// b의 sin 값
		
		// 연습문제 2 : cos 30도의 값을 계산한 다음, 그 결과를 다시 각도로 변환
		System.out.println("각도 변환 문제");
		double angle = Math.toRadians(30);	// 각도 -> 라디안
		// cos은 길이의 비 (반지름이 1인 상태에서의 길이의 비)
		double cosValue = Math.cos(angle);	// cos 30도의 라디안
		double sin = Math.sin(angle);
		System.out.println(sin);			
		System.out.println(cosValue);		// 0.866... => 밑변		
		// 길이의 비 로부터 호의 길이로 변경해주는 것이 acos(아크코사인)
		// 예를 들어 0.0000000000000000002812 -> 0으로 본다.
		System.out.println(Math.toDegrees(Math.acos(cosValue))); // 29.999... -> 30 (각도)
		
		// 연습문제 3 : 32는 자연대수의 몇 승인가 (자연대수 e)
		// 32 = a^b, 자연대수 : 약 2.71 ==> 32 = 2.71^b
		System.out.println(Math.log(32));	// 약 3.465
		
		// 연습문제 4 : 32는 밑수 10의 몇 승인가
		System.out.println(Math.log10(32)); // 약 1.505
		
		// 연습문제 5 : 두 변의 사이각이 45도일 때, 대각선의 길이가 28이라면 밑변의 길이와, 높이는?
		double ang45 = Math.toRadians(45);
		System.out.println(Math.cos(ang45));
		System.out.println("밑변: " + Math.cos(ang45)*28);
		System.out.println("높이: " + Math.sin(ang45)*28);
						
		
		// 연습문제 6 : 밑변이 8, 높이가 4일때 각도는?	
		double tan = 4/8.0;
		System.out.println(tan);	// 0.5
		System.out.println("사이각은 : " + Math.toDegrees(Math.atan(tan)));
		
		
	}
}