package javadarray;

public class c_05_sungjuk {
	public static void main(String[] args) {
		// 연습문제 2 : 배열을 이용하여 성적계산표를 작성 (점수를 입력하고 합계와 평균을 계산한 다음 출력)
		// 이름 국어  영어 수학  합계  평균
		// 대한 90  90  90  270 90.0
		// 민국 89  89  89  267 89.0
		// 만세 90  99  99  288 96.0
		// 배열은 동질적인 데이터만 처리 가능, 데이터 타입은 이름 String(1차원), 점수 Int(2차원), 평균 Double 배열 (배열 3개 필요함)
		// 3가지 모두, 인덱스에 의해 구분이 되어야 한다.
		// 입력 -> 처리 -> 출력
		
		// 입력
		String [] name = {"대한", "민국", "만세"};
		int [][] sungjuk = { {90, 90, 90, 0},
				{89, 89, 89, 0},
				{90, 99, 99, 0}
		};
		double [] avg = new double[3];
		
		// 처리
		for(int i=0; i<avg.length; i++) {
			int tot = 0;
			for(int j=0; j<avg.length; j++) {
				tot += sungjuk[i][j];
			}
			sungjuk[i][3] = tot;
			avg[i] = tot/3.0;
		}
		// 출력
		System.out.println("-------< 성적 계산표 >-------");
		System.out.println("이름 국어  영어 수학  합계   평균");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<sungjuk[i].length; j++) {
				System.out.print(sungjuk[i][j] + "  ");
			}
			System.out.println(avg[i]);
			System.out.println();
		}
	}
}