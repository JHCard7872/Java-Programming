import java.awt.*;
import javax.swing.*;

public class Frame{
	private JFrame frame = new JFrame("������ �˶���");
	
	public Frame() {
		frame.setTitle("������ �˶���");
		frame.setSize(400, 700);
		frame.setContentPane(new MainPanel(frame));
		frame.setVisible(true);
	}
}
