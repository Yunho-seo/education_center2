// h_07_dept 연습


package n_generic;
import java.util.*;
// 연습문제 1 : Dept 클래스를 생성하고(부서번호, 부서명, 회사 위치) : 생성자, get/set 함수, 출력 함수 만들기
// 다음과 같이 데이터를 입력
// (10, "회계부", "서울");
// (20, "연구부", "대전");
// (30, "영업부", "대구");
// (40, "생산부", "천안");
// (50, "개발부", "전주");
// ArrayList에 입력하고 출력하기 (출력 방법 3가지(for문, while문, forEach))
// 50번 부서 삭제해보기
// 정렬(sort)하고 이진 검색(binary search)을 수정하여 30번 검색하기 -> 검색기준에 Comparator를 직접 구현하여 넣음
class Dept {
	int cnum;
	String Dept_name;
	String addr;
	
	public Dept(int cnum, String Dept_name, String addr) {
		this.cnum = cnum;
		this.Dept_name = Dept_name;
		this.addr = addr;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {		// toString()으로 오버라이딩
		return "(" + cnum + ", " + Dept_name + ", " + addr + ")";
	}
	
}
//(10, "회계부", "서울");
//(20, "연구부", "대전");
//(30, "영업부", "대구");
//(40, "생산부", "천안");
//(50, "개발부", "전주");
public class test {
	public static void main(String[] args) {
		Dept d1 = new Dept(10, "회계부", "서울");
		Dept d2 = new Dept(20, "연구부", "대전");
		Dept d3 = new Dept(30, "영업부", "대구");
		Dept d4 = new Dept(40, "생산부", "천안");
		Dept d5 = new Dept(50, "개발부", "전주"); 
		List<Dept> arraylist = new ArrayList<Dept>();
		arraylist.add(d1);
		arraylist.add(d2); 
		arraylist.add(d3); 
		arraylist.add(d4); 
		arraylist.add(d5);
		
		// for 문 사용하여 출력
		for(int i=0; i<arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println();
		
		// ListIterator 인스턴스하여 while 문으로 출력하기
		ListIterator<Dept> li = arraylist.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		// forEach 문 사용하여 출력
		System.out.println();
		arraylist.forEach(a->{System.out.println("(" + a.cnum + ", " + a.Dept_name + ", " + a.addr + ")");});
		
		arraylist.remove(4);			// 데이터 삭제
		System.out.println(arraylist);
	}

}
