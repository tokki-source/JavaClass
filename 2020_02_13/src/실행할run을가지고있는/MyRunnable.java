package ������run���������ִ�;

public class MyRunnable implements Runnable { //runnable �� ������ �ִ� �޼ҵ� : only run()

	@Override
	public void run() {
		System.out.println("���� �������� �̸�:"+ Thread.currentThread() );
	}

}
