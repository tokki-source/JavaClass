package use;

import javax.swing.JFrame;

import thread.Multi2;

public class MultiUse2 {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("MultiTreadTest"); //Ÿ��Ʋ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����̺�Ʈ   
		//Ŭ������.~~ �ؾ��� 
		frame.add(new Multi2());
		frame.pack();
		frame.setVisible(true);
	}

}
