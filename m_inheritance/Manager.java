package m_inheritance;
public class Manager extends Employee2 {
// 생성자가 없을 경우
	public String department;
	public Employee2 sub[];		// 직원 정보를 입력하기 위한 배열
	
	public Manager() {
		
	}
	
	public Manager(String name, int age, String sex, String addr, long salary, String department) {
		super(name, age, sex, addr, salary);	// 상속 시 부모의 생성자를 명시적으로 호출
		this.department = department;
		this.sub = new Employee2[2];			// 배열에 주소 데이터가 입력될 공간을 확보
		
	}
	
	public void displayEmployee2() {
		for(int i=0; i<sub.length; i++) {
			sub[i].display();
		}
	}
	
	// 오버라이딩
	public void display() {
		System.out.println(" 담당부서: " + this.department);
		System.out.println("부하직원의 수: " + this.sub.length);
		System.out.println("부서장");
		super.display();
		System.out.println("부서직원: ");
		displayEmployee2();
	}
}