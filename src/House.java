import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class House {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		String color = "";
		String size = "";
		rob.setX(20);
		rob.setY(500);
		rob.setWindowColor(Color.black);
		for (int i = 0; i < 9; i++) {
			String houseType = JOptionPane.showInputDialog("Would you like a flat house or a pointy house?");
			String s = JOptionPane.showInputDialog("Would you like a small,medium, or large house?");
			String c = JOptionPane.showInputDialog("What color do you want the house?");
			if (s.equals("small")) {
				size = "small";
			} else if (s.equals("medium")) {
				size = "medium";
			} else if (s.equals("large")) {
				size = "large";
			} else {
				JOptionPane.showMessageDialog(null, "Wrong. Default to medium.");
				size = "medium";
			}
			color = c;
			if (houseType.equalsIgnoreCase("pointy") || houseType.equalsIgnoreCase("pointy house")
					|| houseType.equalsIgnoreCase("a pointy house")) {
				point(color, size);
			} else if (houseType.equalsIgnoreCase("flat") || houseType.equalsIgnoreCase("flat house")
					|| houseType.equalsIgnoreCase("a flat house")) {
				flat(color, size);
			} else {
				JOptionPane.showMessageDialog(null, "Error: idiot alert. Default.");
				point(color, size);
			}
		}
	}

	public static void point(String color, String height) {
		int h = 0;
		rob.hide();
		rob.setSpeed(1000000000);
		rob.setPenWidth(6);
		rob.penDown();
		rob.setAngle(0);
		if (color.equalsIgnoreCase("Red")) {
			rob.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("Blue")) {
			rob.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("Green")) {
			rob.setPenColor(Color.green);
		} else if (color.equalsIgnoreCase("White")) {
			rob.setPenColor(Color.white);
		} else if (color.equalsIgnoreCase("Black")) {
			rob.setPenColor(Color.black);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong color.");
			rob.setPenColor(Color.white);
		}
		if (height.equalsIgnoreCase("small")) {
			h = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			h = 120;
		} else if (height.equalsIgnoreCase("large")) {
			h = 250;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		rob.move(h);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
		rob.move(h);
		rob.setPenColor(000, 102, 000);
		rob.turn(-90);
		rob.move(20);
	}

	public static void flat(String color, String height) {
		int h = 0;
		rob.hide();
		rob.setSpeed(1000000000);
		rob.setPenWidth(6);
		rob.penDown();
		rob.setAngle(0);
		if (color.equalsIgnoreCase("Red")) {
			rob.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("Blue")) {
			rob.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("Green")) {
			rob.setPenColor(Color.green);
		} else if (color.equalsIgnoreCase("White")) {
			rob.setPenColor(Color.white);
		} else if (color.equalsIgnoreCase("Black")) {
			rob.setPenColor(Color.black);
		}
		if (height.equalsIgnoreCase("small")) {
			h = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			h = 120;
		} else if (height.equalsIgnoreCase("large")) {
			h = 250;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		rob.move(h);
		rob.turn(90);
		rob.move(70);
		rob.turn(90);
		rob.move(h);
		rob.setPenColor(000, 102, 000);
		rob.turn(-90);
		rob.move(20);

	}
}
