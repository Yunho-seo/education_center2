package m_inheritance;
// throw는 프로그래머가 명시적 예외를 강제로 실행시킴
public class g_05_thread {
	static void validate(int age) {
		if (age < 10) {
			throw new ArithmeticException("정당하지 않습니다.");	// 수치 에러 발생
		}
		else {
			System.out.println("투표 권한 있음");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch (Exception m) {
			System.out.println("Exception 발생");
		}
	}
}