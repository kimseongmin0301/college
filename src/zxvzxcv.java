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
			System.out.println("���ݱ��� �Է��� �� �߿��� +������ �հ�� " + number1 + "�Դϴ�.");
			System.out.println("���ݱ��� �Է��� �� �߿��� -������ �հ�� " + number2 + "�Դϴ�.");

	}

}
