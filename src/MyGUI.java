import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyGUI extends JFrame {
	public MyGUI() {
		//�׷��� ���� �������̽�
		this.setTitle("���� ����� ù��° GUI ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //�����Ӱ� �Բ� ����
		Container cp = this.getContentPane();
		cp.setBackground(Color.ORANGE);
		JButton btn = new JButton("ok");
		btn.addActionListener(new MyActionListner());
		cp.setLayout(new FlowLayout());
		cp.add(btn);
				
		
		this.setSize(400, 300);
		this.setVisible(true); //ȭ�鿡 �����
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}
	class MyActionListner implements ActionListener{  //���콺�� Ŭ��������
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("ok"))
				b.setText("cancel");
			else
				b.setText("ok");
		}
	}
}
