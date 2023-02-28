package lclass;
//연습문제 3 : name과 age를 저장하는 Person class를 만들고 
//멤버함수는 데이터를 초기화하는 생성자를 만들고 각 데이터를 get, set하는 함수를 작성
//만들어진 Person class를 인스턴스하여 대한이:13, 민국이:14, 만세:15살인 데이터 저장
public class e_04_Person_test {
	public static void main(String[] args) {
		Person ps1 = new Person("대한이", 13);		// 생성자는 2개(name, age)
		Person ps2 = new Person("민국이", 14);
		Person ps3 = new Person("만세", 15);
		ps1.print();	// 출력
		ps2.print();
		ps3.print();
		
		// 배열 1
		Person [] ps_dim = new Person[3];	// 배열을 인스턴스 -> 생성자 (디폴트 생성자가 있어야 함)
		ps_dim[0] = new Person("대한이", 13);
		ps_dim[1] = new Person("민국이", 14);
		ps_dim[2] = new Person("만세", 15);
		for(Person ps : ps_dim) {		// 출력
			ps.print();
		}
		
		// 배열 2
		String st_arr[] = { "대한이", "민국이", "만세" };
		int age_arr[] = {10, 11, 12};
		Person [] ps_arr = new Person[st_arr.length];
		for(int i=0; i<st_arr.length; i++) {
			ps_arr[i] = new Person(st_arr[i], age_arr[i]);
		}
		for(Person ps : ps_arr) {
			ps.print();
		}
	}
}