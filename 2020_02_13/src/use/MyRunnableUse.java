package use;

import ������run���������ִ�.MyRunnable;

public class MyRunnableUse {

	public static void main(String[] args) {
		Runnable target = new MyRunnable();
		// target.start() //runnable class�� �޼ҵ�1�ۿ� ����, thread Ŭ������ thread���� �� �ڵ����� run�żҵ� ����
		Thread thread = new Thread(target,"#1"); //Thread Ŭ����
		thread.start();			
		Thread thread2 = new Thread(target,"#2"); //thread�� ���� ���°� ���� �� � method�� ������ ���ΰ�? -- target ����־� ��
		thread2.start(); 						  // �׸��� #1, #2ó�� ��ȣ�� ����־� 
		//target : thread�� ���׻��°� ���� �� ������ run method�� ������ �ִ� �޼ҵ�
		System.out.println(thread.currentThread());
	}

} // ���������� ó���� �κ� , runnable ������ ó���� ����ü�� ���������� ó�� !
