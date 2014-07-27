import javax.swing.*;
import java.awt.event.*;

public class TestButton extends JFrame{

	JButton jb1;
	public TestButton()
	{
		setSize(200,150);
		setTitle("Toggle Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb1 = new JButton("on");
		jb1.addActionListener(new B1()); //B1 is inner class
		
		getContentPane().add(jb1);
	}
	public static void main(String[] args) 
	{
		TestButton tb = new TestButton();
		tb.setVisible(true);

	}
	class B1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (jb1.getText() == "OFF")
				jb1.setText("ON");
			else
				jb1.setText("OFF");
		}
	}
}
