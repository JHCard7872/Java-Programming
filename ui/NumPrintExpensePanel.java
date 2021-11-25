package ui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumPrintExpensePanel extends BasicForInquiryPanel{
	public NumPrintExpensePanel(JFrame frame) {
		super(frame);
		JLabel Test = new JLabel("테스트");
		CenterPanel.setLayout(new FlowLayout());
		CenterPanel.add(Test);
	}
}
