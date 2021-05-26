import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		

		try {
			System.out.print("나뉨수를 입력하시오: ");
			dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오: ");
			divisor = sc.nextInt();
			
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+(dividend/divisor)+"입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다!");		
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만 써라");
		}
		
		finally {
			sc.close();
		}
	}

}
