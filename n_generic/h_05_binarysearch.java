package n_generic;
import java.util.*;
class Domain {				// 클래스
	private int id;			// primitive data type
	private String url;
	
	public Domain(int id, String url) {
		this.id = id;
		this.url = url;
	}
	
	// id의 타입이 int형인데 리턴 시 Integer를 사용하는 이유?
	// 제너릭(generic)에서는 클래스를 사용하기 때문이다. ( 클래스는 사용자 정의 타입, int는 프리미티브 )
	public Integer getId() {
		return Integer.valueOf(id);	
	}
}

// 클래스는 사용자 정의 데이터타입 -> 클래스를 비교하는 방법이 있어야 함
public class h_05_binarysearch {
	public static void main(String[] args) {
		List<Domain> l = new ArrayList<Domain>();
		l.add(new Domain(10, "http://naver.com"));
		l.add(new Domain(20, "민국"));
		l.add(new Domain(30, "만세"));
		l.add(new Domain(40, "오리"));
		Comparator<Domain> c = new Comparator<Domain>() {
			public int compare(Domain u1, Domain u2) { 		// 함수 구현해주어야 함
				return u1.getId().compareTo(u2.getId());
			}
		};
		
		// 클래스인 경우에는 비교 방법을 지정해주어야 함
		int index = Collections.binarySearch(l, new Domain(20, null), c);
		System.out.println("다음 위치에서 발견됨: " + index);
		
		index = Collections.binarySearch(l, new Domain(5, null), c);			// 없으면 -1 출력
		System.out.println(index);
		index = Collections.binarySearch(l, new Domain(20, "오리"), c);
		System.out.println(index);
	}
}