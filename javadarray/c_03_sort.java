package javadarray;

public class c_03_sort {
	public static void main(String[] args) {
		// CRUD (Create, Read, Update, Delete)
		// 비교
		/*
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];		// 별도의 공간을 확보하여 초기화 (79를 기준으로, 반복문을 돌린다)
		int min = score[0];
		for(int i=1; i<score.length; i++) {		// 전체 길이(score.length)보다 작을때까지 증가
			if(score[i] > max) {	// 79를 기준으로 잡고 88([1])부터 순서대로 비교
				max = score[i];		// 대입을 통하여 수정 // 79, 88, 91, 100
			}
			if(score[i] < min) {	// 대입을 통하여 수정 // 79, 33
				min = score[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		*/
		// 연습문제 1 : 위 로직에서 바뀐 횟수를 카운트해서 출력할 것
		
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];		// 별도의 공간을 확보하여 초기화 (79를 기준으로, 반복문을 돌린다)
		int min = score[0];
		int count_max = 0;
		int count_min = 0;
		for(int i=1; i<score.length; i++) {		// 전체 길이(score.length)보다 작을때까지 증가
			if(score[i] > max) {	// 79를 기준으로 잡고 88([1])부터 순서대로 비교
				max = score[i];		// 대입을 통하여 수정 // 79, 88, 91, 100
				count_max++;;
			}
			if(score[i] < min) {	// 대입을 통하여 수정 // 79, 33
				min = score[i];
				count_min++;
			}
		}
		System.out.println("최대값: " + max + " || 바뀐 횟수: " + count_max);
		System.out.println("최소값: " + min + "  || 바뀐 횟수: " + count_min);
		
		
		// ============================================================= //
		
		
		// 정렬
		int [] number = new int[10];
		for(int i=0; i<number.length; i++) {
			number[i] = i;
			System.out.print(number[i] + " ");
		}
		System.out.println("\n");
		// Shuffling
		// 메모리의 특성 : 두개의 변수 간 데이터를 직접 교환하는 것은 불가
		for (int i=0; i<100; i++) {
			int n = (int)(Math.random()*10);
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println("\n");
		
		// 버블 정렬
		// 오름차순 : asc, 내림차순 : des
		System.out.println("정렬");
		for(int i=0; i<number.length; i++) {			// 행 수만큼 회전
			for(int j=0; j<number.length-i-1; j++) {	// 열 수만큼 회전
				if(number[j] > number[j+1]) {			// 인접한 데이터 2개를 비교
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println("\n");
		
		// 연습문제 2 : 내림차순으로 정렬
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number.length-i-1; j++) {
				if(number[j] < number[j+1]) {		// 인접한 데이터 2개를 비교
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		// 연습문제 3 : 최적화 - 한 회전에서 변화가 없으면 정렬된 상태.
		System.out.println("\n정렬");
		// 변화 여부를 감지하는 변수 changed : boolean(type)
		for(int i=0; i<number.length; i++) {			// 행 수만큼 회전
			boolean changed = false;					// 행마다 초기화가 되어야 하기 때문에 for문 안에 changed를 선언
			for(int j=0; j<number.length-i-1; j++) {	// 열 수만큼 회전
				if(number[j] > number[j+1]) {			// 인접한 데이터 2개를 비교
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;
				}	
			}
			if (!changed) break;
		}
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}