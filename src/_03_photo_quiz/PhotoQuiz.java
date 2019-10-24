package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = ("http://images6.fanpop.com/image/photos/41300000/cute-adorable-munchkin-kittens-cute-kittens-41373498-480-360.jpg");
		// 2. create a variable of type "Component" that will hold your 
		Component comp = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ft = JOptionPane.showInputDialog("what is this image");
		// 7. print "CORRECT" if the user gave the right answer
		if ( ft.equals("cute bebe kitty")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT it was cute bebe kitty");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image1 = ("https://vignette.wikia.nocookie.net/joke-battles/images/e/e7/Images_%2826%29.jpeg/revision/latest?cb=20190511083946");
		Component compn = createImage(image1);
		// 11. add the second image to the quiz window
		quizWindow.add(compn);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String m = JOptionPane.showInputDialog("what is the character on the screen???????");
		// 14+ check answer, say if correct or incorrect, etc.
		if ( m.equals("big Chungus")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT it was big Chungus");
		}
	}
		
	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
