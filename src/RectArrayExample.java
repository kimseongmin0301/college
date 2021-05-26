// 0407 객체배열
import java.util.Scanner;
class Rect1 {
	int width, height;
	
	public Rect1(int w,int h) {
	width = w; height = h;
	}	
	public int getArea(){
		return width * height;
	}

}	
public class RectArrayExample {
	public static void changeWidth(Rect1[] a) {
		for(int k=0; k < a.length; k++) {
			a[k].width += 5;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner sc = new Scanner(System.in);
		Rect1 [] data;
		data = new Rect1[5];
		
		for(int k=0; k < data.length; k++) {
			System.out.print("넓이: ");
			i = sc.nextInt();
			System.out.print("높이: ");
			j = sc.nextInt();
			data[k] = new Rect1(i,j);		
		}
		for(int k=0; k < data.length; k++) {
			System.out.println("면적: " + data[k].getArea());
		}
		
		changeWidth(data);
		for(int k=0; k < data.length; k++) {
			System.out.println("면적: " + data[k].getArea());
		}
		sc.close();
	}
}
