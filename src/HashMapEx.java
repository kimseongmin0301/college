import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key, value;
		HashMap<String,String> dic = new HashMap<>();
		
		do {
			System.out.print("key값: ");
			key = sc.nextLine();
			if(key.equals("")) break;
			System.out.print("value값: ");
			value = sc.nextLine();
			dic.put(key, value);
		} while(true);
		System.out.println("입력 완료");
		System.out.println("HashMap에 저장된 갯수: "+dic.size());
		
		Set<String> keyList = dic.keySet();
		Iterator keyListIt = keyList.iterator();
		while(keyListIt.hasNext()) {
			key = (String)keyListIt.next();
			System.out.println("<" + key + "," + dic.get(key) + ">");
		}
		
		System.out.print("찾고싶은 도시 이름 :");
		key = sc.nextLine();
		if(dic.get(key)=="")
			System.out.println("찾는 도시이름이 없다");
		else
			System.out.println("찾은 결과 : " + dic.get(key));
	}

}
