package use;

import javax.swing.JFrame;

import thread.Multi2;

public class MultiUse2 {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("MultiTreadTest"); //타이틀
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료이벤트   
		//클래스명.~~ 해야함 
		frame.add(new Multi2());
		frame.pack();
		frame.setVisible(true);
	}

}
