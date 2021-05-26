import java.util.Scanner;
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int i=11;
//		Integer ic = 11;
//		i = sc.nextInt();
		String str;
		int i,j;
		Integer ic = 11;
		str = sc.next();
		i=Integer.parseInt(str);
		
		str = sc.next();
		j=Integer.parseInt(str,16);
		
		System.out.println(ic.toBinaryString(i));
		System.out.println(j);
	}

}
