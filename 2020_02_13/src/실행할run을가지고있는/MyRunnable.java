package 실행할run을가지고있는;

public class MyRunnable implements Runnable { //runnable 이 가지고 있는 메소드 : only run()

	@Override
	public void run() {
		System.out.println("현재 스레드의 이름:"+ Thread.currentThread() );
	}

}
