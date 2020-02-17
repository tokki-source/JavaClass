package use;

import javax.swing.JFrame;

import thread.MultiProgressBarEx;

public class BarUse {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("MultiTreadTest"); //타이틀
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료이벤트   
		//클래스명.~~ 해야함 
		frame.add(new MultiProgressBarEx());
		frame.pack();
		frame.setVisible(true);
	}

}
