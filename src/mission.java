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
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
		System.out.println("2의 배수의 갯수는 " + count);
		System.out.print("최대값과 최소값의 차이는 " + ((max+min)/2));
		
		
	}

}
