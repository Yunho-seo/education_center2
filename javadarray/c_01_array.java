package javadarray;
// 만약 stack 구조가 없다면 작은 코드로 대량의 데이터 처리 가능
// 만약 Heap  구조가 없다면 데이터만큼의 메모리가 있어야 함
public class c_01_array {
	public static void main(String[] args) {
		// enhanced for 문
		// 배열 초기화는 new를 사용하거나 {}를 이용하여 초기화
		int arr[] = {2, 11, 45, 9};		// arr은 배열 인스턴스 변수 -> 주소가 저장.
		for (int num : arr) {			// num에 입력되는 것은 데이터 자체 (인덱스가 아니다)
			System.out.println(num);
		}
		
		int[] a = new int[4];	// new : 동적 메모리 할당에 사용 -> Heap
		// a 변수 주소에 가면 배열의 주소를 입력하는 데이터를 저장.
		// 포인터(주소)를 저장하는 공간을 만듬 : stack
		// 힙에 4바이트 int형 데이터를 저장하는 공간을 만들고 선두 주소를 a가 가르키는 주소에 저장
		// 주소에 있는 주소를 참조하여 데이터를 처리하는 것을 reference 변수라고 함.
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		int sum = 0;
		sum = a[0] + a[1] + a[2] + a[3];
		System.out.printf("배열의 총합은 %d 입니다.\n", sum);
		sum = 0;
		// 배열의 length 속성을 이용하여 개수 파악 가능 (length 사용시, 항상 작아야 함('<'만 사용 가능))
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			sum += temp;
			System.out.println(temp);
		}
		System.out.printf("배열의 총합은 %d 입니다.\n", sum);
		
		
		// 연습문제 1 : 한 학생의 과목별 점수는 {100, 88, 99, 99, 98}을 배열에 저장하고 합계를 계산하고 평균 계산 결과 출력하기
		// 평균 점수에 의하여 학점 부여하기
		int score[] = {100, 98, 99, 99, 98};
		int score_sum = 0;
		float score_avg = 0f;
		for(int i=0; i<score.length; i++) {
			int temp = score[i];
			score_sum += temp;
		}
		System.out.printf("총점수는 %d점 입니다.\n", score_sum);
		
		score_avg = score_sum/score.length;
		System.out.printf("평균은 %4.2f 점 입니다.\n", score_avg);
		
		char grade = ' ';
		
		if (score_avg >= 90) {
			grade = 'A';
		}
		else if (score_avg >= 80) {
			grade = 'B';
		}
		else if (score_avg >= 70) {
			grade = 'C';
		}
		else if (score_avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("등급은 %c 입니다.", grade);
		
		
		/*
		int sum2 = 0;
		float average = 0f;
		int [] score = {100, 98, 99, 99, 98};	
		for(int x : score){
			sum2 += x;
		}
		
		average = sum2 / score.length;
		System.out.println("합계는 : " + sum2);
		System.out.println("평균은 : " + average);
		// 소수점 이하 자리수 조정
		// 연산에서 조절된 수치를 사용할 때는 round 처리 (올림(ceil), 반올림(round), 내림(floor))
		System.out.printf("합계는 %d, 평균은 %4.2f입니다.", sum2, average);
		char grade = 'F';
		int ave = (int) average/10;
		switch(ave) {
			case 10:
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
			default: grade='F';
		}
		System.out.println("학점: "+ grade+"입니다.");
		*/
	}
}