package ui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumPrintIncomePanel extends BasicPanel{
	public NumPrintIncomePanel(JFrame frame) {
		JLabel Test = new JLabel("테스트");
		CenterPanel.setLayout(new FlowLayout());
		CenterPanel.add(Test);
	}
}
