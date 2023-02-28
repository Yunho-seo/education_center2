package lclass;
public class e_03_student_class {
	public static void main(String[] args) {
		Student st = new Student("대한이", 100, 90, 95);		// 인스턴스하면서 데이터 초기화
		st.print();		// 함수 호출 (출력)
		// 멤버 변수가 초기화되지 않으면, 0으로 자동 초기화됨.
		Student st2 = new Student("민국이", 100, 90);
		st2.print();
		
		// 연습문제 1 : "만세"를 저장하는 생성자를 오버로딩하는데 국어만 100점으로 입력하도록 생성자를 만들고 인스턴스하기
		Student st3 = new Student("만세", 100);
		st3.print();
		
		// 연습문제 2: "만세"를 "만세야"로 바꾸고 이름만 출력
		Student st4 = new Student("만세야");
		st4.print();
	}
}