import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gui6 extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	public gui6(){
		super("Mouse Events");
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	private class Handlerclass implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("clicked at %d,%d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event){
			statusbar.setText(String.format("You pressed the mouse down"));
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText(String.format("You released the button"));
		}
		public void mouseEntered(MouseEvent event){
			statusbar.setText(String.format("You entered the area"));
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText(String.format("You exited the area"));
			mousepanel.setBackground(Color.WHITE);
		}
		//Mouse motion evnt handling
		public void mouseDragged(MouseEvent event){
			statusbar.setText(String.format("You are dragging the mouse"));
		}
		public void mouseMoved(MouseEvent event){
			statusbar.setText(String.format("You are moving the mouse"));
		}
	}
}
