package use;

import thread.MyThread1To100;

public class MyThread1To100Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() ����");
		Thread thread = new MyThread1To100("#1");
		Thread thread2 = new MyThread1To100("#2");
		Thread thread3 = new MyThread1To100("#3");
		//�������� list����� start
		thread.start();
		thread2.start();
		thread3.start();
		System.out.println("���� ���� ��");
	}

}
