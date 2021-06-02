import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyGUI extends JFrame {
	public MyGUI() {
		this.setTitle("내가 만드는 첫번째 GUI 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		cp.setBackground(Color.ORANGE);
		JButton btn = new JButton("ok");
		btn.addActionListener(new MyActionListner());
		cp.setLayout(new FlowLayout());
		cp.add(btn);
				
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}
	class MyActionListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("ok"))
				b.setText("cancel");
			else
				b.setText("ok");
		}
	}
}
