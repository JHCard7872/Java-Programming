import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends BasicFrame { // GUIƲ Frame
	enum Button{
		expenseIncomeInputButton, categoryManageButton, inquiryButton,
		manageButton, alarmButton
	}
	private JButton[] MainButton = new JButton[5]; // ��ư
	private JLabel tip = new JLabel("������ ��: "); // ������ �� ���̺�
	private JLabel antProgram = new JLabel("������ �˶���!"); // ���α׷� �̸� ���̺�
	
	private NextPage nextpage = new NextPage();
	
	public MainFrame() {
		MainButton[Button.expenseIncomeInputButton.ordinal()] = new JButton("��                     ��"); // 0
		MainButton[Button.categoryManageButton.ordinal()] = new JButton("��                     ȸ"); // 1
		MainButton[Button.inquiryButton.ordinal()] = new JButton("����   �ѵ�   ����"); // 2 
		MainButton[Button.manageButton.ordinal()] = new JButton("ī�װ�      ����"); // 3
		MainButton[Button.alarmButton.ordinal()] = new JButton("��                     ��"); // 4
		
		GUISetting(); // ��ư ��ġ ����
		InitSetting(); // BasicFrame�� InitSetting�̿�
	}
	
	/* BasicFrame�� �⺻���� Ʋ �̿��Ұ���
	 * �⺻���� �׵θ�, �־���� �� �г��� BasicPanel���� �غ�Ǿ� ����.
	 * ��ư���� CenterPanel�� �־���� �ϹǷ� CenterPanel�� ��ġ������ GridLayout���� �����ϰ� ���⿡ ��ư�� �־���
	 * 
	 * */
	private void GUISetting() {
		tip.setFont(new Font("���ʷչ���", Font.BOLD, 25)); // �� ����
		SouthPanel.add(tip);
		antProgram.setFont(new Font("���ʷչ���", Font.BOLD, 30)); // ���α׷� �̸� ����
		NorthPanel.add(antProgram); 
		CenterPanel.setLayout(new GridLayout(5,1,1,25)); // �̰� �ۼ��Ǵ� �κ��� GridLayout(5�� 1�� vGap = 25)
		
		for(int i=0; i<5; i++) { // CenterPanel�� ������ ��ư�� �߰�
			MainButton[i].setBackground(Color.BLACK);
			MainButton[i].setForeground(Color.WHITE);
			MainButton[i].setFont(new Font("���ʷչ���", Font.BOLD, 15));
			MainButton[i].addActionListener(nextpage);
			CenterPanel.add(MainButton[i]); // ���⿡ ��ư�� GridLayout���� �߰�
		}
	}
	
	class NextPage implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			String compareText = b.getText().replace(" ", "");
			if(compareText.equals("�Է�")) {
				new InputFrame();
				setVisible(false);
			}
		}
	}
}
