package lclass;
import java.util.Scanner;
public class e_07_student90_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명을 입력하시겠습니까? ");
		int studentnum = Integer.parseInt(sc.nextLine());
		Student90[] school = new Student90[studentnum]; // 2인분
		for (int i = 0; i <school.length; i++) {
			school[i] = new Student90(); // default 생성자가 동작
			school[i].no =i+1;
		}
		System.out.println(school[0].printhead());
		for(int i = 0; i < school.length; i++) {
			System.out.println(school[i].lasttoString());
		}
		
		System.out.println("===================성적관리 프로그램===================");
		menuOpen(school);
	}
	
	public static void sort(Student90[] school, int sel) {
		if (sel == 1) {					// 점수 정렬
			for (int i=0; i<school.length; i++) {
				boolean changed = false;
				for(int j=0; j<school.length-i-1; j++) {
					if (school[j].total < school[j+1].total) {
						Student90 temp;
						temp = school[j];
						school[j] = school[j+1];
						school[j+1] = temp;
						changed = true;
					}
				}
				if(!changed) {
					break;
				}
			}
		}
			else if (sel == 2) {		// 번호순으로 보기 위해 번호를 중심으로 정렬
				for (int i=0; i<school.length; i++) {
					boolean changed = false;
					for (int j=0; j<school.length-i-1; j++) {
						if (school[j].no > school[j+1].no) {
							Student90 temp;
							temp = school[j];
							school[j] = school[j+1];
							school[j+1] = temp;
							changed = true;
					}
				}
				if (!changed) {
					break;
				}
			}
		}
	}

	
	public static void menuOpen(Student90[] school) {
		int inputNum = 0;
		boolean re = false;
		Scanner sc = new Scanner(System.in);
		while (!re) {
			re = true;
			System.out.println("-------------성적관리 프로그램-------------");
			System.out.println("1.검색, 2.출력, 3.수정, 8.과목별합계출력, 9.종료");
			// 출력 전, 총점으로 정렬하여 등수를 입력하고 다시 번호로 정렬
			System.out.println("메뉴선택");
			inputNum = Integer.parseInt(sc.nextLine());
			switch (inputNum) {
			case 1:
				System.out.println("1. 검색내용");
				System.out.println("검색할 이름을 입력하세요");
				String inputname = sc.nextLine();
				for(int i=0; i<school.length; i++) {
					if (school[i].name.equals(inputname)) {
						System.out.println(school[i].lasttoString());
					}
				}
				break;
			case 2:
				System.out.println("2. 출력내용");
				// 등수를 부여하기 위해 점수로 정렬 (내림차순으로 정렬하고 등수를 부여)
				sort(school, 1);
				for(int i=0; i<school.length; i++)
					school[i].ranking = i+1;
				// 시각화하기 위해서 번호를 중심으로 재정렬
				sort(school, 2);
				
				System.out.println(school[0].printhead());
				for(int i=0; i<school.length; i++) {
					System.out.println(school[i].lasttoString());
				}
				break;
				
				// 1. 3번(수정)하고 8번(과목별 합계출력)은 팀별과제
				// 2. 가위, 바위, 보를 클래스로 작성 (computer 클래스, user 클래스, judge 클래스를 만들어 구현)
			
			case 3:
				System.out.println("3. 수정");
				
				System.out.println("수정할 이름을 입력하세요");
				String inputname = sc.nextLine();
				for(int i=0; i<school.length; i++) {
					if (school[i].name.equals(inputname)) {
						break;
					}
				}
				System.out.println("수정할 과목을 선택하세요");
				System.out.println("국어[1], 수학[2], 영어[3]");
				int updateSubject = sc.nextInt();
				
				if(updateSubject == 1) {
					System.out.println("국어 점수 수정: ");
					school[2].setKor(sc.nextInt());
					
					// school[2].setKor(sc.nextInt());
				}
				else if(updateSubject == 2) {
					System.out.println("수학 점수 수정: ");
				}
				else if(updateSubject == 3) {
					System.out.println("영어 점수 수정: ");
				}
				else {
					System.out.println("잘못된 입력입니다.");
				}
			
				
			case 8:
				System.out.println("8. 과목별 합계출력");
				int kor_sum = 0;
				int mat_sum = 0;
				int eng_sum = 0;
				
				for (int i=0; i<school.length; i++) {
					kor_sum += school[i].kor;
					mat_sum += school[i].mat;
					eng_sum += school[i].eng;
				}
				
				System.out.println("국어 총합:" + kor_sum + " 수학 총합:" + mat_sum + " 영어 총합:" + eng_sum);
				break;
				
			case 9:
				re = true;
				break;
			default: {
				System.out.println("다시 입력해주세요");
				re = false;
				break;
				}
			}
		}
	}
}