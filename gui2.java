import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui2 extends JFrame {

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf; //Italics font
	private Font bif; //italics and bold font
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public gui2(){
		super("Creative title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Naveen is awesome",25);
		add(tf);
		
		pb = new JRadioButton("Plain", true);
		bb = new JRadioButton("Bold", false);
		ib = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold and italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		
		//Wait for event to drive listener
		pb.addItemListener(new Handlerclass(pf));
		bb.addItemListener(new Handlerclass(bf));
		ib.addItemListener(new Handlerclass(itf));
		bib.addItemListener(new Handlerclass(bif));
		
	}
	
	private class Handlerclass implements ItemListener{
		private Font font;
		
		public Handlerclass(Font f){
			font = f;
		}
		
		public void itemStateChanged(ItemEvent event){
			tf.setFont(font);
		}
	}
	
}
