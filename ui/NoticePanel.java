package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Vector;


public class NoticePanel extends BasicPanel {
	
	private JLabel Line = new JLabel("aaaaaaaa"); // 라벨
	private JLabel Line1 = new JLabel("aaaaaaaaa"); // 라벨
	private JLabel Line2 = new JLabel("aaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line3 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line4 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	
	private ImageIcon alarm = new ImageIcon("images/alarm.png"); // 이미지 로딩
	private JLabel manageimg=new JLabel("",alarm,SwingConstants.CENTER); // 레이블 생성
	
	private BackButton GOtoBack = new BackButton();
	private GoToBackPanel backbutton;
	
	private Vector<Vector<String>> LimitCate = new Vector<Vector<String>>(); // 여기에 초과한 카테고리 저장
	
	private JButton[] CateName;
	
	private JFrame frame;
	public NoticePanel(JFrame frame) {
		super();
		this.frame = frame;
		backbutton = new GoToBackPanel(frame); // BasicPanel에 있는 buttonclick
		NorthPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		NorthPanel.add(Line);
		NorthPanel.add(manageimg); // 순서대로 저장
		NorthPanel.add(Line1);
		NorthPanel.add(Line2);
		CenterPanel.setLayout(new GridLayout(7,1,1,30)); // 이게 작성되는 부분의 GridLayout(5행 1열 vGap = 25)
		InitObject();
		SouthPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // 뒤로가기
		SouthPanel.add(GOtoBack);
	}
	
	private void InitObject() {
		Vector<String> hi = new Vector<String>();
		Vector<String> prac = new Vector<String>();
		
		hi.add("안녕");
		hi.add("100000");
		hi.add("3000");
		
		prac.add("안녕");
		prac.add("100000");
		prac.add("3000");
		
		LimitCate.add(hi);
		LimitCate.add(prac);
		
		CateName = new JButton[LimitCate.size()];
		System.out.println(CateName.length);
		
		Line.setBackground(Color.WHITE);
		Line.setForeground(Color.WHITE);
		Line.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line1.setBackground(Color.WHITE);
		Line1.setForeground(Color.WHITE);
		Line1.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line2.setBackground(Color.WHITE);
		Line2.setForeground(Color.WHITE);
		Line2.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line3.setBackground(Color.WHITE);
		Line3.setForeground(Color.WHITE);
		Line3.setFont(new Font("함초롱바탕", Font.BOLD, 16)); 
		
		Line4.setBackground(Color.WHITE);
		Line4.setForeground(Color.WHITE);
		Line4.setFont(new Font("함초롱바탕", Font.BOLD, 16));
		
		// =========================================================================
		
		for(int i=0; i<CateName.length; i++) {
			Vector<String> forName = (Vector<String>) LimitCate.toArray()[i];
			CateName[i] = new JButton((String)forName.toArray()[0]);
			CateName[i].setBackground(Color.BLACK);
			CateName[i].setForeground(Color.WHITE);
			CateName[i].setFont(new Font("맑은 고딕", Font.BOLD, 18));
			CateName[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					String CommaLimit = ""; // 여기에 콤마 포함 저장 문자열 
					String expenseMoney = "";
					Stack<Character> ExpenseToComma = addComma((String)forName.toArray()[2]); // 스택에 저장(addComma함수에 string 금액 넣어줘야함)
					Stack<Character> LimitToComma = addComma((String)forName.toArray()[1]); // 스택에 저장(addComma함수에 string 금액 넣어줘야함)
					while(!LimitToComma.isEmpty()) { // pop
						CommaLimit += LimitToComma.pop();
					}
					while(!ExpenseToComma.isEmpty()) {
						expenseMoney += ExpenseToComma.pop();
					}
					JOptionPane.showMessageDialog(null, "카테고리: "
							+ b.getText()  + "\n" + "지출한도: " + 
							CommaLimit + "원\n" + "초과금액: " + 
							expenseMoney + "원", b.getText(), JOptionPane.DEFAULT_OPTION);
				}
			});
			CenterPanel.add(CateName[i]); // 여기에 버튼들 GridLayout으로 추가
		}
		
		GOtoBack.addActionListener(backbutton); // 뒤로가기 구현
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
	
	private Stack<Character> addComma(String Money) {  					// 돈 콤마 추가해주는 함수
		Money = Money.replaceAll(",","");
		Money=Money.replaceAll("원","");
		Stack<Character> ShowMoney = new Stack<Character>();
		for(int i=0; i<Money.length(); i++) {
			if(i%3==0 && i!= 0) {
				ShowMoney.add(',');
			}
			ShowMoney.push(Money.charAt(Money.length()-1  - i));
		}
		return ShowMoney;
	}
}