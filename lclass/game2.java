package lclass;
import java.util.Scanner;

public class game2 {
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임");
		Scanner sc = new Scanner(System.in);

		while (true) {
			showMenu(); // 메뉴 출력

			int user = inputChoice(sc); // 사용자 입력
			if (user == 0) // 0 이면 게임 종료
				break;

			int com = (int) Math.floor(Math.random() * 3) + 1;
			displayChoice(user, com); // 양측의 선택 출력
			computeResult(user, com); // 승부 결과 출력
		}
		sc.close();
	}

	public static void showMenu() {
		System.out.println("----------------");
		System.out.println("[1] 가위");
		System.out.println("[2] 바위");
		System.out.println("[3] 보");
		System.out.println("[0] 종료");
		System.out.println("----------------");
	}

	public static int inputChoice(Scanner sc) {
		int choice = 0;

		System.out.print("선택 : ");
		choice = sc.nextInt();
        
		while (choice < 0 || choice > 3) {
			System.out.println("다시 입력해주세요\n선택");
			choice = sc.nextInt();
			System.out.print("선택 : ");
		}
		return choice;
	}

	public static void displayChoice(int user, int com) {
		String userCho = getHandType(user);
		String comCho = getHandType(com);

		System.out.println("사용자 vs 컴퓨터");
		System.out.println(userCho + " vs " + comCho);
	} 
    
	public static String getHandType(int choice) {
		if (choice == 1)
			return "가위";
		else if (choice == 2)
			return "바위";
		else
			return "보";
	}

	public static void computeResult(int user, int com) {
		if (user == com)
			System.out.println("비겼습니다.");
		else if (com != (user % 3) + 1)
			System.out.println("User Win!");
		else
			System.out.println("Com Win!");
	}
}