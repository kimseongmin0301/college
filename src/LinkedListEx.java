import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> Ilist = new LinkedList<String>();
		
		Ilist.add("��� �� ");
		Ilist.add("����");
		
		for(int i=0; i<Ilist.size(); i++) {
			System.out.print(Ilist.get(i));
		}
		System.out.println();
		Ilist.add(1,"���� ");
		for(int i=0; i<Ilist.size(); i++) {
			System.out.print(Ilist.get(i));
		}
		System.out.println();
		Ilist.add(2,"���� ���� ");
		for(int i=0; i<Ilist.size(); i++) {
			System.out.print(Ilist.get(i));
		}
		System.out.println();
			
		System.out.println(Ilist.getFirst());
		System.out.println(Ilist.getLast());
		
		Collections.sort(Ilist);
		for(int i=0; i<Ilist.size();i++) {
			System.out.print(Ilist.get(i)+" ");
		}System.out.println();
		Collections.reverse(Ilist);
		for(int i=0; i<Ilist.size();i++) {
			System.out.print(Ilist.get(i)+" ");
		}System.out.println();

	}

}
