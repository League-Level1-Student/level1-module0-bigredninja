package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenees implements ActionListener{
	public void showButton() {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this); 
        frame.setVisible(true);
        JPanel panel = new JPanel();
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
     
        
        
        
        
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
