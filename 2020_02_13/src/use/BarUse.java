package use;

import javax.swing.JFrame;

import thread.MultiProgressBarEx;

public class BarUse {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("MultiTreadTest"); //Ÿ��Ʋ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����̺�Ʈ   
		//Ŭ������.~~ �ؾ��� 
		frame.add(new MultiProgressBarEx());
		frame.pack();
		frame.setVisible(true);
	}

}
