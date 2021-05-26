class Animal1 {
	static String name;
	public void speak() {
		System.out.println("나는 동물이다...");
	}
}

class Animal2 {
	String name;
	public void speak() {
		System.out.println("나는 동물이다...");
	}
}

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 uc,uc2;
		uc = new Animal2();
		uc2 = new Animal2();
		uc.name="Tiger";
		System.out.println(uc.name);
		System.out.println(uc2.name);
		//System.out.println(Animal2.name);
		Animal2 sw = new Animal2();
		sw.name = "bear";
		uc.name = "cat";
		
		Animal1 iot;
		Animal1.name = "dog";
		System.out.println(Animal1.name);
		iot = new Animal1();
		iot.name="lion";
		System.out.println(iot.name);
	}

}
