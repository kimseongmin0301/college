import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyGUI extends JFrame {
	public MyGUI() {
		//그래픽 유저 인터페이스
		this.setTitle("내가 만드는 첫번째 GUI 예제");//sork aksemsms cjtqjsWo GUI dPwp
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //vmfpdlarhk gkaRp vmfhrmfoa whdfy
		Container cp = this.getContentPane();
		cp.setBackground(Color.ORANGE);
		JButton btn = new JButton("ok");
		btn.addActionListener(new MyActionListner());
		cp.setLayout(new FlowLayout());
		cp.add(btn);
				
		
		this.setSize(400, 300);
		this.setVisible(true); //화면에 띄워라(ghkausdp Emldnjfk)
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}
	class MyActionListner implements ActionListener{  //akdntmfh zmfflrgoTdmfEo
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("ok"))
				b.setText("cancel");
			else
				b.setText("ok");
		}
	}
}
