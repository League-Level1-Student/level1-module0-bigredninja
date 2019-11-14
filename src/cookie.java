import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cookie implements ActionListener {
	public void showButton() {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this); 
        frame.setVisible(true);
        
        
        
        
        

   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int rand = new Random().nextInt(5);
		if (rand==4) {
			JOptionPane.showMessageDialog(null, "Your kindness will repay you");	
		}else if (rand==3)
		{JOptionPane.showMessageDialog(null, "You will stay safe");
			
		} else if (rand==2)
		{JOptionPane.showMessageDialog(null, "You will get 3 hundred dollars");
			
		}
		else if (rand==1) {
			JOptionPane.showMessageDialog(null, "You will do your best");
		}
		else if (rand==0) {
			JOptionPane.showMessageDialog(null, "You will be a nice person");
		}
		
	}	
}