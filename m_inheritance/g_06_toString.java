//toString()을 사용하여 해결하는 문제
//Student25 class에 번호와 이름을 저장하도록 클래스를 구성하고
//문자열을 요구하는 함수에 매개변수로 던져지면 이름과 번호가 출력이 되도록 클래스를 작성해서
//데이터 101, "대한민국만세"로 초기화한 다음 출력

package m_inheritance;
class Student {
	private int rno;
	private String name;
	
	public Student(int r, String n) {
		rno = r;
		name = n;
	}
	
	public String toString() {		// 문자열을 리턴
		return rno + ", " + name;
	}	// 오버라이딩
}

public class g_06_toString {
	public static void main(String[] args) {
		Student25 s = new Student25(101, "대한민국만세");
		System.out.println("학생정보: ");
		System.out.println(s);
	}
}