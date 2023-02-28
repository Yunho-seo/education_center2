package lclass;
// 생성자를 안만들면 Default 생성자가 기본으로 생성됨
// 학생 클래스
class Student99 {		// 클래스 = 멤버변수(데이터) + 멤버함수(메서드: 처리)
	// 변수만 선언, 데이터 없음 (데이터가 저장되도록 공간만 확보)
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {		// 학생의 정보 출력
		System.out.println("학생의 이름은 " + studentName + ", 주소는 " + address + "입니다.");
	}
	String getStudentName() {			// 이름을 반환
		return studentName;				// 홍길동
	}
	void printGreeting(String name) {	// name 문자열을 매개변수로 받아 출력, void만 달면 리턴값이 없음
		System.out.println(name + "님 안녕하세요~^^");
		return;		// printGreeting()이 void형이라 아무것도 없이 리턴
	}
}

public class e_02_inner_class {
	public static void main(String[] args) {
		// 클래스 사용을 위해 인스턴스
		Student99 student1 = new Student99();		// 공간확보 - 데이터 상태
		student1.studentName = "홍길동";
		String name = student1.getStudentName();
		System.out.println(name);
		// 연습문제 1 : 주소에 대전시 탄방동으로 초기화하고 출력하기.
		student1.address = "대전시 탄방동";
		student1.showStudentInfo();		// 에러 발생 // null
		
		// 연습문제 2 : printGreeting() 함수를 이용하여 대한이에게 인사하기
		student1.printGreeting("대한");
		
		// 연습문제 3 : 강하늘, 서울시로 데이터 입력하기
		Student99 student2 = new Student99();
		student2.studentName = "강하늘";
		student2.address = "서울시";		
		student2.showStudentInfo();		// 함수는 선언할때 한번만 만들어짐, 인스턴스할때는 멤버변수 공간만 힙에 할당.
	}

}
