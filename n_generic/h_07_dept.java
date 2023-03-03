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
package n_generic;
import java.util.*;
class Dept2 {
	public int deptno;
	public String dname;
	public String loc;
	public Dept2() {		// Default 생성자
		
	}
	public Dept2(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public Integer getDeptno() {
		return Integer.valueOf(deptno);
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public String toString() {
		return "(" + deptno + ", " + dname + ", " + loc + ")";
	}
}

public class h_07_dept {
	public static void main(String[] args) {
		Dept2 d1 = new Dept2(10, "회계부", "서울");
		Dept2 d2 = new Dept2(20, "연구부", "대전");
		Dept2 d3 = new Dept2(30, "영업부", "대구");
		Dept2 d4 = new Dept2(40, "생산부", "천안");
		Dept2 d5 = new Dept2(50, "개발부", "전주"); 
		ArrayList<Dept2> a1 = new ArrayList<Dept2>();
		// 데이터를 참조하지 않고, a1.add(new Dept2(10, "회계부", "서울")); 로 직접 대입해도 된다.
		a1.add(d1);
		a1.add(d2);
		a1.add(d3);
		a1.add(d4);
		a1.add(d5);
		
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			Dept2 st = (Dept2) itr.next();		// 반복자는 위치만 가르키고 어떤 데이터타입인지 모르기에 캐스팅을 해주어야 함
			System.out.println(st);
		}
		
		System.out.println();
		a1.forEach(a->{					// 람다 함수(lambda)
			System.out.println(a);
		});
		

		itr = a1.iterator();
		while(itr.hasNext()) {
			Dept2 st = (Dept2) itr.next();
			if(st.deptno == 50) {		// deptno가 50에 해당할 때
				a1.remove(st);			// 데이터를 통째로 넘겨온다
				break;
			}
		}
		
		// 검색 : generic에서는 Wrapper class만 가능하다
		Comparator<Dept2> comp = new Comparator<Dept2>() {
			public int compare(Dept2 u1, Dept2 u2)
			{
				return u1.getDeptno().compareTo(u2.getDeptno());
			}
		};
		Collections.sort(a1, comp);
		int index = Collections.binarySearch(a1, new Dept2(30, null, null), comp);
		System.out.println("이진 검색으로 찾은 인덱스: " + index);
		System.out.println("이진 검색으로 찾은 데이터: " + a1.get(index));		// class
		a1.get(index).setLoc("개발부");
		int index2 = Collections.binarySearch(a1, new Dept2(10, null, null), comp);
		a1.remove(index2);
		
		// LinkedList : 삽입, 삭제가 용이하다
		LinkedList<Dept2> ll = new LinkedList<Dept2>();
		ll.add(d1);
		ll.add(d2);
		ll.add(d3);
		ll.add(d4);
		ll.add(d5);
		System.out.println();
		
		Iterator<Dept2> itr2 = ll.iterator();
		while (itr2.hasNext()) {
			Dept2 dept2 = (Dept2) itr2.next();
			System.out.println(dept2);
		}
		System.out.println();
		
		LinkedList<Dept2> ll2 = new LinkedList<Dept2>();
		ll2.add(d1);
		ll2.add(d2);
		
		// LinkedList를 다른 LinkedList에 추가
		ll.addAll(ll2);
		ll.remove(0);
		
		// 하나의 LinkedList를 다른 LinkedList에서 삭제
		ll.removeAll(ll2);
		
		/*
		// 삽입 삭제
		ll.addFirst(d1);		// 선두 추가
		ll.addLast(d2);			// 후미 추가
		ll.removeFirst();		// 선두 삭제
		ll.removeLast();		// 후미 삭제
		ll.removeFirstOccurrence(d1);		// 처음 발생하는것
		ll.removeLastOccurrence(d2);		// 마지막에 발견되는 것
		ll.clear();				// 모두 지우기
		*/
		
		// 역순으로 순회하기
		System.out.println("역순으로 출력하기");
		Iterator reverse_iter = ll.descendingIterator();
		while(reverse_iter.hasNext()) {
			Dept2 dept2 = (Dept2)reverse_iter.next();
			System.out.println(dept2);
		}
	}
}
