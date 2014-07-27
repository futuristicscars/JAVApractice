import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class gui5 extends JFrame{
	
	private JList leftlist;
	private JList rightlist;
	private JButton moveb;
	private static String[] food = {"pizza", "linguini", "bacon", "noodles", "ham"};
	
	public gui5(){
		super("food selection");
		setLayout(new FlowLayout());
		
		leftlist = new JList(food);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		moveb = new JButton("Move --->");
		moveb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
		);
		add(moveb);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(20);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
}
