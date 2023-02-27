package kfunction_pkg;

public class d_04_swap {
	/*
	public static void main(String[] args) {
		int a1 = 30;
		int b1 = 45;
		System.out.println("교환 전, a = " + a1 + " , b = " + b1);
		swapFunction(a1, b1);
		// 값이 바뀌지 않는다? : 데이터가 값으로 전달이 되었기때문에.
		System.out.println("교환 후, a = " + a1 + " , b = " + b1);
	}
	
	// 사용자 정의 함수
	public static void swapFunction(int a, int b) {		// 호출한 곳으로 영향을 미치지 않는다.
		System.out.println("교환 전, a = " + a + " b = " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("교환 후, a = " + a + " b = " + b);
	}	
	*/
	
	// 연습문제 1 : 배열을 입력받아 배열에 있는 데이터를 출력하는 함수 작성	
	
	public static void main(String[] args) {	
	
		// 배열 교환
		// Call by reference
		float[] a = {4, 1, 2};
		float[] b = {2, 1, 6};
		printarray(a);
		printarray(b);
		swap(a, b);			// 호출한 곳에 데이터 교환 효과가 발생
		printarray(a);
		printarray(b);
	}
	
	// 배열에 의한 데이터 전달은 주소에 의한 전달이나 호출한 곳에도 영향을 미침.
	// 배열의 지정값이 또다른 주소이기에, 일일이 교환해주는 작업을 하지 않으면 교환이 되지 않음
	public static void swap(float[] x, float[] y) {		// 함수 안에서 데이터를 교환
		float[] temp = {x[0], x[1], x[2]};
		x[0] = y[0];
		x[1] = y[1];
		x[2] = y[2];
		y[0] = temp[0];
		y[1] = temp[1];
		y[2] = temp[2];
	}
	
	
	public static void printarray(float[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
}