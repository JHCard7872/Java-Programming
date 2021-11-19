import javax.swing.*;
import java.awt.*;


public class CategoryManagePanel extends BasicPanel {
	
	// �� ���� �Է� �̹��� �־�� �ϴµ� ��� �ϳ�..?
	private ImageIcon catema = new ImageIcon("images/catema.png"); // �̹��� �ε�
	private JLabel catemaimg=new JLabel("",catema,SwingConstants.CENTER); // ���̺� ����
	
	//private ButtonGroup adc = new ButtonGroup(); // ���� ��ư �׷� ��ü ����
	private JRadioButton add = new JRadioButton(" �߰�      ", true); // ���� ��ư
	private JRadioButton delete = new JRadioButton(" ����      ");
	private JRadioButton change = new JRadioButton(" ����      ");
	
	
	// ==========================================================================
	
	
	private JTextField delecataname = new JTextField(12);
	private JLabel delecn = new JLabel("  ������ ī�װ� �̸�  "); // ��
	
	private JTextField changecatename = new JTextField(12);
	private JLabel changecn = new JLabel("  ������ ī�װ� �̸�  "); // ��
	
	
	// ==========================================================================
	
	
	private String[] delCateArr = {"�ĺ�                            ", "����     ", "�����    "};
	private JComboBox<String> delCate = new JComboBox<String>(delCateArr); // ��ġ ������ �޺��ڽ�
	private JLabel delcate = new JLabel(" ������ ī�װ� ����   "); // ��
	
	
	private String[] chaCateArr = {"�ĺ�                            ", "����     ", "�����    "};
	private JComboBox<String> chaCate = new JComboBox<String>(chaCateArr); // ��ġ ������ �޺��ڽ�
	private JLabel chacate = new JLabel(" ������ ī�װ� ����   "); // ��
	
	
	// ==========================================================================
		
	public CategoryManagePanel(JFrame frame) { // ������
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
		CenterPanel.add(add); // ������� ����
		CenterPanel.add(delete);
		CenterPanel.add(change);
		CenterPanel.add(delecn);
		CenterPanel.add(delecataname);
		CenterPanel.add(delcate);
		CenterPanel.add(delCate);
		CenterPanel.add(changecn);
		CenterPanel.add(changecatename);
		CenterPanel.add(chacate);
		CenterPanel.add(chaCate);
	}
	
	
	
	private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
		
		add.setBackground(Color.WHITE);
		add.setForeground(Color.BLACK);
		add.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		delete.setBackground(Color.WHITE);
		delete.setForeground(Color.BLACK);
		delete.setFont(new Font("���ʷչ���", Font.BOLD, 18));
		
		
		change.setBackground(Color.WHITE);
		change.setForeground(Color.BLACK);
		change.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		// ========================================================================
		
		delecataname.setBackground(Color.WHITE);
		delecataname.setForeground(Color.BLACK);
		delecataname.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		changecatename.setBackground(Color.WHITE);
		changecatename.setForeground(Color.BLACK);
		changecatename.setFont(new Font("���ʷչ���", Font.BOLD, 18));
		
		// ========================================================================
		
		
		delCate.setBackground(Color.WHITE);
		delCate.setForeground(Color.BLACK);
		delCate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		chaCate.setBackground(Color.WHITE);
		chaCate.setForeground(Color.BLACK);
		chaCate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		// ========================================================================
		
		
		delecn.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		changecn.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		delcate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		chacate.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		
	}
	
	
	
	
	
	
}
