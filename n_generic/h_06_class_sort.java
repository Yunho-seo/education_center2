package n_generic;
import java.util.*;
// 클래스는 사용자 정의 데이터타입 -> 멤버변수가 다양하게 구성 -> 기준점을 선정하기 어렵다
// 인터페이스 구현을 통해 기준점을 생성
class Student77 implements Comparable<Student77> {		// 인스턴스 구현을 통해 클래스 비교가 가능하도록 함
	int rollno;
	String name;
	int age;
	Student77(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	// 0, 1, -1
	// 앞, 뒤의 관계
	public int compareTo(Student77 st) {			// 클래스가 들어오면 age를 통해 구분
		if (age == st.age) {	
			return 0;
		}
		else if (age > st.age){
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class h_06_class_sort {
	public static void main(String[] args) {
		ArrayList<Student77> a1 = new ArrayList<Student77>();
		a1.add(new Student77(101, "대한", 23));
		a1.add(new Student77(106, "민국", 27));
		a1.add(new Student77(105, "만세", 21));
		Collections.sort(a1);		// 클래스 정렬 => 나이로 정렬
		for (Student77 st : a1) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}