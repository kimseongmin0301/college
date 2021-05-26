import java.util.Scanner;

public class zxvzxcv {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			int number1 = 0;
			int number2 = 0;
			while(true) {
			System.out.print(">>");
			int x = sc.nextInt();

			if(x==0) break;
			else if(x<0) 
				number2 += x; 
			else
				number1 += x;
			}
			System.out.println("지금까지 입력한 값 중에서 +값들의 합계는 " + number1 + "입니다.");
			System.out.println("지금까지 입력한 값 중에서 -값들의 합계는 " + number2 + "입니다.");

	}

}
