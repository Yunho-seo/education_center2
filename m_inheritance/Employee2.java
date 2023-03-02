package m_inheritance;
// 10사람을 처리할 때에는 1사람을 기준으로 class를 만든다.
// 이질적인 데이터 
public class Employee2 {	// 이름, 나이, 성별, 주소, 급여
	String name;
	int age;
	String sex;
	String addr;
	long salary;			// 메모리에 인스턴스될 때 확보하는 메모리 양
	
	public Employee2() {	// 디폴트 생성자
		
	}
	
	// 생성자
	public Employee2(String name, int age, String sex, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.addr = addr;
		this.salary = salary;
	}
	
	/*
	//오버로딩
	public Employee2(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;		
	}
	*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public double bonus() {
		return salary * 1.5;
	}
	
	// 출력
	void display() {
		System.out.println("이름: " + name + " 나이: " + age + " 성별: " + sex +
				" 주소: " + addr + " 급여: " + salary + " 보너스: " + bonus());
	}
	
	public String toString() {		// 문자열을 요구하는 함수의 매개변수로 클래스 인스턴수 변수가 전달되면 작동해서 자동으로 실행됨
		return "이름: " + name + " 나이: " + age;
	}
	
}