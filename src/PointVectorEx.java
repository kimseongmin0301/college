import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x= x; this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(10, 20));
		v.add(new Point(5, 40));
		v.add(new Point(20, 20));
		
		System.out.println(v.elementAt(1));
		v.remove(1);
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
	}

}
