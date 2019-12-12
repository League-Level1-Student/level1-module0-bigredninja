package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class cutenees implements ActionListener{
	 JFrame frame = new JFrame(); 
     JPanel panel = new JPanel();
     JButton b1 = new JButton();
     JButton b2 = new JButton();
     JButton b3 = new JButton();

	public void showButton() {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.add(panel);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        frame.pack();
        frame.setVisible(true);
        
        
        
        
   }
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(b1)) {
			showDucks();
		}
		if (buttonPressed.equals(b2)) {
			showFrog();
		}
		if (buttonPressed.equals(b3)) {
			showFluffyUnicorns();
		}
		
		
		
		
		
	}
}
