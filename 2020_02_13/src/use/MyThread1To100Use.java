package use;

import thread.MyThread1To100;

public class MyThread1To100Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 시작");
		Thread thread = new MyThread1To100("#1");
		Thread thread2 = new MyThread1To100("#2");
		Thread thread3 = new MyThread1To100("#3");
		//귀찮으면 list만들어 start
		thread.start();
		thread2.start();
		thread3.start();
		System.out.println("메인 종료 전");
	}

}
