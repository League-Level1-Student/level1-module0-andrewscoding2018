import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffect implements ActionListener {
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {
SoundEffect s = new SoundEffect();
s.button();
	}

	public void button() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button0);
		button0.addActionListener(this);
		button0.setText("Yell");
		panel.add(button1);
		button1.addActionListener(this);
		button1.setText("Scream");
		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("Frying");
		panel.add(button3);
		button3.addActionListener(this);
		button3.setText("hair clippers");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button0) {
			playSound(" Yelling.wav");
		} else if (buttonPressed == button1) {
			playSound("Scream.wav");
		} else if (buttonPressed == button2) {
			playSound("steak.wav");
		} else if (buttonPressed == button3) {
			playSound("hair.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}