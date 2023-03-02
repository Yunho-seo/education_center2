package m_inheritance;
// 예외 처리
// 프로그램은 기본적으로 파일 공간이 넉넉하고, 네트워크가 작동하고, 서버가 작동한다는 전제조건에서 진행
// 예외적으로 파일 공간이 부족하거나 네트워크가 물리적으로 끊어져있거나 서버가 죽은 경우
// 프로그램이 중지될 때 예외를 처리하고 프로그램이 지속적으로 동작하도록 하는 것
// try-catch finally
public class g_04_exception {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];					// 배열은 공간을 확보하고 값을 대입해야 함
			// a[5] = 30/0;							// 0으로 나누면 안된다 (예외)
			// a[5] = 30;							// 인덱스 범위 초과
			a[4] = 30;
		}
		
		// Exception은 클래스 생성이 되어 있음
		// 예외는 Exception을 상속받아 구현 : 하위 예외처리 문들은 문법적 에러가 발생
		/*
		catch (Exception e) {						// 그 외 다른 예외가 발생했을 경우
			System.out.println(e);
		}
		*/
		// 예외의 부모 클래스는 자식 예외의 뒤에 있어야 함
		catch (ArithmeticException e) {				// 수치 연산 에러인 경우 (연산 에러)
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)	// 배열의 인덱스가 경계선을 넘었을 경우
		{
			System.out.println("인덱스가 없습니다.");
		}
		catch (Exception e) {						// 그 외 다른 예외가 발생했을 경우, 최상위 에러
			System.out.println(e);
		}
		finally {									// finally 문 내의 동작은 반드시 실행 (예외가 발생하더라도)
			System.out.println("마지막은 항상 실행");
		}
	}
}