import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public 	Gui(){
		super("The title");
		setLayout(new FlowLayout());
		
		reg = new JButton("Regular Button");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon x = new ImageIcon(getClass().getResource("x.png"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(x);
		add(custom);
		
		Handlerclass handler = new Handlerclass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class Handlerclass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
}
