import java.util.Vector;
import java.util.Scanner;

public class VectorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		double temp;
		Vector<Double> data = new Vector<Double>();
		System.out.println("Vector:용 량 " + data.capacity());
		
		while(true) {
			temp = sc.nextDouble();
			if(temp < 0) break;
			data.add(temp);
		}
		
		
		for(int i=0; i<data.size(); i++) {
			System.out.print(data.elementAt(i)+" ");;
		}
		System.out.println();
		data.add(1,2000.0);
		for(int i=0; i<data.size(); i++) {
			System.out.print(data.elementAt(i)+" ");;
		}
		
		System.out.println();
		data.remove(1);
		for(int i=0; i<data.size(); i++) {
			System.out.print(data.elementAt(i)+" ");;
		}
		
		
		System.out.println();
		System.out.println("현재 데이터 갯수 " + data.size());
		System.out.println("Vector:용 량 " + data.capacity());
		
		
		
		
		
		
		
		//		data.add(new Integer(100));
//		System.out.println(data.elementAt(0));
		
	}
}
