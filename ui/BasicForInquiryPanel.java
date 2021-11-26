package ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BasicForInquiryPanel extends BasicPanel{
	
	private JLabel Line4 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	
	private GoToBackPanel backbutton; // 뒤로가기(엑티브리스너)
	
	private BackButton GOtoBack = new BackButton(); // 뒤로가기(버튼)
	private JButton GotoMain = new JButton("메인으로");
	
	private JFrame frame;
	
	public BasicForInquiryPanel(JFrame frame) {
		this.frame = frame;
		backbutton = new GoToBackPanel(frame); // BasicPanel에 있는 buttonclick
		SouthPanel.setLayout(new FlowLayout());
		SouthPanel.add(GOtoBack);
		SouthPanel.add(Line4);
		SouthPanel.add(GotoMain);
		InitSettingForIinquiry();
	}
	private void InitSettingForIinquiry() {
		Line4.setBackground(Color.WHITE);
		Line4.setForeground(Color.WHITE);
		Line4.setFont(new Font("함초롱바탕", Font.BOLD, 10)); 
		
		GotoMain.setBackground(Color.BLACK);
		GotoMain.setForeground(Color.WHITE);
		GotoMain.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		GotoMain.addActionListener(new GoToMainListener(frame));
		
		GOtoBack.addActionListener(new GoToBackPanel(frame));
		
	}
	
	
	private class GoToBackPanel implements ActionListener{ // 뒤로가기 actionListener >> 뒤로가기 버튼에 적용
		private JFrame frame;
		public GoToBackPanel(JFrame frame) {
			this.frame = frame;
		}
		public void actionPerformed(ActionEvent e) {
			frame.setContentPane(new InquiryPanel(frame));
			frame.setVisible(true);
		}
	}
	
	private class GoToMainListener implements ActionListener{ // 확인 눌렀을때 수치/차트형에 따라 GUI표시
		private JFrame frame;
		public GoToMainListener(JFrame frame) {
			this.frame = frame;
		}
		public void actionPerformed(ActionEvent e) {  // 여기에 각각에 맞는 패널 넣어주면된다~
			frame.setContentPane(new MainPanel(frame));
			frame.setVisible(true);
		}
	}
}
