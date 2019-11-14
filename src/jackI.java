import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackI {
public static void main(String[] args) {
	 JLabel imageLabel = createLabelImage(fileName);
     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.add(imageLabel);
     frame.setVisible(true);
     frame.pack();
}
}
