package kfunction_pkg;

// static이 생략된 경우에는, 반드시 instance를 해야 함.
public class d_06_instance {
	public long sum(int... temp) {		// ... : 변동 매개변수, 변동하여 배열을 만들어서 데이터를 입력. temp가 배열
		long sum = 0;
	
		for(int i=0; i<temp.length; i++) {
			sum += temp[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		d_06_instance v1 = new d_06_instance();		// 클래스 인스턴스 : 클래스의 데이터를 저장하기 위해 메모리를 확보하는 과정
		
		long s1 = v1.sum(1, 2);
		System.out.println(s1);
		long s2 = v1.sum(1, 2, 3, 4);
		System.out.println(s2);
	}
}