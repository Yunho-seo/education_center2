package javacontrol;

public class b_05_for {
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if(i==5) {
				continue;	// 5를 통과
			}
			if(i==7) {
				break;		// 루프 도중에 중지
			}
			System.out.print(i + " ");
		}
		
		int hab = 0;
		for (int i=1; i<=10; i++) {
			hab += i;
			System.out.print(" " + hab);
		}
		System.out.println();
		System.out.print("1부터 10까지의 합계: " + hab);
		System.out.println();
		
		// 2중 for문
		for (int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i + " " + j);
		}
	}		
		
		
		// 구구단 프로그램
		/*
		for (int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		*/
		
	}
}