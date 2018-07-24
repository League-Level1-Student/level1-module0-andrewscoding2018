import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ForTuneCooKie implements ActionListener {

	public static void main(String[] args) {
		ForTuneCooKie fc = new ForTuneCooKie();
		fc.showButton();
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will die an unpainful death.");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will die a painful death.");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will not die.");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will use a computer today.");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You have not used a computer before.");
		}
	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo!");

	}
}
