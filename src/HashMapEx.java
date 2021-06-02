import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key, value;
		HashMap<String,String> dic = new HashMap<>();
		
		do {
			System.out.print("key��: ");
			key = sc.nextLine();
			if(key.equals("")) break;
			System.out.print("value��: ");
			value = sc.nextLine();
			dic.put(key, value);
		} while(true);
		System.out.println("�Է� �Ϸ�");
		System.out.println("HashMap�� ����� ����: "+dic.size());
		
		Set<String> keyList = dic.keySet();
		Iterator keyListIt = keyList.iterator();
		while(keyListIt.hasNext()) {
			key = (String)keyListIt.next();
			System.out.println("<" + key + "," + dic.get(key) + ">");
		}
		
		System.out.print("ã����� ���� �̸� :");
		key = sc.nextLine();
		if(dic.get(key)=="")
			System.out.println("ã�� �����̸��� ����");
		else
			System.out.println("ã�� ��� : " + dic.get(key));
	}

}
