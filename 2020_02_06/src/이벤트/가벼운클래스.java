package 이벤트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//이벤트에 집중한 예제, 레이아웃은 중요하지 않음
public class 가벼운클래스 extends JFrame{

	private JTextField resTF;
	private JTextField numTF1;
	private JTextField numTF2;
	
	private JButton resBtn;
	
	private 가벼운클래스() {
		//component 의 인스턴스 생성
		resTF = new JTextField("결과가 나올 자리 ");
		numTF1 = new JTextField("정수입력");
		numTF2 = new JTextField("정수입력");
		resBtn = new JButton("=");
		
		//JFrame이라는 container에 생성된 components 를 붙여준다
			//앞에 contentpane(rootpane) 빠진 상태
		setLayout(new FlowLayout());
		add(numTF1);
		add(new JLabel("+"));
		add(numTF2);
		add(resBtn);  
		add(resTF);
		resTF.setText("");
		
		//이벤트가 발생하는지 감시자를 등록, 위와 순서는 상관없음(instance 생성 후에 오기만 하면 됨)
		resBtn.addActionListener(new XXX()/*A*/);
		setBounds(100, 100, 200, 200);
	}

	protected class XXX implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int num1 = Integer.parseInt(numTF1.getText()); //형변환
			int num2 = Integer.parseInt(numTF1.getText()); //형변환
			resTF.setText(num1 + "+" + num2 + "=" + (num1+num2));
		}
		
	}
	
	public static void main(String[] args) {
		가벼운클래스  ref = new 가벼운클래스();

		ref.setVisible(true);

		
		
		
		
		
	}
}
