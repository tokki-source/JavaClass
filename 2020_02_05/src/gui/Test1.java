package gui;

 
import java.awt.BorderLayout; //�̷� ���̾ƿ����鼭 �ƹ��͵� �������� ���ͷ� ������
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 extends JFrame {
	private JButton okBtn;
	private JButton cancelBtn;
	
	public Test1() {
		super("���� ������ ^ ^");
		//component : okBtn.. 		//�� �������� �ϳ��� ������Ʈ���� �� ����
		okBtn = new JButton("OK"); //�� ���� ������ ok���ٰ� �������� cancel�� --> panel�� ����
		cancelBtn = new JButton("Cancel");
		
		//BorderLayout manager = new BorderLayout();
		//FlowLayout manager = new FlowLayout();
		GridLayout manager = new GridLayout();
		setLayout(manager);
		// getRootPane();
		add(okBtn);
		add(cancelBtn);
		init();
	}
	
	public void init() {
		setBounds(100,100,500,100);
		
		
	}
}
