package javacontrol;

import java.util.Scanner;
public class b_04_switch {
	public static void main(String[] args) {
		// 2월달 윤달을 고려해서 말일을 결정하는 프로그램의 작성
		// 1:31 2:  3:31 4:30 5:31 6:30 7:31 8:31 9:30 10:31 11:30 12:31
		// 년도를 4로 나누어서 떨어지는 해이면서 100으로 나눠서 떨어지지 않으면 윤년
		// 400으로 나누어서 떨어지면 윤년
		// 이를 고려하여 년도와 달을 입력하면 말일을 출력하는 프로그램
		// 경우의 수(3가지): 31일, 30일, 변동이 있는 경우
		// switch case문을 이용하여 해결할 것		
		Scanner input = new Scanner(System.in);	
		System.out.print("년도를 입력하세요 >> ");			
		int year = input.nextInt();
		System.out.print("월를 입력하세요 >> ");			
		int month = input.nextInt();
		/*
		if (month > 12) month = month%13+1;		// 12
		input.nextLine();
		int numDays = 0;
		switch(month)
		{
			...
		}
		
		*/
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(year + "년 " + month + "월은 말일이 31일 입니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(year + "년 " + month + "월은 말일이 31일 입니다.");
			break;
			
		case 2:		// 논리 연산자도 연산의 우선순위가 있음. 단항연산자(!) && ||
			if((year%4==0 && year%100!=0) || year%400==0) {
				System.out.println(year + "년 " + month + "월은 윤년입니다. 말일은 29일입니다.");
			} else {
				System.out.println(year + "년 " + month + "월은 윤년이 아닙니다. 말일은 28일입니다.");
			}
			break;
		default:
			System.out.println("해당 월이 없습니다.");
			break;
		}
		input.close();
	}
}