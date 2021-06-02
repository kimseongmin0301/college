import java.util.Vector;
import java.util.Scanner;

public class VectorEx {
	static void printVector(Vector<Integer> data) {
		System.out.print("�̹��� �ζ� ��õ ��ȣ : ");
		for(int i=0; i<6; i++) {
			System.out.print(data.elementAt(i)+", ");
		}
		System.out.print("�̹��� ���ʽ� ��ȣ : " + data.elementAt(6));		
	}
	static void lotto() {
		Vector<Integer> data = new Vector<Integer>(7);
		int temp, i;
		while(data.size() != 7) {
		//for(int j=0; j<7; j++){
			temp = (int)(Math.random()*45 + 1);
			i=data.indexOf(temp);
			if(i == -1)
				data.add(temp);		
		}
		printVector(data);
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
			
//		double temp;
//		Vector<Double> data = new Vector<Double>();
		
		lotto();
		/*		
		System.out.println("Vector:�� �� " + data.capacity());
		
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
		
		
		System.out.print("ã�� ���� ������ : ");
		temp = sc.nextDouble();
		if(data.indexOf(temp) == -1)
			System.out.println("ã�� �����Ͱ� ����");
		else
			System.out.println("ã�� �����Ͱ� �ִ�");
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("���� ������ ���� " + data.size());
		System.out.println("Vector:�� �� " + data.capacity());
		
		
		

		
		
		
	*/	
		//		data.add(new Integer(100));
//		System.out.println(data.elementAt(0));
		
	}
}
