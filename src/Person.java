// static study
public class Person {
	static String addr = "ulsan";
	String name;
	private int age;
	
	public Person(int a) {
		age = a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(10);
		Person p2 = new Person(0);
		
		System.out.println(addr);
		System.out.println(p1.age);
		System.out.println(p2.age);
		p1.age = 100;
		System.out.println(p1.age);
		System.out.println(p2.age);
		p1.addr = "busan";
		
		System.out.println(p1.addr);
		System.out.println(p2.addr);
		p2.name = "seoul";
		System.out.println(p1.name);
		System.out.println(p2.name);
		
	}

}
