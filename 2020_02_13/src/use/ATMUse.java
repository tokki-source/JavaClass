package use;

import java.util.ArrayList;
import java.util.List;

import thread.ATMSample;

public class ATMUse {

	public static void main(String[] args) {
		//ATMSample �� ����Ŭ������ Runnable�̶�
		ATMSample target = new ATMSample();
		
		
		List<Thread> threads = new ArrayList<Thread>();
		threads.add(new Thread(target, "����"));
		threads.add(new Thread(target, "�ƺ�"));
		threads.add(new Thread(target, "�Ƶ�"));
		threads.add(new Thread(target, "����"));
		
		for(Thread t : threads) {
			t.start();
		}
	}

}
