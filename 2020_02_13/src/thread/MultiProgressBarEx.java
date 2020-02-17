package thread;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
//어디에 멀티 스레드를 할것인지 생각해볼것 
public class MultiProgressBarEx extends JPanel implements ActionListener {
	private JProgressBar bar1, bar2;
	private JButton startBtn;
	private int max = 1000;
	
	public MultiProgressBarEx() {
		setLayout(new GridLayout(2,2));
		
		startBtn = new JButton("Start");
		startBtn.addActionListener(this);
		
		bar1 = new JProgressBar(0, max);
		bar2 = new JProgressBar(0, max);
		bar1.setValue(100);
		bar1.setStringPainted(true);
		bar2.setValue(0);
		bar2.setStringPainted(true);
		
		add(startBtn);
		add(bar1);
		add(new Label(""));
		add(bar2);
		
		setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		startBtn.setEnabled(false);
			int current = 0, current2 =0;
			while(  current <= max ) { //1000보다 작은 동안 반복해 프로그레스바를 이동
				current += Math.random()*10;
				current2 += Math.random()*10;

				bar1.setValue(current);
				bar2.setValue(current2);
			} //random class or max.random 사용
		
		startBtn.setEnabled(true);

	}
	
	//이너클래스로 만들어줌(스타트버튼 많을 떄 ) 
	
	
}
