//���ϴ� ���� ������ ���ϰ� ���


import java.util.Scanner;

public class RetrunArray {
	static int[] makeArray(int su) {
		int temp[] = new int[su];
		for(int i=0; i<temp.length; i++)
			temp[i] = i;
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		int su,sum=0;
	//	Scanner sc = new Scanner(System.in);
	//	System.out.print("������ ����?");
	//	su = sc.nextInt();
		su = args.length; //runconfigurations
		intArray = makeArray(su);
		for(int i=0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(args[i]);
			//System.out.print((i+1) + "��° ������");
			//intArray[i] = sc.nextInt();
	}
		for(int i: intArray)
			sum += i;
		System.out.print("�հ�: " + sum);
		
	//	sc.close();
		
	}

}
