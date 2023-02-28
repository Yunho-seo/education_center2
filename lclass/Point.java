package lclass;

public class Point {
	double x;
	double y;
	
	public Point() {
		
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
		
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double distance() {						// 대각선 길이 (원점으로부터의 거리값)
		return Math.sqrt(x*x + y*y);
	}
	
	public double angle() {							// 각도 함수
		double radian_result = Math.atan2(x, y);	// 길이의 비를 라디안으로 변환
		return Math.toDegrees(radian_result);		// 라디안을 각도로 변환
	}
	
	public double distanceToPoint(Point po) {		// 임의의 점에서 (x, y) 좌표까지의 거리 (두 점까지의 거리값)
		double dx = this.x - po.x;
		double dy = this.y - po.y;
		return Math.sqrt((dx*dx) + (dy*dy));
	}
}
