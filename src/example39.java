import java.util.Scanner;

public class example39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[10];
		String[] Data = new String[10];
		
		int sum=0;
		for(int i=0; i<number.length; i++) {
			number[i] = sc.nextInt();
			
			sum += number[i];
			if(i != (number.length-1))
				System.out.print("+");
			else
				System.out.println("="+sum);
		}
		/*int su = 0;
		for(int temp: number) {
			System.out.print(temp);
			su++;
			sum += temp;
			if(su == 10) System.out.println("=" + sum);
			else System.out.print("+");
		}*/
	}

}
