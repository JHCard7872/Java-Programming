package ui;

import javax.swing.*;
import java.awt.*;

public class ManagePanel extends BasicPanel {

	// 간격 조절
	private JLabel Line = new JLabel("aaaaaaaaaa"); // 라벨
	private JLabel Line1 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line2 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
	private JLabel Line3 = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // 라벨
		
	private ImageIcon manage = new ImageIcon("images/manage.png"); // 이미지 로딩
	private JLabel manageimg=new JLabel("",manage,SwingConstants.CENTER); // 레이블 생성
	
	
	private String[] CategoryArr = {"식비                            ", "도서     ", "교통비    "};
	private JComboBox<String> Category = new JComboBox<String>(CategoryArr); // 수치 저장할 콤보박스
	private JLabel cate = new JLabel("  카테고리 선택      "); // 라벨
	
	// =======================================================================
	
	private JTextField curexpenlimit= new JTextField(12);
	private JLabel current = new JLabel("  현재 지출 한도     "); // 라벨
	
	private JTextField changexpenlimit= new JTextField(12);
	private JLabel change = new JLabel("  변경할 지출 한도 "); // 라벨
	
	
	public ManagePanel(JFrame frame) { // 생성자
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		CenterPanel.add(Line); // 순서대로 저장
		CenterPanel.add(manageimg);
		CenterPanel.add(cate);
		CenterPanel.add(Category);
		CenterPanel.add(current);
		CenterPanel.add(curexpenlimit);
		CenterPanel.add(change);
		CenterPanel.add(changexpenlimit);
	}
	
	
	
	private void InitObject() { // 초기화 작업 및 초기세팅
		
		Line.setBackground(Color.WHITE);
		Line.setForeground(Color.WHITE);
		Line.setFont(new Font("함초롱바탕", Font.BOLD, 12)); 
		
		
		Category.setBackground(Color.WHITE);
		Category.setForeground(Color.BLACK);
		Category.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		
		curexpenlimit.setBackground(Color.WHITE);
		curexpenlimit.setForeground(Color.BLACK);
		curexpenlimit.setFont(new Font("함초롱바탕", Font.BOLD, 18));
		
		
		changexpenlimit.setBackground(Color.WHITE);
		changexpenlimit.setForeground(Color.BLACK);
		changexpenlimit.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		// ========================================================================
		
		cate.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		current.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		change.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
	}
	
}