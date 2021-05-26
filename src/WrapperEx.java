import java.util.StringTokenizer;
import java.util.Scanner;
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str;
		int i,j;
		Integer ic = 11;
		j=0; // 011 개수 카운팅용
		
		for(i=0 ; i < 5; i++) {
//			StringTokenizer 예제			
			System.out.print("당신의 폰번호 : ");
			str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str, "-");
			if(st.nextToken().equals("011")) j++;
			
//			System.out.println("token 개수" + st.countTokens());
//			while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//			}
		}
		System.out.println("011 갯수는" + j + "명 입니다.");
		
		/*	//WrapperEx 예제
		  	str = sc.next();
			i=Integer.parseInt(str);
		
			str = sc.next();
			j=Integer.parseInt(str,16);
		
			System.out.println(ic.toBinaryString(i));
			System.out.println(j);
		*/
		
	}

}
