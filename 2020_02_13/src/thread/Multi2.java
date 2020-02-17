package thread;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Multi2 extends JPanel implements ActionListener {
	private JProgressBar bar1, bar2;
	private JButton startBtn;
	private int max = 1000;

	public Multi2() {
		setLayout(new GridLayout(2, 2));
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
		add(new Label(" "));
		add(bar2);

		setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		startBtn.setEnabled(false);
		Thread thread1 = new BarThread(bar1);
		Thread thread2 = new BarThread(bar2);
		thread1.start();
		thread2.start();
	}

	public class BarThread extends Thread {
		private JProgressBar bar;

		public BarThread(JProgressBar bar) {
			this.bar = bar;
		}

		@Override
		public void run() {// 프로그레스바의 밸류가 바뀌는 것을 처리하고 싶다
			int current = 0;
			while (current <= max) {
				current += Math.random() * 100;
				bar.setValue(current);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			startBtn.setEnabled(true);

		}
	}
}
