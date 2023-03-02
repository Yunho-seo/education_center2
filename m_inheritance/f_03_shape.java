package m_inheritance;
// 면적, 출력함수, 계산함수 -> 부모
// Rectangle, Circle, Triangle
// 가로 세로, 반지름, 밑변과 높이가 각각 필요
// 계산 방법만 다른 경우 -> 함수 이름은 같되 다른 일을 하는 재정의를 이용한다.
class Shape {
	// 3번 적용되어야 하는 코드를 한번으로 줄임.
	public double area;			// 공통
	public void display() {		// 공통
		System.out.println("면적은 " + this.area + "입니다. ");
	}
	// 함수명도 하나만 알고 있으면 객체마다 다른 계산을 호출할 수 있음.
	public void calcArea() {	// 오버라이딩 대상
		
	}
}

class Circle extends Shape {
	public double radius;		// 원에 추가된 변수
	public Circle(double radius) {
		this.radius = radius;
		calcArea();
	}
	public void calcArea() {	// 재정의(오버라이딩)
		area = Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	public double width;		// 추가
	public double height;		// 추가
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		calcArea();
	}
	
	public void calcArea() {	// 재정의(오버라이딩)
		area = width * height;
	}
}

class Triangle extends Shape {	// 이등변삼각형
	public double width;
	public double height;
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		calcArea();
	}
	public void calcArea() {
		area = width * height/2;
	}
}

public class f_03_shape {
	public static void main(String[] args) {
		Circle cl = new Circle(10);
		cl.display();
		Rectangle re = new Rectangle(10, 20);
		re.display();
		Triangle tr = new Triangle(10, 5);
		tr.display();
		
		// 부모의 배열을 이용하여 일시에 처리
		Shape[] parent = new Shape[3];
		parent[0] = cl;		// 자식을 부모의 배열에 대입
		parent[1] = re;
		parent[2] = tr;
		for(int i=0; i<3; i++) {
			parent[i].display();
		}
	}
}