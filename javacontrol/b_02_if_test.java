package javacontrol;

import java.util.Scanner;	// 입력에 사용하는 클래스 (java:패키지, util:클래스, Scanner:함수)
public class b_02_if_test {
	// 입력된 월을 계절로 매핑(Mapping)하는 프로그램
	public static void main(String[] args) {
		// class는 인스턴스 실행
		// new가 동적 메모리 할당 명령 -> Heap에 저장 -> 변수는 Stack에 생성
		// 메모리 분할 : Heap(작은 메모리를 대량의 데이터 처리) / Stack : 함수 호출의 복귀주소
		// 장치를 사용하거나, 네트워크를 사용하거나, DB를 사용할 경우 반드시 명시적으로 close() 해야 함. (메모리 누수 방지)
		Scanner input = new Scanner(System.in);		// 클래스 초기화 매개변수(장치) -> 키보드
		System.out.println("월을 입력하세요 >> ");			// 사용자 입력 받기 (설명)
		int month = input.nextInt();				// 사용자 입력 받은 값을 month에 대입
		String season = null;		// 입력될 데이터가 없어 null로 명시 (null은 데이터 연결 지점이 없음) (season이라는 String은 스택에 만들어짐)
		
		if (month == 12 || month == 1 || month == 2) 
		{
			season = "겨울";
		}
		else if (month == 3 || month == 4 || month == 5) 
		{
			season = "봄";
		}
		else if (month == 6 || month == 7 || month == 8) 
		{
			season = "여름";
		}
		else if (month == 9 || month == 10 || month == 11) 
		{
			season = "가을";
		}
		else 				// 사용자 입력이 1~12 이외일 경우
		{
			season = "없는 계절";
		}
		System.out.println(month + "월은 " + season + " 입니다.");	
		
		
		
		// switch case 문 : 변수에 따라 분기시키고 싶을때 사용		
		month = input.nextInt();
		season = null;
		switch(month) {		// 변수의 경우의 수에 대하여 분기함.
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:		// 사용자 입력이 1~12 이외일 경우
			season = "없는 계절";
		}
		// format 문자열 (printf) .. %d -> digit, %s -> string
		System.out.printf("%d월은 %s 입니다.", month, season);
		input.close();
	}
}