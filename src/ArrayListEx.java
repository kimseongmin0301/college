import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < 4; i++) {
			a.add(sc.nextLine());
		}
		
		for(int i=0; i<4; i++) {	//for 문장을 이용하는 예제
			System.out.println(a.get(i));
		}
		
		System.out.println("지금부터 출력은 iterator을 이용한것");
		Iterator<String> ai = a.iterator();
		while(ai.hasNext()) {
			System.out.println(ai.next());				
		}
		System.out.println("지금부터 출력은 foreach를 이용한것");
		for(String name : a) {
			System.out.println(name);
		}
		
		
		int lindex = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(lindex).length() < a.get(i).length()) {
				lindex = i;
			}
		}
		
		System.out.println("가장 긴 이름 "+ a.get(lindex));
		
		
		
	}

}
