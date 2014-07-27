
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class narvancy extends JFrame {

	private JSlider slider;
	private bananas myPanel;
	
	public narvancy(){
		super("The title");
		myPanel = new bananas();
		myPanel.setBackground(Color.ORANGE);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setD(slider.getValue());
					}
				}
				);
		
				add(slider, BorderLayout.SOUTH);
				add(myPanel, BorderLayout.CENTER);
	}
}

		


