import javax.swing.*;
import java.awt.*;

public class ManagePanel extends BasicPanel {


	// �� ���� �Է� �̹��� �־�� �ϴµ� ��� �ϳ�..?
	private ImageIcon manage = new ImageIcon("images/manage.png"); // �̹��� �ε�
	private JLabel manageimg=new JLabel("",manage,SwingConstants.CENTER); // ���̺� ����
	
	
	private String[] CategoryArr = {"�ĺ�                            ", "����     ", "�����    "};
	private JComboBox<String> Category = new JComboBox<String>(CategoryArr); // ��ġ ������ �޺��ڽ�
	private JLabel cate = new JLabel("  ī�װ� ����      "); // ��
	
	// =======================================================================
	
	private JTextField curexpenlimit= new JTextField(12);
	private JLabel current = new JLabel("  ���� ���� �ѵ�     "); // ��
	
	private JTextField changexpenlimit= new JTextField(12);
	private JLabel change = new JLabel("  ������ ���� �ѵ� "); // ��
	
	
	public ManagePanel(JFrame frame) { // ������
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
		CenterPanel.add(cate); // ������� ����
		CenterPanel.add(Category);
		CenterPanel.add(current);
		CenterPanel.add(curexpenlimit);
		CenterPanel.add(change);
		CenterPanel.add(changexpenlimit);
	}
	
	
	
	private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
		
		Category.setBackground(Color.WHITE);
		Category.setForeground(Color.BLACK);
		Category.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		curexpenlimit.setBackground(Color.WHITE);
		curexpenlimit.setForeground(Color.BLACK);
		curexpenlimit.setFont(new Font("���ʷչ���", Font.BOLD, 18));
		
		
		changexpenlimit.setBackground(Color.WHITE);
		changexpenlimit.setForeground(Color.BLACK);
		changexpenlimit.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		// ========================================================================
		
		cate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		current.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		change.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
	}
	
}
