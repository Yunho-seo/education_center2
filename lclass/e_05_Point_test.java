package lclass;
public class e_05_Point_test {
	public static void main(String[] args) {
		Point po = new Point(5, 3);
		System.out.println(po.getX());		// x 좌표
		System.out.println(po.getY());		// y 좌표
		System.out.println("원점으로부터의 거리: " + po.distance());
		System.out.println("각도: " + po.angle());
		
		Point po2 = new Point(10, 20);
		System.out.println("두 포인트 간의 거리: " + po2.distanceToPoint(po));
	}
}