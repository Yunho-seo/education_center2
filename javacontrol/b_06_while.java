package javacontrol;
// 프로그래밍은 처리 순서가 중요
import java.util.Scanner;
public class b_06_while {
	public static void main(String[] args) {
		int i=1;
		while (i<=10) {
			// i++;		순서를 바꾸면 처음값이 2가되고 9번만 회전
			System.out.println(i);
			i++;
		}
		i=1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		// 연습문제 1 : 컴퓨터 : 유저
		// 유저는 숫자를 입력받아 컴퓨터가 생성한 숫자를 맞추는 게임
		// 컴퓨터는 난수를 이용하여 1부터 100까지의 숫자를 선택한다.
		// 유저는 숫자를 입력하여 컴퓨터가 선정한 숫자를 맞춘다.
		// 게임이 종료되면 몇번 입력하였는지 입력 횟수를 출력.
		
		// 필요한 데이터 : 컴퓨터가 선택한 수(int), 사용자가 입력한 값(int), 입력횟수를 카운트할 변수(int)
		
		/*
		int nansu = (int)(Math.random()*100)+1;		// 컴퓨터가 생성하는 난수
		int dojeon = 0;								// 유저가 내놓는 수(답)
		boolean run = true;							// 정답 판정
		int count = 0;								// 유저가 맞춘 횟수
		Scanner sc = new Scanner(System.in);
	
		System.out.println("값을 입력하세요 >> ");
		while(run) {
			dojeon = sc.nextInt();
			
			if(dojeon == nansu) {
				System.out.println("정답입니다. " + (count+1) + " 번만에 맞췄습니다");
				break;
			}
		
			if(dojeon > nansu) {
				System.out.println("작은 수를 입력하세요");
			}
			else {
				System.out.println("큰 수를 입력하세요");
			}
			count++;
		}
		*/
		/* 선생님 답안
		int answer = (int) (Math.random()*100)+1;
		int input = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			input = sc.nextInt();
			
			if (answer > input) {
				System.out.println("숫자가 작습니다.");
			} else if(answer < input) {
				System.out.println("숫자가 큽니다.");
			} else {
				System.out.println("정답입니다.");
				System.out.println(count + " 번만에 맞췄다.");
				break;
			}
		} while(true);
		*/
		
		// 추가 문제 : 게임이 끝나면 몇전 몇승 몇패를 출력하도록 여러번 게임이 가능하도록 수정
		// 중간에 -1이나 빈 데이터가 들어오면 중지하도록 수정
		// 입력된 내용이 없는 것을 확인하고자 할 때는 문자열로 입력받아 isEmpty() 함수 사용할 것.
		// 문자열 비교 : equals("-1") 할 것.
		// sc.isEmpty(), sc.equals("-1")
		
		int answer = 0;
		int input = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int battle = 0;
		int win = 0;
		
		String temp;		// 게임 여부 확인을 위한 temp 변수
		while(true) {
			System.out.println("게임 시작, (시작은 y, 종료는 -1)");
			temp = sc.nextLine();
			if(temp.isEmpty() || temp.equals("-1")) {
				break;
			}
			battle += 1;
			answer = (int) (Math.random()*100)+1;
			
			do {
				count++;
				input = Integer.parseInt(sc.nextLine());	// 한줄 입력이 가능
				
				if (answer > input) {
					System.out.println("숫자가 작습니다.");
				} else if(answer < input) {
					System.out.println("숫자가 큽니다.");
				} 
				else {
					System.out.println("정답입니다.");
					System.out.println(count + " 번만에 맞췄다.");
					win += 1;
					break;
				}
			} while(true);
		}
		sc.close();
		
		System.out.printf("%d전 %d승 %d패 입니다.", battle, win, battle-win);
	}
}
