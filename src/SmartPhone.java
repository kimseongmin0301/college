//SmartPhone Ŭ������ Calc�� ��ӹް�, PhoneInterface �������̽��� �߻� �޼ҵ� ��� ����
public class SmartPhone extends Calc implements PhoneInterface {
//	PhoneInterface�� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {System.out.println("������������~~");}

	@Override
	public void receiveCall() {System.out.println("��ȭ �Ծ��.");}

//	�߰��� �ۼ��� �޼ҵ�
	public void schedule() {System.out.println("���� �����մϴ�.");}
}
