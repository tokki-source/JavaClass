package thread;






public class Ch11Ex7 extends Thread{

	public int total;

	private SellManager sm;

	

	public void run() {

		String tname = Thread.currentThread().getName();

		//for(int i=0;i<3;i++) {

			System.out.println(tname+"-�Ǹ�:"+sm.sell());

		//}

		System.out.println(tname+" ����");

	}		

	

	public Ch11Ex7() {

		sm = new SellManager();

		total = 100;

	}

	

	public static void main(String[] args) {

		System.out.println("## Ƽ�� ���� ���α׷� ##");

		Ch11Ex7 app = new Ch11Ex7();

		for(int i=0;i<3;i++) {

			Thread mt = new Thread(app);

			mt.start();

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}	

		System.out.println("main ����!!");

	}

	

	class SellManager{

		 synchronized  int sell() {

			total--;

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			return total;

		}

	}
}

