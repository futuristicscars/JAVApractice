import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui1 extends JFrame{
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicsbox;
	
	public Gui1(){
		super("the title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicsbox = new JCheckBox("italics");
		add(boldbox);
		add(italicsbox);
		
		Handlerclass handler = new Handlerclass();
		boldbox.addItemListener(handler);
		italicsbox.addItemListener(handler);
	}
	
	private class Handlerclass implements ItemListener{
		public void  itemStateChanged(ItemEvent event){
			Font font = null;
			if (boldbox.isSelected() && italicsbox.isSelected()){
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(boldbox.isSelected()){
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if(italicsbox.isSelected()){
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			tf.setFont(font);
		}
	}
}
