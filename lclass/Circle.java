package lclass;
// 연습문제 1 : Circle 클래스 생성
// 중심점(point), 둘레(perimeter): 2*pi*r, 면적(area): pi*r*r
// 두 Circle 간의 거리는 Point 클래스의 distanceToPoint()
// 두 원은 충돌하는가?
public class Circle {
	Point po;
	double r;
	
	double perimeter;		// 계산
	double area;
	
	public Circle() {		// 디폴트 생성자
		
	}
	public Circle(Point po, double r) {
		this.po = po;
		this.r = r;
		
		calcPerimeter();
		calcArea();
	}
	
	public double getr() {
		return this.r;
	}
	
	public void setr(double r) {
		this.r = r;
		calcPerimeter();
		calcArea();

	}
	public void calcPerimeter() {					// 둘레
		this.perimeter = 2 * Math.PI * r;
	}
	
	public void calcArea() {						// 면적
		this.area = Math.PI * r * r;
	}

	public boolean getCollision(Circle cir2) {		// 충돌 여부 확인
		double tot_r = this.r + cir2.r;
		double dist = this.po.distanceToPoint(cir2.po);
		if(dist < tot_r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void display() {							// 출력
		System.out.println("원의 반지름은: " + getr());
		System.out.println("원의 둘레는: " + this.perimeter);
		System.out.println("원의 면적은: " + this.area);
	}
}
