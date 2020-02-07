package �̺�Ʈ�ڵ�;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * ��ư 3��, �ؽ�Ʈ�ʵ� 1���� �����
 * ��ư 2���� ��ư�� ������ �ش� ���� �ؽ�Ʈ�ʵ忡 �����Ѵ�.
 * ��ư�� C��ư�� �ؽ�Ʈ�ʵ带 Ŭ�����Ų��
 * @author bitcamp
 *
 */
public class MyFrame3 extends JFrame {
	private JButton Btn7 = new JButton("7");
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");
	
	private JTextField tfRes = new JTextField();
	
		//borderLayout : ���� 1= ������Ʈ1�� �ʿ�
	public MyFrame3() {
		//������Ʈ�� ���� �ν��Ͻ��� ������� �����Ƿ� �������ʹ� ������ �߿����� �ʴ�.
		//��ġ, ũ�� ����
		//������Ʈ���� ������(ContentPane)�� ��ġ -> �̺�Ʈ������ ���
		// ??????? ��ġ ������ ���� ???? �⺻�� BorderLayout
		 /*south����, north���� - �������. panel �ִ� ������ ... why? �ڹ� */
		JPanel btnPane = new JPanel();
			btnPane.add(Btn7);
			btnPane.add(Btn8);
			btnPane.add(BtnClear);
		   this.add(btnPane); /*---- �̷��� �׳� ���� ���Ϳ� ��
		this.add("Center",btnPane);  ���� ����
		this.add(btnPane, BorderLayout.CENTER);*/

		 /*getContentPane< RootPane�� ����.���ڴ� �ö󰬴ٰ� �������� ����������?*/
		
		   
		   //�̺�Ʈ ������ ��� ===> ó���ڴ� InnerClass�� �ν��Ͻ��� ���� ������ ��� 
		   //c.f.remove~~ �����߿� ������ ������ �� ��//��ư�� �׼��� �켱����!!(�߿�)  
		   BtnClear.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   System.out.println(e.getActionCommand());
				   System.out.println(e.getModifiers());
				   System.out.println(e.getSource());
				   System.out.println(e.paramString());
			   }
		   });
		   Btn7.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   System.out.println(e.getActionCommand());
				   System.out.println(e.getModifiers());
				   System.out.println(e.getSource());
				   System.out.println(e.paramString());
			   }
		   });
		   Btn8.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   System.out.println(e.getActionCommand());
				   System.out.println(e.getModifiers());
				   System.out.println(e.getSource());
				   System.out.println(e.paramString());
			   }
		   }); 
		   tfRes.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   System.out.println(e.getActionCommand());
				   System.out.println(e.getModifiers());
				   System.out.println(e.getSource());
				   System.out.println(e.paramString());
			   }
		   });
		   //actionlistner�� implements���� Ŭ���� �ʿ� 
		   //��ġ, ũ��
		   this.setLocation(200, 300);
		   this.pack();
	}
	
}
