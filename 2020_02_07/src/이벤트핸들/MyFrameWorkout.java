package 이벤트핸들;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *  버튼 3개, 텍스트 필드 1를 만듬
 *  버튼 2개(7,8)는 버튼을 누르면 해당수를 텍스트 필드에 기입한다
 *  버튼중 C버튼은 텍스트필드를 클리어시킨다 
 * @author 이현주
 *
 */
import javax.swing.JTextField;

public class MyFrameWorkout extends JFrame implements ActionListener {
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btnClear = new JButton("C");

	private JTextField tfRes = new JTextField("");

	public MyFrameWorkout() {
		// 컨포넌트에 대한 인스턴스가 만들어져 있으므로 이제부터는 순서가 중요하지 않다
		// 프레임에 버튼과 텍스트필드를 배치한다
		//   ?????  배치관리자 누구???? 기본는 BorderLayout
	
		JPanel btnPane = new JPanel();
		btnPane.add(btn7);
		btnPane.add(btn8);
		btnPane.add(btnClear);
		
		this.add(btnPane);
		this.add("South", tfRes);

		// 이벤트 감시자 등록

		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				System.out.println(e.getModifiers());
				System.out.println(e.getSource());
				System.out.println(e.paramString());
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//btn8
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
		// 위치, 크기 지정
		this.setLocation(200, 300);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
