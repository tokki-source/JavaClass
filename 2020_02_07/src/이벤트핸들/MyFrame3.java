package 이벤트핸들;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 버튼 3개, 텍스트필드 1개를 만든다
 * 버튼 2개는 버튼을 누르면 해당 수를 텍스트필드에 기입한다.
 * 버튼중 C버튼은 텍스트필드를 클리어시킨다
 * @author bitcamp
 *
 */
public class MyFrame3 extends JFrame {
	private JButton Btn7 = new JButton("7");
	private JButton Btn8 = new JButton("8");
	private JButton BtnClear = new JButton("C");
	
	private JTextField tfRes = new JTextField();
	
		//borderLayout : 영역 1= 컴포넌트1만 필요
	public MyFrame3() {
		//컴포넌트에 대한 인스턴스가 만들어져 있으므로 이제부터는 순서가 중요하지 않다.
		//위치, 크기 지정
		//컴포넌트들을 프레임(ContentPane)에 배치 -> 이벤트감시자 등록
		// ??????? 배치 관리자 누구 ???? 기본은 BorderLayout
		 /*south부터, north부터 - 상관없음. panel 넣는 순서도 ... why? 자바 */
		JPanel btnPane = new JPanel();
			btnPane.add(Btn7);
			btnPane.add(Btn8);
			btnPane.add(BtnClear);
		   this.add(btnPane); /*---- 이렇게 그냥 쓰면 센터에 들어감
		this.add("Center",btnPane);  위와 같음
		this.add(btnPane, BorderLayout.CENTER);*/

		 /*getContentPane< RootPane이 나음.전자는 올라갔다가 내려오는 과정때문에?*/
		
		   
		   //이벤트 감시자 등록 ===> 처리자는 InnerClass의 인스턴스를 참조 변수가 기억 
		   //c.f.remove~~ 실행중에 감시자 해제할 때 씀//버튼은 액션이 우선순위!!(중요)  
		   BtnClear.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   System.out.println(e.getActionCommand());
				   System.out.println(e.getModifiers());
				   System.out.println(e.getSource());
				   System.out.println(e.paramString());
			   }
		   });
		   Btn7.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   System.out.println(e.getActionCommand());
				   System.out.println(e.getModifiers());
				   System.out.println(e.getSource());
				   System.out.println(e.paramString());
			   }
		   });
		   Btn8.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
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
		   //actionlistner를 implements해줄 클래스 필요 
		   //위치, 크기
		   this.setLocation(200, 300);
		   this.pack();
	}
	
}
