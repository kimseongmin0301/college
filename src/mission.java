import java.util.Scanner;
public class mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Array[] = new int[10];
		int max=0, min=0,count=0;
		max = min = Array[0];
		for(int i=0;i<Array.length;i++) {
			Array[i] = sc.nextInt();
			
		}
		for(int temp: Array) {
			
			if(temp%2 == 0) {
				count++;}
			max = (temp>max)?temp:max;
			min = (temp<min)?temp:min;
		}
		System.out.println("�ִ밪�� " + max);
		System.out.println("�ּҰ��� " + min);
		System.out.println("2�� ����� ������ " + count);
		System.out.print("�ִ밪�� �ּҰ��� ���̴� " + ((max+min)/2));
		
		
	}

}
