package use;

import 실행할run을가지고있는.MyRunnable;

public class MyRunnableUse {

	public static void main(String[] args) {
		Runnable target = new MyRunnable();
		// target.start() //runnable class는 메소드1밖에 없음, thread 클래스는 thread실행 시 자동으로 run매소드 구동
		Thread thread = new Thread(target,"#1"); //Thread 클래스
		thread.start();			
		Thread thread2 = new Thread(target,"#2"); //thread가 실행 상태가 됐을 때 어떤 method로 실행할 것인가? -- target 집어넣어 줌
		thread2.start(); 						  // 그리고 #1, #2처럼 번호를 집어넣어 
		//target : thread가 러닝상태가 됐을 때 실행할 run method를 가지고 있는 메소드
		System.out.println(thread.currentThread());
	}

} // 공통적으로 처리할 부분 , runnable 가지고 처리할 떄대체로 공통적으로 처리 !
