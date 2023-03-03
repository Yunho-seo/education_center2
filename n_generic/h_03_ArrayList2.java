package n_generic;
import java.util.*;

class MemberDto {
	public int num;
	public String name;
	public String addr;
	
	public MemberDto() {	// 디폴트 생성자
		
	}
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {		// toString은 Object에서 상속 받아 문자열을 요구하는 함수의 매개변수로 던져지면 문자열을 출력함
		return "번호:" + num + " 이름:" + name +" 주소:" + addr;
	}
	
}

public class h_03_ArrayList2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		for(int i=0; i<names.size(); i++) {		// size() 함수를 사용하여 인덱싱
			String tmp = names.get(i);		// 인덱스로 출력
			System.out.println(tmp);
		}
		System.out.println("--- 확장 for문 사용 ---");
		for(String tmp:names) {				// 객체로 출력
			System.out.println(tmp);
		}
		
		MemberDto dto1 = new MemberDto(1, "김일", "노량진");
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "", "상도동");
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		System.out.println("ArrayList 출력");
		System.out.println("\t " + members);
		for(int i=0; i<members.size(); i++) {
			System.out.println(members.get(i));
		}
		// iterator 반복자 : 데이터를 순차적으로 가리키는 reference
		ListIterator<MemberDto> listIterator2 = members.listIterator();		// 시작점의 데이터 위치
		// 처음 데이터가 있으면
		while (listIterator2.hasNext()) {				// hasNext : 데이터 여부를 확인
			System.out.println(listIterator2.next());	// next를 이용하여 한칸씩 포인터가 이동
		}
		
		while (listIterator2.hasNext()) {				// 반복자가 마지막을 가리키기 때문에 출력 X
			System.out.println(listIterator2.next());
		}
		
		while (listIterator2.hasPrevious()) {			// Previous 사용(순서 거꾸로)
			System.out.println(listIterator2.previous());
		}

		listIterator2 = members.listIterator();
		while (listIterator2.hasNext()) {
			System.out.println(listIterator2.next());
		}
		
		// 함수형 프로그래밍 (for문을 생략)
		// 람다함수 -> 자바에서는 함수 하나를 만들려 해도 클래스를 사용해야 함
		// 무명함수 : 함수가 요구되는 곳에 함수를 즉시 정의하여 사용
		// 다음에는 사용하지 않을 함수를 의미
		// forEach 문은 매개변수로 함수를 요구하는 함수
		members.forEach(a->{System.out.println(a.num + " " + a.name + " " + a.addr);});
		
		// 연습문제 1 : members에 들어있는 번호들의 합을 출력
		// for문을 사용하는 방법
		int hab = 0;
		for(int i=0; i<members.size(); i++) {
			// MemberDto dt = members.get(i);
			// hab += dt.num;
			hab += members.get(i).num;
		}
		System.out.println("인덱스를 이용한 번호의 합은: " + hab);
	
		// while문을 사용하는 방법
		listIterator2 = members.listIterator();
		while(listIterator2.hasNext()) {
			hab += listIterator2.next().num;
		}
		System.out.println("인덱스를 이용한 번호의 합은: " + hab);
		// forEach를 사용하는 방법 : 람다함수, 지역변수, static 변수
		
		
	}
}
