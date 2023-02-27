package kfunction_pkg;
public class d_03_return_array {
	/*
	static int[] makeArray() {		// int[] : 주소값을 리턴
		int temp[] = new int[4];	// 힙에 정수형 데이터 4개를 저장하는 영역을 만들고 그 주소를 대입
		for(int i=1; i<temp.length+1; i++) {
			temp[i-1] = i * 100;	// 100, 200, 300, 400
		}
		return temp;
	}
	
	// 값을 넘기기 : Call by Value
	static int[] makeArray(int count, int basic) {	// 주소값을 리턴
		int temp[] = new int[count];
		for(int i=1; i<temp.length+1; i++) {
			temp[i-1] = i * basic;
		}
		return temp;
	}	
	
	// Garbage Collection은 참조가 0이 되면 메모리를 해제
	public static void main(String[] args) {
		int returnArray[];			// 메인 스택 영역에 배열이 만들어짐, 주소값이 저장 : reference, 데이터를 참조
		returnArray = makeArray();
		for(int i=0; i<returnArray.length; i++) {
			System.out.println(returnArray[i]);
		}
	}
	*/
	
	// 연습문제 1 : main()에서 10, 20, 30, 40 배열을 만들어서 함수를 만들어(매개변수) 배열을 전달받고
	// 전달받은 배열의 모든 데이터를 합계를 내어 리턴받은 다음 main()에서 출력
	
	// 데이터가 여러개 들어가는 주소값으로 처리
	// Call by Reference -> 데이터가 여러개를 담고있는 변수 ~ 배열, 클래스(class)
	static int makehab(int data[]) {
		int sum = 0;
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		
		return sum;
	}
	
	// 데이터 타입, 데이터 개수, 자료구조
	public static void main(String[] args) {
		int data[] = {10, 20, 30, 40};
		
		int habresult = makehab(data);
		System.out.println(habresult+" ");
		
		/*
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i * 10;
		}
		habresult = makehab(data);
		System.out.println(habresult+" ");
		
		data = makeArray(1000, 1000);
		habresult = makehab(data);
		System.out.println(habresult+" ");	
		*/
	}
}