package lclass;

public class e_06_Circle_test {
	public static void main(String[] args) {
		Point po = new Point(5, 6);
		Circle cl = new Circle(po, 100);	// 생성자 호출: 둘레, 면적이 이미 계산되어있음, 100: 반지름
		cl.display();
		cl.setr(50);
		cl.display();
		System.out.println();
		
		Point po2 = new Point(10, 8);
		Circle cl2 = new Circle(po2, 100);
		if(cl.getCollision(cl2)) {
			System.out.println("두 원은 충돌했습니다.");
		}
		else {
			System.out.println("두 원은 충돌하지 않았습니다.");
		}
	}
}