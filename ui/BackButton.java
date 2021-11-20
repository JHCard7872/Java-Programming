package ui;

import javax.swing.JButton;
import java.awt.*;

public class BackButton extends JButton{
	public BackButton() {
		super("뒤로가기");
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
	}
}
