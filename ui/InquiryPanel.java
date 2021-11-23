package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class InquiryPanel extends BasicPanel {
	
	private ImageIcon inquiry = new ImageIcon("images/inquiry.png"); // 이미지 로딩
	private JLabel inquiryimg=new JLabel("",inquiry,SwingConstants.CENTER); // 레이블 생성
	
	// 간격 조절
	private JLabel Line = new JLabel("aaaaaaaaaa"); // 라벨
	private JLabel Line1 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line2 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line3 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line4 = new JLabel("aaaaaaaaaa"); // 라벨
	private JLabel Line5 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line6 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	
	// ========================================================================================
	
	private JLabel Choose1 = new JLabel(" 조회할 목록 선택                                         "); // 라벨
	private JLabel chNum = new JLabel("  수치           "); // 라벨
	private JLabel chChart = new JLabel("\n  차트           ");
	
	private JLabel Choose2 = new JLabel(" 예상 수입/지출 금액 조회 방식 선택       "); // 라벨
	private ButtonGroup num_chart = new ButtonGroup(); // 라디오 버튼 그룹
	private JRadioButton num1 = new JRadioButton("다음달          ", true); // 라디오 버튼
	private JRadioButton num2 = new JRadioButton("이번달  ");
	private JRadioButton chart1 = new JRadioButton("월 별            "); // 라디오 버튼
	private JRadioButton chart2 = new JRadioButton("카테고리별");
	
	
	
	// ========================================================================================
	
	private ButtonGroup incom_expen = new ButtonGroup(); // 라디오 버튼 그룹
	private JRadioButton income = new JRadioButton("  수입                        ", true); // 라디오 버튼
	private JRadioButton expenses = new JRadioButton("  지출 ");
	
	
	// ========================================================================================
	
	private GoToBackPanel backbutton; // 뒤로가기(엑티브리스너)
	private Confirm Confirmaction;
	
	private BackButton GOtoBack = new BackButton(); // 뒤로가기(버튼)
	private JButton ConfirmButton = new JButton("확인하기");						// 확인하기, 뒤로가기
	
	private boolean isIncome = true;											// 확인하기 눌렀을때 작동시키는거(조건문)
	private byte Check_Chart_Num = 1;	

	// ============================================================================================
	public InquiryPanel(JFrame frame) { // 생성자
		
		buttonclick = new ButtonClick(frame);
		backbutton = new GoToBackPanel(frame); // BasicPanel에 있는 buttonclick
		Confirmaction = new Confirm(frame);
		
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		CenterPanel.add(Line);
		CenterPanel.add(inquiryimg); // 순서대로 저장
		CenterPanel.add(Line5);
		
		CenterPanel.add(Choose1);
		CenterPanel.add(income);
		CenterPanel.add(expenses);
		CenterPanel.add(Line2);
		
		CenterPanel.add(Choose2);
		CenterPanel.add(chNum);
		CenterPanel.add(num1);
		CenterPanel.add(num2);
		//CenterPanel.add(Line4);

		CenterPanel.add(chChart);
		CenterPanel.add(chart1);
		CenterPanel.add(chart2);
		
		SouthPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // 뒤로가기, 확인하기
		SouthPanel.add(GOtoBack);
		SouthPanel.add(Line6);
		SouthPanel.add(ConfirmButton);
		
	}
	
	
	
	
	private void InitObject() { // 초기화 작업 및 초기세팅
		
		Line.setBackground(Color.WHITE);
		Line.setForeground(Color.WHITE);
		Line.setFont(new Font("함초롱바탕", Font.BOLD, 12)); 
		
		Line1.setBackground(Color.WHITE);
		Line1.setForeground(Color.WHITE);
		Line1.setFont(new Font("함초롱바탕", Font.BOLD, 10)); 
		
		Line2.setBackground(Color.WHITE);
		Line2.setForeground(Color.WHITE);
		Line2.setFont(new Font("함초롱바탕", Font.BOLD, 10)); 
		
		Line3.setBackground(Color.WHITE);
		Line3.setForeground(Color.WHITE);
		Line3.setFont(new Font("함초롱바탕", Font.BOLD, 10)); 
		
		Line4.setBackground(Color.WHITE);
		Line4.setForeground(Color.WHITE);
		Line4.setFont(new Font("함초롱바탕", Font.BOLD, 10)); 
		
		Line5.setBackground(Color.WHITE);
		Line5.setForeground(Color.WHITE);
		Line5.setFont(new Font("함초롱바탕", Font.BOLD, 10));
		
		Line6.setBackground(Color.WHITE);
		Line6.setForeground(Color.WHITE);
		Line6.setFont(new Font("함초롱바탕", Font.BOLD, 10));
		
		// ========================================================================
		
		Choose1.setBackground(Color.BLACK);
		Choose1.setForeground(Color.BLACK);
		Choose1.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		Choose2.setBackground(Color.BLACK);
		Choose2.setForeground(Color.BLACK);
		Choose2.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		
		num1.setBackground(Color.WHITE);
		num1.setForeground(Color.BLACK);
		num1.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		num2.setBackground(Color.WHITE);
		num2.setForeground(Color.BLACK);
		num2.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
	
		chart1.setBackground(Color.WHITE);
		chart1.setForeground(Color.BLACK);
		chart1.setFont(new Font("함초롱바탕", Font.BOLD, 17));
		
		chart2.setBackground(Color.WHITE);
		chart2.setForeground(Color.BLACK);
		chart2.setFont(new Font("함초롱바탕", Font.BOLD, 17));
		
		num_chart.add(num1); num_chart.add(num2);
		num_chart.add(chart1); num_chart.add(chart2);
		
		num1.addItemListener(new ForRadioButton());
		num2.addItemListener(new ForRadioButton());
		chart1.addItemListener(new ForRadioButton());
		chart2.addItemListener(new ForRadioButton());
		
		// ========================================================================
		
		
		income.setBackground(Color.WHITE);
		income.setForeground(Color.BLACK);
		income.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		expenses.setBackground(Color.WHITE);
		expenses.setForeground(Color.BLACK);
		expenses.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		incom_expen.add(income); incom_expen.add(expenses);
		income.addItemListener(new ForRadioButton());
		expenses.addItemListener(new ForRadioButton());
		
		// ========================================================================
		
		chNum.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		chChart.setFont(new Font("함초롱바탕", Font.BOLD, 17)); 
		
		GOtoBack.addActionListener(backbutton); // 뒤로가기 구현
		ConfirmButton.setBackground(Color.BLACK);
		ConfirmButton.setForeground(Color.WHITE);
		ConfirmButton.setFont(new Font("함초롱바탕", Font.BOLD, 17));
		ConfirmButton.addActionListener(Confirmaction);
	}

	private class GoToBackPanel implements ActionListener{ // 뒤로가기 actionListener >> 뒤로가기 버튼에 적용
		private JFrame frame;
		public GoToBackPanel(JFrame frame) {
			this.frame = frame;
		}
		public void actionPerformed(ActionEvent e) {
			frame.setContentPane(new MainPanel(frame));
			frame.setVisible(true);
		}
	}
	
	private class Confirm implements ActionListener{ // 확인 눌렀을때 수치/차트형에 따라 GUI표시
		private JFrame frame;
		public Confirm(JFrame frame) {
			this.frame = frame;
		}
		public void actionPerformed(ActionEvent e) {  // 여기에 각각에 맞는 패널 넣어주면된다~
			if(Check_Chart_Num == 1 && isIncome == true) {
				frame.setContentPane(new MainPanel(frame)); // 이거 변경
				frame.setVisible(true);
			}
			else if(Check_Chart_Num == 1 && isIncome == false) {
				frame.setContentPane(new NumPrintIncomePanel(frame)); // 이거 변경
				frame.setVisible(true);
			}
			else if(Check_Chart_Num == 2 && isIncome == true) {
				
			}
			else if(Check_Chart_Num == 2 && isIncome == false) {
				
			}
			else if(Check_Chart_Num == 3 && isIncome == true) {
				
			}
			else if(Check_Chart_Num == 3 && isIncome == false) {
				
			}
			else if(Check_Chart_Num == 4 && isIncome == true) {
				
			}
			else if(Check_Chart_Num == 4 && isIncome == false) {
				
			}
		}
	}
	private class ForRadioButton implements ItemListener{ // 라디오 버튼 ItemListener
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == num1) Check_Chart_Num = 1;
				else if(e.getItem() == num2) Check_Chart_Num = 2;
				else if(e.getItem() == chart1) Check_Chart_Num = 3;
				else if(e.getItem() == chart2) Check_Chart_Num = 4;
				else if(e.getItem() == income) isIncome = true; 
				else if(e.getItem() == expenses) isIncome = false;
			}
		}
	}
}
