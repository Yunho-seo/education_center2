package n_generic;
import java.util.*;
public class h_02_ArrayList {
	public static void main(String[] args) {
		// 부모 자녀 사이
		// 클래스로 만들어진 자료구조
		// 배열 (dim)
		// List는 인터페이스 : 인스턴스할 수 없음, 다만 부모로써 자식의 포인터를 가리킬 수는 있음
		// 부모는 자식을 가리킬 수 있다.
		// 알고리즘을 인터페이스에서 정의해놓고 클래스에서 오버라이딩 하고있음.
		List<String> a1 = new ArrayList<String>();	// ArrayList = 배열이면서, 리스트(List) => 배열 대신에 사용
		// ArrayList에는 CRUD에 대한 함수가 정의되어 있음
		a1.add("자라");
		a1.add("고래");
		a1.add("송어");
		System.out.println("ArrayList 출력");
		System.out.println("\t" + a1);
		List<String> l1 = new LinkedList<String>();	// 데이터 앞뒤에 주소가 달린 리스트
		l1.add("자라");
		l1.add("고래");
		l1.add("송어");
		System.out.println("\t" + l1);
		Set<String> s1 = new HashSet<String>();		// Iterable -> Collection -> set
		s1.add("자라");
		s1.add("고래");
		s1.add("송어");
		System.out.println("\t" + s1);
		// 키 데이터 형식으로 입력
		// 자바 자체에서도 사용하는 함수인 해시 함수
		Map m1 = new HashMap();		// hash 함수(키를 주소값으로 변환)를 사용 -> 해시 테이블에 저장
		m1.put("자라", "피");
		m1.put("고래", "고기");
		m1.put("송어", "어장");
		System.out.println("\t" + m1);
	}

}
