package app;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point a = (Point)obj;
		if(a.x == this.x && a.y == this.y)
			return true;
		else
			return false;
	}
}

public class ToStringExample {

	public static void main(String[] args) {
		Point p = new Point(100,200);
		Point t = new Point(100,200);
		Point s = p;
		if(p.equals(t))
			System.out.println("p�� t�� ����");
		else
			System.out.println("p�� t�� �ٸ���");
		
		if(p.equals(s))
			System.out.println("p�� s�� ����");
		else
			System.out.println("p�� s�� �ٸ���");
		
		System.out.println(p.toString());
		System.out.println(p);
	}

}
