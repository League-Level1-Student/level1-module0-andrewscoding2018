import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();

	public static void main(String[] args) {
		CutenessTV t = new CutenessTV();
		t.button();
	}

	public void button() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setVisible(true);
		panel.add(b1);
		b1.addActionListener(this);
		b1.setText("Dux");
		panel.add(b2);
		b2.addActionListener(this);
		b2.setText("Frogz");
		panel.add(b3);
		b3.addActionListener(this);
		b3.setText("Cornz");
		panel.add(b4);
		b4.addActionListener(this);
		b4.setText("End this.");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bp = (JButton) e.getSource();
		if (bp == b1) {
			showDucks();
		} else if (bp == b2) {
			showFrog();
		} else if (bp == b3) {
			showFluffyUnicorns();
		} else if (bp == b4) {
			JOptionPane.showMessageDialog(null, "Good Idea");
			System.exit(1);

		}
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
}
