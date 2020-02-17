package thread;

public class MyThreadSleep extends Thread {
	@Override
	public void run() {
		String name = currentThread().getName();
		for(int i=1;i<=5;i++) {
			System.out.println(name + "::" + i);
			try {
				System.out.println(name + "������ sleep ��");	
				sleep(3000);
				System.out.println(name + "������ sleep ��");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 			//sleep �޼ҵ带 ȣ���ϴ� run method
						//���� ó���� try catch�� ������ throws ������ ����?
						// ���� overriding �Ϸ��� �ϴ� �޼ҵ� : ����Ŭ������ ���� run method��
						// throws ����.  throws �����ϴ���,�����ϴ���, sub exception�� ��������!
			// overriding �� ����Ŭ������ throws �κ� ������ ���� ����.
						// interuppted : ���� ���ε� �ܺο��� ���ö� --> �߻��ϸ� ���������� ���
		}
	}
	public MyThreadSleep() {
		
	}
	
	public MyThreadSleep(String name) {
		super(name);
	}
}
