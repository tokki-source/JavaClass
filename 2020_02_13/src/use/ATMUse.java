package use;

import java.util.ArrayList;
import java.util.List;

import thread.ATMSample;

public class ATMUse {

	public static void main(String[] args) {
		//ATMSample 의 기초클래스가 Runnable이라서
		ATMSample target = new ATMSample();
		
		
		List<Thread> threads = new ArrayList<Thread>();
		threads.add(new Thread(target, "엄마"));
		threads.add(new Thread(target, "아빠"));
		threads.add(new Thread(target, "아들"));
		threads.add(new Thread(target, "손자"));
		
		for(Thread t : threads) {
			t.start();
		}
	}

}
