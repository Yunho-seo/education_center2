package lclass;
// 독립적인 Student 클래스
public class Student {		// 인스턴스시 공간만 확보 -> 데이터 초기화가 필요함
	String name;
	int kor;
	int mat;
	int eng;
	
	// 인스턴스 될 때 초기화시키기 위해
	// 생성자는 강제 호출이 불가능 => 초기화될 때 자동으로 한번만 실행
	// 리턴값을 붙이지 않음
	// 이름은 클래스 이름과 같다.
	// 생성자 overloading
	public Student(String name, int kor, int mat, int eng) {		// 초기화하는 생성자
		this.name = name;		// 클래스가 인스턴스 되었을 경우 자기자신을 가리키는 지시자
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	public Student(String name, int kor, int mat) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
	}
	
	// e_03_student_class 연습문제 1
	public Student(String name, int kor) {
		this.name = name;
		this.kor = kor;
	}
	
	// e_04_student_class 연습문제 1
	public Student(String name) {
		this.name = name;
	}
	
	public void setStudentName(String name) {
		this.name = name;
	}
	public String getStudentName() {
		return name;
	}
	public void print() {
		System.out.println("이름:" + name + " 국어:" + kor + " 수학:" + mat + " 영어:" + eng);
	}
}