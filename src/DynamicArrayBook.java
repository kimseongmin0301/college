import java.util.*;
import java.util.Scanner;

public class DynamicArrayBook {
	static ArrayList<String> bList = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);
	static boolean checkDup(String title) {
		for(int i=0; i < bList.size();i++) {
			if(title.equals(bList.get(i))==true) {
				System.out.println("중복... "+title);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title;
		do {
			System.out.print("책 제목을 입력하세요(입력할 책이 없으면 enter)");
			title = sc.nextLine();
			if(checkDup(title) == false) 
				bList.add(title);
			
		} while(!title.equals(""));
		
		System.out.print("입력된 책 제목 목록 : ");
		for(int i=0; i < bList.size();i++) {
			System.out.print(bList.get(i) + " ");
		}
		
	}

}
