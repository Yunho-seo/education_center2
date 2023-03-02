package m_inheritance;

// 회사
// 직원이 6명이 있음 (3명, 3명)
// 매니저는 직원이면서, 관리자가 2명이 있음
// Employee 클래스
//  => 출력, 보너스함수는 급여에서 1.5배를 곱해서 계산하는 함수를 가지고 있음
// Employee를 상속받은 Manager 클래스가 있어야 함 (상속구조로 클래스 작성하기)
// 매니저는 직원 명단을 가지고 있어야 함
// 매니저는 자기 부서와 직원을 출력할 수 있어야 함
//  name, age, sex,       addr,  salary, department
// "대한이", 23, "남", "서울시 강북구", 1500000
// "민국이", 35, "남", "대전시 쌍용동", 2500000
// "김관리", 40, "여", "서울시 강남구", 5000000, "개발부"
// "희망이", 23, "남", "서울시 강북구", 1500000
// "하면됨", 35, "남", "대전시 쌍용동", 2500000
// "이소정", 40, "여", "서울시 영등포", 5000000, "연구부"

public class f_05_Company2 {
	public static void main(String[] args) {
		Employee2 el1 = new Employee2("대한이", 23, "남", "서울시 강북구", 1500000);
		Employee2 el2 = new Employee2("민국이", 35, "남", "대전시 쌍용동", 2500000);
		Employee2 el4 = new Employee2("희망이", 23, "남", "서울시 강북구", 1500000);
		Employee2 el5 = new Employee2("하면됨", 35, "남", "대전시 쌍용동", 2500000);
		Manager[] co = new Manager[2];
		Manager ma1 = new Manager("김관리", 40, "여", "서울시 강남구", 5000000, "개발부");
		ma1.sub[0] = el1;		// 부서직원을 등록
		ma1.sub[1] = el2;	
		Manager ma2 = new Manager("이소정", 40, "여", "서울시 영등포", 5000000, "연구부");
		ma2.sub[0] = el4;
		ma2.sub[1] = el5;
		co[0] = ma1;
		co[1] = ma2;
		
		System.out.println("전체 직원현황");
		for(int i=0; i<co.length; i++) {
			co[i].display();
		}
		
		// 클래스 인스턴스 변수를 출력
		System.out.println(el1);	// toString이 오버라이딩 되어 있음
		System.out.println(ma1);	// toString이 오버라이딩 되어 있지 않아도 부모를 상속받음
	}
}