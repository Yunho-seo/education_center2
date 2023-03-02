package m_inheritance;
//toString()을 사용하여 해결하는 문제
//Student25 class에 번호와 이름을 저장하도록 클래스를 구성하고
//문자열을 요구하는 함수에 매개변수로 던져지면 이름과 번호가 출력이 되도록 클래스를 작성해서
//데이터 101, "대한민국만세"로 초기화한 다음 출력
public class Student25 {
	int num;
	String name;
	
	public Student25() {
		
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student25(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public String toString() {
		return num + ", " + name;
	}
}