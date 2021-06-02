import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < 4; i++) {
			a.add(sc.nextLine());
		}
		
		for(int i=0; i<4; i++) {	//for ������ �̿��ϴ� ����
			System.out.println(a.get(i));
		}
		
		System.out.println("���ݺ��� ����� iterator�� �̿��Ѱ�");
		Iterator<String> ai = a.iterator();
		while(ai.hasNext()) {
			System.out.println(ai.next());				
		}
		System.out.println("���ݺ��� ����� foreach�� �̿��Ѱ�");
		for(String name : a) {
			System.out.println(name);
		}
		
		
		int lindex = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(lindex).length() < a.get(i).length()) {
				lindex = i;
			}
		}
		
		System.out.println("���� �� �̸� "+ a.get(lindex));
		
		
		
	}

}
