package n_generic;
class Box<T> {			// 대표 데이터 타입 : T (Box라는 클래스는 T를 대표 데이터로 지정하고 실제 사용하는 타입으로 변화)
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

// 상속이 아님에도 다양한 데이터 타입을 받아서 처리하는 함수
public class h_01_Box {
	public static <E> void printArray( E[] inputArray ) {	// 함수에 대표타입(E)을 지정, E[] : 제네릭 배열
		for(E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// generic에서는 class, interface등 사용이 가능하다.
		Integer[] intArray = { 1, 2, 3, 4, 5 };					// 정수형 배열
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		
		Box<Integer> integerBox = new Box<Integer>();	// 클래스는 구체적인 데이터타입을 인스턴스할 때 지정한다.
		Box<String> stringBox = new Box<String>();
		integerBox.add(Integer.valueOf(10));			// 추가
		stringBox.add(new String("안녕 일반화 프로그램"));
		System.out.printf("정수형 :%d\n\n", integerBox.get());
		System.out.printf("문자형 :%s\n", stringBox.get());
	}
}