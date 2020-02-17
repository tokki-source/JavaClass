package thread;

public class MyThreadSleep extends Thread {
	@Override
	public void run() {
		String name = currentThread().getName();
		for(int i=1;i<=5;i++) {
			System.out.println(name + "::" + i);
			try {
				System.out.println(name + "스레드 sleep 전");	
				sleep(3000);
				System.out.println(name + "스레드 sleep 후");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 			//sleep 메소드를 호출하는 run method
						//예외 처리에 try catch만 나오고 throws 나오는 이유?
						// 내가 overriding 하려고 하는 메소드 : 기초클래스가 가진 run method에
						// throws 없음.  throws 동일하던가,생략하던가, sub exception이 나오던가!
			// overriding 시 기초클래스에 throws 부분 없으면 쓸수 없다.
						// interuppted : 실행 중인데 외부에서 들어올때 --> 발생하면 종료해줘라는 명령
		}
	}
	public MyThreadSleep() {
		
	}
	
	public MyThreadSleep(String name) {
		super(name);
	}
}
