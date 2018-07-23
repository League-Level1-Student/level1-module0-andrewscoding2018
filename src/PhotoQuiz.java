/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String image = "https://cdn.shopify.com/s/files/1/0349/7357/files/YetiSB6TeamReplica.JPG?v=1509723966";
		// 2. create a variable of type "Component" that will hold your image
Component i = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(i);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String input  = JOptionPane.showInputDialog("What bike is this?");

		// 7. print "CORRECT" if the user gave the right answer
if(input.equals(("Yeti SB6")))
{
	JOptionPane.showMessageDialog(null, "Correct");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Wrong");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(i);
		// 10. find another image and create it (might take more than one line of code)
String image2 = "http://i1.wp.com/www.ddcycles.co.uk/wp-content/uploads/2017/08/2018-Transition-Patrol-Alloy-SBG-Grey-Black-Full-build.jpg";
Component j = createImage(image2);
		// 11. add the second image to the quiz window
quizWindow.add(j);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String t = JOptionPane.showInputDialog("What is this bike?");
		// 14+ check answer, say if correct or incorrect, etc.
if(t.equals("Transition Patrol"))
{
	JOptionPane.showMessageDialog(null, "Correct!!");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





