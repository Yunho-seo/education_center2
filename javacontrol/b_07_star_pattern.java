package javacontrol;

public class b_07_star_pattern {

	public static void main(String[] args) {
		int row = 10;
		
		for(int i=0; i<row; i++) {
			for(int j=row; j>i; j--) {	
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=row; i++){
            for(int j=row-1; j>=i; j--){	// 공백 반복
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){		// 별 반복
                System.out.print("* ");
            }
            System.out.println();
		}
		System.out.println();
	
		for(int i=0; i<row; i++) {
			for(int j=row-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {	
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 구구단 프로그램
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
			}
			System.out.println();
		}
	}
}