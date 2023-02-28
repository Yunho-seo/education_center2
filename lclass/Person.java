package lclass;

public class Person {
	public String name;
	public int age;
	public Person() {		// 디폴트 생성자 : 디폴트 생성자는 생성자가 없으면 자동으로 만들어 줌, 배열처리 때문에
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>200) {
			age = 200;		// 데이터 보호 가능
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void print() {
		System.out.println("이름은:" + this.name + " 나이는:" + this.age);
	}
}