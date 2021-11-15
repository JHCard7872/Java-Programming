import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BasicFrame extends JFrame{
	private Container contentPane = getContentPane(); // ����Ʈ��
	
	private JPanel BorderPanel = new JPanel(); // ��� �κ��� �г�
	private JPanel[] BlackBorder = new JPanel[4]; // �����ڸ� ������ �׵θ�
	
	protected JPanel CenterPanel = new JPanel(); // ��� �гο� �־��ִ� �κе�
	protected JPanel NorthPanel = new JPanel();
	protected JPanel SouthPanel = new JPanel();
	protected JPanel WestPanel = new JPanel();
	protected JPanel EastPanel = new JPanel();
	
	
	public BasicFrame() {
		setTitle("������ �˶���");
	}
	
	protected void InitSetting() {									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		setExtendedState(JFrame.MAXIMIZED_BOTH);		// ��üȭ������ ����

		contentPane.setBackground(Color.WHITE);			// ���
		contentPane.setLayout(new BorderLayout());		// ��ġ������ ����
		
		BorderPanel.setBackground(Color.WHITE);			// �г� ���� ����
		for(int i=0; i<4; i++) {
			BlackBorder[i] = new JPanel();
			BlackBorder[i].setBackground(Color.BLACK);
		}
		
		contentPane.add(BorderPanel, BorderLayout.CENTER); // BorderLayout���� �־��� �� inputPanel�� �־���� �Ұ���
		contentPane.add(BlackBorder[0], BorderLayout.NORTH);
		contentPane.add(BlackBorder[1], BorderLayout.SOUTH);
		contentPane.add(BlackBorder[2], BorderLayout.WEST);
		contentPane.add(BlackBorder[3], BorderLayout.EAST);
		
		CenterPanel.setBackground(Color.WHITE); SouthPanel.setBackground(Color.WHITE); // �� ����
		NorthPanel.setBackground(Color.WHITE); WestPanel.setBackground(Color.WHITE);
		EastPanel.setBackground(Color.WHITE);
		
		BorderPanel.setLayout(new BorderLayout(500,200)); // BorderPanel�� ��ġ ������ BorderLayout���� ����
		BorderPanel.add(CenterPanel, BorderLayout.CENTER); // �� ��ġ�� �°� �г� ��ġ ����
		BorderPanel.add(NorthPanel, BorderLayout.NORTH);
		BorderPanel.add(SouthPanel, BorderLayout.SOUTH);
		BorderPanel.add(WestPanel, BorderLayout.WEST);
		BorderPanel.add(EastPanel, BorderLayout.EAST);
		
		setVisible(true);
	}
}
