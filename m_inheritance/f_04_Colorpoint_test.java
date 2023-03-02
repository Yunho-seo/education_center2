package m_inheritance;
// Point class도 사용을 하면서 GUI 프로그램에서 사용하기 위해
// point에 color값을 지정해야 하는 경우
class Point {
	public int x, y;
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double angle() {
		double radian_result = Math.atan2(x, y);
		return Math.toDegrees(radian_result);
	}
	
	public double distanceToPoint(Point po) {
		double dx = this.x - po.x;
		double dy = this.y - po.y;
		return Math.sqrt((dx*dx) + (dy*dy));
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public void display() {				// 출력
		System.out.println("x의 위치: " + x + " y의 위치: " + y);
	}
}

class Colorpoint extends Point {
	String color;
	public Colorpoint() {
		color = "검정";
	}
	public Colorpoint(String color) {
		// 부모의 생성자는 처음부터 호출되어야 함
		super(10, 100);		// 부모의 생성자 호출을 자식의 생성자에서 호출하는 것이 가능
		this.color = color;
	}
	// 생성자 오버라이딩을 통해서 상속받은 포인트의 좌표값과 color 값을 초기화
	public Colorpoint(String color, int x, int y) {
		super(x, y);
		this.color = color;
	}
	public void display() {
		System.out.println("x의 위치: " + x + " y의 위치: " + y + " 컬러값은: " + this.color);
	}
}

class Circle2 {
	Point po;
	double r;
	
	double perimeter;		// 계산
	double area;
	
	public Circle2() {// 디폴트 생성자	
		
	}
	// Point는 부모 <- 부모는 자식을 가리킬 수 있다.
	public Circle2(double r, Point po) {
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
	public boolean getCollision(Circle2 cir2) {		// 충돌 여부 확인
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

// 상속 사용하면 유지 보수가 편리하다 (부모가 자식을 가리킬 수 있다.)
public class f_04_Colorpoint_test {
	public static void main(String[] args) {
		Colorpoint cp1 = new Colorpoint("노랑", 100, 200);
		Colorpoint cp2 = new Colorpoint("파랑", 5, 6);
		cp1.display();
		cp2.display();
		
		// Colorpoint가 Point에 들어갈 수 있는 이유는 부모가 자식을 가리킬 수 있기때문에 가능
		// Point = ColorPoint가 대입된 것.
		// 부모가 자식을 가리키는 것 (추가된 것은 못 가리킴)
		Circle2 cl1 = new Circle2(100, cp1);		// 원래 Circle2는 Point가 매개변수
		Circle2 cl2 = new Circle2(100, cp2);
		cl1.po.display();
		cl2.po.display();
		
		System.out.println("두 점 사이의 거리는: " + cl1.po.distanceToPoint(cl2.po));
		if(cl1.getCollision(cl2)) {
			System.out.println("두 점은 충돌합니다.");
		}
		else {
			System.out.println("두 점은 충돌하지 않습니다.");
		}
		
		
	}
}