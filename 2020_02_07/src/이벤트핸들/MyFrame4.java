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

public class MyFrame4 extends JFrame {

	private JButton  btn7=new JButton("7");
	private JButton  btn8=new JButton("8");
	private JButton  btnClear=new JButton("C");

	private JTextField  tfRes = new JTextField("");
	private ActionListener eventProcesor = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getActionCommand());
			System.out.println(e.getModifiers());
			System.out.println(e.getSource());
			System.out.println(e.paramString());

		}

	} ;

	
	public MyFrame4() {

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
		//==> ó���ڴ� �͸� .InnerClass�� ����ϰ����� ���� �����ϰ� ����� ����
		// ==> ���� �Ѵٴ� ���� ������������ ����ڴٴ� ���̰� 
		// ==> �ٸ� �޼ҵ忡 ����� �� �ֵ��� ��������ڸ��� �ְ� ���ڴ�

		btnClear.addActionListener(eventProcesor );
		btn7.addActionListener(eventProcesor );
		btn8.addActionListener(eventProcesor );
		tfRes.addActionListener(eventProcesor );

		// ��ġ, ũ�� ����
		this.setLocation(200, 300);
		this.pack();

	}

	

}






