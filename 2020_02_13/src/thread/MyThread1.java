package thread;

public class MyThread1 extends Thread{
	//�Ű������� ���� ������ or ������ �����
	public MyThread1(String threadName) {
		super(threadName);
	}
	@Override	//�������̵� �ؼ� ���� 	
	public void run() {
		//super.run(); �ϴ��� ������ ����������
		System.out.println("���� �������� �̸�" + currentThread() ); //.�ٿ��� ȣ���� �ʿ� ����. myThread1�� threadŬ�����̱� ���� 
	}
	

}
