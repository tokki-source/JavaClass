package �̺�Ʈ�ڵ�;




import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;




import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

/**

 *  ��ư 3��, �ؽ�Ʈ �ʵ� 1�� ����

 *  ��ư 2��(7,8)�� ��ư�� ������ �ش���� �ؽ�Ʈ �ʵ忡 �����Ѵ�

 *  ��ư�� C��ư�� �ؽ�Ʈ�ʵ带 Ŭ�����Ų�� 

 * @author ������

 *

 */

import javax.swing.JTextField;

public class MyFrame2 extends JFrame {

	private JButton  btn7=new JButton("7");
	private JButton  btn8=new JButton("8");
	private JButton  btnClear=new JButton("C");

	
	private JTextField  tfRes = new JTextField("");

	

	public MyFrame2() {

		// ������Ʈ�� ���� �ν��Ͻ��� ������� �����Ƿ� �������ʹ� ������ �߿����� �ʴ�

		// �����ӿ� ��ư�� �ؽ�Ʈ�ʵ带 ��ġ�Ѵ�

		//  ?????  ��ġ������ ����???? �⺻�� BorderLayout

		JPanel btnPane = new JPanel();

			btnPane.add(btn7);
			btnPane.add(btn8);
			btnPane.add(btnClear);

		//this.add("Center", btnPane );
		//this.add( btnPane ,BorderLayout.CENTER);

		this.add(btnPane );

		this.add("South",tfRes);

		// �̺�Ʈ ������ ��� 

		MyActionHandler handler = new MyActionHandler();
		btnClear.addActionListener(handler );
		btn7.addActionListener( handler);
		btn8.addActionListener( handler );
		tfRes.addActionListener(handler );

		// ��ġ, ũ�� ����

		this.setLocation(200, 300);
		this.pack();

	}

	

	protected class MyActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			System.out.println(e.getModifiers());
			System.out.println(e.getSource());
			System.out.println(e.paramString());

		}

	}

	

	

}
