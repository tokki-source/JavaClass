package oop;

import javax.swing.JFrame;
 
public class ��Ӽ�Use1 extends JFrame  {  //JFrame �����ϸ� extends object�� ����
	// : JFrame�� ������ ������(JFrame���� Ȯ��Ǵ�) �ϳ��� Ŭ������ ���� ����ڴٴ� �� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		��Ӽ�Use1 frame = new ��Ӽ�Use1();
	  //		���������� 
		frame.setBounds(400,400,200,300);  //c.f.locale : ���� ����ϰ� �ִ� ��ǻ���� ��ġ
		frame.setVisible(true); //<->get 
		
		System.out.println( frame.getBackground() ) ;
	}

}
