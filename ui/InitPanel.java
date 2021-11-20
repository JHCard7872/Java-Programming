package ui;

import java.awt.*;
import javax.swing.*;



public class InitPanel extends BasicPanel {
	
	
	private ImageIcon init = new ImageIcon("images/init.png"); // 이미지 로딩
	private JLabel initimg=new JLabel("",init,SwingConstants.CENTER); // 레이블 생성
			
	private JTextField expenlimit= new JTextField(13);
	private JTextField curassetwon= new JTextField(13);
	private JTextField curassetdol= new JTextField(13);
	
	private JLabel exli = new JLabel("  지출 한도         "); // 라벨
	private JLabel curassw = new JLabel("\n  현재 자산 (원)  ");
	private JLabel curassd = new JLabel("\n  현재 자산 ($)    ");
	
	
	public InitPanel(JFrame frame) { // 생성자
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		CenterPanel.add(initimg); // 순서대로 저장
		CenterPanel.add(exli);
		CenterPanel.add(expenlimit);
		CenterPanel.add(curassw);
		CenterPanel.add(curassetwon);
		CenterPanel.add(curassd);
		CenterPanel.add(curassetdol);
	}
	
	
	
	private void InitObject() { // 초기화 작업 및 초기세팅
		
		expenlimit.setBackground(Color.WHITE);
		expenlimit.setForeground(Color.BLACK);
		expenlimit.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		
		curassetwon.setBackground(Color.WHITE);
		curassetwon.setForeground(Color.BLACK);
		curassetwon.setFont(new Font("함초롱바탕", Font.BOLD, 18));
		
		
		curassetdol.setBackground(Color.WHITE);
		curassetdol.setForeground(Color.BLACK);
		curassetdol.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		// ========================================================================
		
		exli.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		curassw.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		curassd.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
	}
	
}