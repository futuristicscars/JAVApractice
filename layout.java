import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class layout extends JFrame {
	
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout Layout;
	private Container container;
	
	public layout(){
		super("Flow Layout fun!");
		Layout = new FlowLayout();
		container = getContentPane();
		setLayout(Layout);
		
		//leftie
		lb = new JButton("Left");
		add(lb);
		lb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Layout.setAlignment(FlowLayout.LEFT);
						Layout.layoutContainer(container);
						
					}
				}
		);
		
		//Center
				cb = new JButton("Center");
				add(cb);
				cb.addActionListener(
						new ActionListener(){
							public void actionPerformed(ActionEvent event){
								Layout.setAlignment(FlowLayout.CENTER);
								Layout.layoutContainer(container);
								
							}
						}
				);
		//right
				rb = new JButton("Right");
				add(rb);
				rb.addActionListener(
						new ActionListener(){
							public void actionPerformed(ActionEvent event){
								Layout.setAlignment(FlowLayout.RIGHT);
								Layout.layoutContainer(container);
								
							}
						}
				);
	}
}
