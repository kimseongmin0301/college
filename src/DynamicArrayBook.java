import java.util.*;
import java.util.Scanner;

public class DynamicArrayBook {
	static ArrayList<String> bList = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	static boolean checkDup(String title) {
		for(int i=0; i < bList.size();i++) {
			if(title.equals(bList.get(i))==true) {
				System.out.println("�ߺ�... "+title);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title;
		do {
			System.out.print("å ������ �Է��ϼ���(�Է��� å�� ������ enter)");
			title = sc.nextLine();
			if(checkDup(title) == false) 
				bList.add(title);
			
		} while(!title.equals(""));
		
		System.out.print("�Էµ� å ���� ��� : ");
		for(int i=0; i < bList.size();i++) {
			System.out.print(bList.get(i) + " ");
		}
		
	}

}
