package javacontrol;
import java.util.Scanner;

// 키보드 입력 -> 버퍼(숫자 + enter를 입력)
public class b_03_if_problem {
	public static void main(String[] args) {
		// 연습문제 1 : 나이는 성년(18), 체중은 50kg 이상인 사람만 헌혈이 가능하다.
		//           age가 25, weight가 48인 사람의 헌혈여부를 결정하는 프로그램 작성.
		// 경우의 수는 4가지가 발생
		// 경우의수 1) age >= 18, weight >= 50
		// 경우의수 2) age >= 18, weight <= 50
		// 경우의수 3) age < 18, weight >= 50
		// 경우의수 4) age < 18, weight <= 50
		
		/* 나이와 체중을 직접 초기화해주는 경우
		int age = 25;
		int weight = 48;
		
		if (age >= 18 && weight >= 50) 
		{
			System.out.println("헌혈 가능");
		}
		else {
			System.out.println("헌혈 불가");
		}
		*/
		
		// 나이와 체중을 사용자로부터 입력받을 경우
		/*
		Scanner input = new Scanner(System.in);		
		System.out.print("나이를 입력하세요 >> ");		
		int age = input.nextInt();
		System.out.print("체중를 입력하세요 >> ");					
	 	int weight = input.nextInt();
		
	 	
	 	if(age >= 18){
	 		if (weight>50) {
	 			System.out.println("헌혈 가능");
	 		} else {
	 			System.out.println("헌혈불가(체중미달)");
	 		}
	 	} else {
	 		System.out.println("헌혈 불가");
	 	}
	 	*/
	 	
	 	// 연습문제 2 : 숫자 하나를 입력받아서 홀수, 짝수인지 판정하여 출력하는 프로그램
		/*
	 	Scanner input = new Scanner(System.in);		
		System.out.print("숫자를 입력하세요 >> ");		
		int num = input.nextInt();
		
		if(num % 2 == 1) {		// %는 나머지 연산, /은 나누기 연산
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
		*/
		
		// 연습문제 3 : 주급 40시간까지는 시간당 100,000원으로 계산, 40시간 이상이면 초과인 시간에 대하여 150,000원으로 계산
		//           주 작업시간을 입력받아서 위의 계산조건으로 계산한 결과 출력
		//			 52시간 초과 시 52시간 급여만 출력
		/*
		Scanner input1 = new Scanner(System.in);
		System.out.print("몇 시간을 일하셨나요? >> ");
		int time = input1.nextInt();
		int over = time - 40;
		
		if(time <= 40)
		{
			System.out.println(time * 100000 + " 원");
		}
		else if(time > 40 && time < 53)
		{
			System.out.println((40 * 100000) + (over * 150000) + " 원");
		}	
		else
		{
			System.out.println("일주일 최대 근로시간은 52시간 : 5,800,000만원");
		}
		
		// Optimization 최적화 -> 저장공간을 효율적으로 사용하고 처리 속도를 높일 수 있는 방법 찾기.
		input1.close();
		*/
		
		
		// 연습문제 4 : 점수를 입력받아 학점으로 변환(Mapping)하는 프로그램 작성. switch case문 사용
		Scanner input = new Scanner(System.in);
		String imsi = input.nextLine();
		//System.out.print("몇점인가요? >> ");
		int score = Integer.parseInt(imsi);
		char degree =' ';
		
		switch(score/10) {
		case 10:
		case 9:
			degree = 'A';
			break;
		case 8:
			degree = 'B';
			break;
		case 7:
			degree = 'C';
			break;
		case 6:
			degree = 'D';
			break;
		default:
			degree = 'F';
		}
		//System.out.printf("%d점은 %s 등급 입니다.", score, degree);
		System.out.println("등급 = " + degree + "등급");
		input.close();
	}
}