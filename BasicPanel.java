import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*
 * ��� ���. BasicFrame ���, ������ �� ���� InitSetting()�Լ� ȣ��
 *  - ��� �κп� ��ư������ �ִ� ���
 *  1. BorderPanel ��ġ������ ����������� null�̳� gridLayout�̳� ex) BorderPanel.setLayout(null);
 *  2. BorderPanel�� add������� ex) BorderPanel.add(new JButton("�޷�"));
 *  ��!
 */
public class BasicPanel extends JPanel{
	private JPanel BorderPanel = new JPanel(); // ��� �κ��� �г�
	private JPanel[] BlackBorder = new JPanel[4]; // �����ڸ� ������ �׵θ�
	protected JPanel CenterPanel = new JPanel();
	protected JPanel NorthPanel = new JPanel();
	protected JPanel SouthPanel = new JPanel();
	protected JPanel WestPanel = new JPanel();
	protected JPanel EastPanel = new JPanel();
	
	protected ButtonClick buttonclick;

	public BasicPanel() {
		InitSetting();
	}
	
	protected void InitSetting() {									

		setBackground(Color.WHITE);			// ���
		setLayout(new BorderLayout());		// ��ġ������ ����
		
		BorderPanel.setBackground(Color.WHITE);			// �г� ���� ����
		for(int i=0; i<4; i++) {
			BlackBorder[i] = new JPanel();
			BlackBorder[i].setBackground(Color.BLACK);
		}
		
		add(BorderPanel, BorderLayout.CENTER); // BorderLayout���� �־��� �� inputPanel�� �־���� �Ұ���
		add(BlackBorder[0], BorderLayout.NORTH);
		add(BlackBorder[1], BorderLayout.SOUTH);
		add(BlackBorder[2], BorderLayout.WEST);
		add(BlackBorder[3], BorderLayout.EAST);
		
		BorderPanel.setLayout(new BorderLayout());
		BorderPanel.add(CenterPanel, BorderLayout.CENTER);
		BorderPanel.add(NorthPanel, BorderLayout.NORTH);
		BorderPanel.add(SouthPanel, BorderLayout.SOUTH);
		BorderPanel.add(WestPanel, BorderLayout.WEST);
		BorderPanel.add(EastPanel, BorderLayout.EAST);
		
	}
}
