package gui;

 
import java.awt.BorderLayout; //이런 레이아웃쓰면서 아무것도 안잡으면 센터로 잡히고
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 extends JFrame {
	private JButton okBtn;
	private JButton cancelBtn;
	
	public Test1() {
		super("나의 프레임 ^ ^");
		//component : okBtn.. 		//한 영역에는 하나의 컴포넌트만들어갈 수 있음
		okBtn = new JButton("OK"); //둘 같이 있으면 ok들어갔다가 지워지고 cancel로 --> panel에 넣자
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
