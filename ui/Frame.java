package ui;

import java.awt.*;
import javax.swing.*;

public class Frame{
	public JFrame frame = new JFrame("개미의 알뜰살뜰");
	
	public Frame() {
		frame.setTitle("개미의 알뜰살뜰");
		frame.setSize(430, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}