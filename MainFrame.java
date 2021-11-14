import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame { // GUIƲ Frame
	enum Button{
		expenseIncomeInputButton, categoryManageButton, inquiryButton,
		manageButton, alarmButton
	}
	private JButton[] MainButton = new JButton[5]; // ��ư
	private Container contentPane = getContentPane(); 
	private JLabel tip = new JLabel("������ ��: "); // ������ �� ���̺�
	private JLabel antProgram = new JLabel("������ �˶���!"); // ���α׷� �̸� ���̺�
	
	public MainFrame() {
		this("������ �˶���");
	}
	public MainFrame(String title) {
		super(title);  
		MainButton[Button.expenseIncomeInputButton.ordinal()] = new JButton("��                     ��"); // 0
		MainButton[Button.categoryManageButton.ordinal()] = new JButton("��                     ȸ"); // 1
		MainButton[Button.inquiryButton.ordinal()] = new JButton("����   �ѵ�   ����"); // 2 
		MainButton[Button.manageButton.ordinal()] = new JButton("ī�װ�      ����"); // 3
		MainButton[Button.alarmButton.ordinal()] = new JButton("��                     ��"); // 4
		
		InitSetting(); // �ʱ� ������
		ButtonSetting(); // ��ư ��ġ ����
	}
	
	/* ��.. BorderLayout�� �̿��� ������ �����ڸ� ������� panel�߰� >> �̰��� blackground
	 * �� blackground�� �� BorderLayout���� ������ �� �κ��� ��� �κп� GridLayout���� ���� >> �̰��� WriteGround
	 * writeGround�� ��� �κп� GridLayout���� �����ϰ�, ��ư ������� ����.
	 * writeGround�� NORTH�κп� ���� Ÿ��Ʋ �߰�, SOUTH�κп� �� �߰�
	 * */
	private void ButtonSetting() {
		JPanel[] blackground = new JPanel[5]; // 10�� ����
		JPanel[] WriteGround = new JPanel[5];
		
		for(int i=0; i<5; i++) WriteGround[i] = new JPanel(); 
		for(int i=0; i<5; i++) blackground[i] = new JPanel(); 
		
		for(int i=1; i<5; i++) blackground[i].setBackground(Color.BLACK); // ���������� ����
		contentPane.add(blackground[0],BorderLayout.CENTER); // �̰� �ֿ� panel
		contentPane.add(blackground[1],BorderLayout.NORTH);
		contentPane.add(blackground[2],BorderLayout.SOUTH);
		contentPane.add(blackground[3],BorderLayout.WEST);
		contentPane.add(blackground[4],BorderLayout.EAST);
		blackground[0].setBackground(Color.WHITE); // �ֿ� panel �Ͼ������(����κ� �����)
		
		for(int i=0; i<5; i++) WriteGround[i].setBackground(Color.WHITE); // ���� ���(����κ�) blackground[0]���� �ٽ� BorderLayout, ������ �߾Ӻκп� ��ư �ۼ� 
		blackground[0].setLayout(new BorderLayout(500,200)); 
		blackground[0].add(WriteGround[0], BorderLayout.CENTER); // ���⿡ �Է�, ��ȸ,,, ��ư�� �־��ٰ���
		blackground[0].add(WriteGround[1], BorderLayout.NORTH);
		blackground[0].add(WriteGround[2], BorderLayout.SOUTH);
		blackground[0].add(WriteGround[3], BorderLayout.WEST);
		blackground[0].add(WriteGround[4], BorderLayout.EAST);
		
		tip.setFont(new Font("���ʷչ���", Font.BOLD, 25)); // �� ����
		WriteGround[2].add(tip);
		antProgram.setFont(new Font("���ʷչ���", Font.BOLD, 30)); // ���α׷� �̸� ����
		WriteGround[1].add(antProgram); 
		WriteGround[0].setLayout(new GridLayout(5,1,1,25)); // �̰� �ۼ��Ǵ� �κ��� GridLayout(5�� 1�� vGap = 25)
		
		for(int i=0; i<5; i++) { // panel[0]�� ��ư�� �߰�
			MainButton[i].setBackground(Color.BLACK);
			MainButton[i].setForeground(Color.WHITE);
			MainButton[i].setFont(new Font("���ʷչ���", Font.BOLD, 15));
			WriteGround[0].add(MainButton[i]); // ���⿡ ��ư�� GridLayout���� �߰�
		}
	}
	
	protected void InitSetting() {									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		setExtendedState(JFrame.MAXIMIZED_BOTH);		// ��üȭ������ ����

		contentPane.setBackground(Color.WHITE);			// ���
		contentPane.setLayout(new BorderLayout());		// ��ġ������ ����
		setVisible(true);
	}
}
