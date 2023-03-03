package n_generic;
import java.util.*;
import java.util.ArrayList;

public class h_04_ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		System.out.println("데이터 하나를 입력하세요");
		Scanner sc = new Scanner(System.in);
		arraylist.add(sc.nextLine());			// 데이터 입력
		// arraylist.add("충주");
		arraylist.add("천안");
		arraylist.add("천안");
		arraylist.add("아산");
		arraylist.add("오리");
		arraylist.add("서울");
		System.out.println(arraylist.get(1));	// 데이터 출력
		
		// 데이터 정렬
		// Collection 객체에 정렬 함수
		Collections.sort(arraylist);
		System.out.println(arraylist.get(1));
		System.out.println(Collections.frequency(arraylist, "천안"));		// 도수 : 도수분포표
		// binarySearch : 이진 탐색 : 정렬된 데이터에 대하여 실행됨
		System.out.println("검색" + Collections.binarySearch(arraylist, "오리"));
		System.out.println(arraylist);
		arraylist.remove("천안");			// 데이터 삭제
		System.out.println(arraylist);
		arraylist.set(1, "대전");			// 데이터 수정
		System.out.println(arraylist);
	}
}
