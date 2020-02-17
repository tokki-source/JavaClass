package thread;

public class MyThread1 extends Thread{
	//매개변수를 갖는 생성자 or 생성자 만들기
	public MyThread1(String threadName) {
		super(threadName);
	}
	@Override	//오버라이드 해서 쓸것 	
	public void run() {
		//super.run(); 하는일 없으니 지워버리기
		System.out.println("현재 스레드의 이름" + currentThread() ); //.붙여서 호출할 필요 없음. myThread1이 thread클래스이기 때문 
	}
	

}
