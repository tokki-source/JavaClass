package �̺�Ʈ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//�̺�Ʈ�� ������ ����, ���̾ƿ��� �߿����� ����
public class ������Ŭ���� extends JFrame{

	private JTextField resTF;
	private JTextField numTF1;
	private JTextField numTF2;
	
	private JButton resBtn;
	
	private ������Ŭ����() {
		//component �� �ν��Ͻ� ����
		resTF = new JTextField("����� ���� �ڸ� ");
		numTF1 = new JTextField("�����Է�");
		numTF2 = new JTextField("�����Է�");
		resBtn = new JButton("=");
		
		//JFrame�̶�� container�� ������ components �� �ٿ��ش�
			//�տ� contentpane(rootpane) ���� ����
		setLayout(new FlowLayout());
		add(numTF1);
		add(new JLabel("+"));
		add(numTF2);
		add(resBtn);  
		add(resTF);
		resTF.setText("");
		
		//�̺�Ʈ�� �߻��ϴ��� �����ڸ� ���, ���� ������ �������(instance ���� �Ŀ� ���⸸ �ϸ� ��)
		resBtn.addActionListener(new XXX()/*A*/);
		setBounds(100, 100, 200, 200);
	}

	protected class XXX implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int num1 = Integer.parseInt(numTF1.getText()); //����ȯ
			int num2 = Integer.parseInt(numTF1.getText()); //����ȯ
			resTF.setText(num1 + "+" + num2 + "=" + (num1+num2));
		}
		
	}
	
	public static void main(String[] args) {
		������Ŭ����  ref = new ������Ŭ����();

		ref.setVisible(true);

		
		
		
		
		
	}
}
