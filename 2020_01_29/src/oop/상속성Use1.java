package oop;

import javax.swing.JFrame;
 
public class 상속성Use1 extends JFrame  {  //JFrame 생략하면 extends object로 잡힘
	// : JFrame의 성격을 가지는(JFrame으로 확장되는) 하나의 클래스를 새로 만들겠다는 뜻 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		상속성Use1 frame = new 상속성Use1();
	  //		참조형변수 
		frame.setBounds(400,400,200,300);  //c.f.locale : 지금 사용하고 있는 컴퓨터의 위치
		frame.setVisible(true); //<->get 
		
		System.out.println( frame.getBackground() ) ;
	}

}
