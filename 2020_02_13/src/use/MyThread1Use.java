package use;

import thread.MyThread1;

public class MyThread1Use {
	public static void m() {
		Thread thread = new MyThread1("#2"); //MyThread1 : Thread�κ��� �Ļ��� Ŭ���� 
		thread.start();						//������ �������� �̸��� �������
		
	}
	public static void main(String[] args) {
		// ����Ŭ���� thread �� ���۷����� ����Ŭ���� mythread1�� ���۷����� �����Ѵ�
		Thread thread = new MyThread1("#1");  
		thread.start();//mythread1�� ������ �޼ҵ� �ƴ�, �ҷμҵ�
		m();
		System.out.println(Thread.currentThread()); //-> Thread[main, 5(�켱����), main]
	}

} //���� �ν��Ͻ��� ���� run �޼ҵ� ���� == ������ ó��
//�ϳ��� Ŭ������ jframe �� ����� �ʹٸ�? ���� X -- ��� 1�� �ȵǼ�
// ����� ���� �� ��������? �ٽ����ΰ��� extends �� ���� �ް�, �������� interface�� ����
// �ٵ� �ʿ��ϸ� �̳�Ŭ���� ����� �������� �۾��ϴ°� ������ �� ����....
// ���� å�� ��κ� ���� ? �� �� �̻��� ���� Ŭ������ ���� �� �����Ƿ� �׷� ��쿡�� thread�� �Ļ���Ű������ runnable �κ��� implement ���Ѽ� run method ����
// ===> Ȯ��, runnable�� run method�� �ö� ó���� ������μ�?!?!?!?!? ������
// ex. ticketing ��? ������ ���������� ����� �����Ϳ� �����Ͽ� ��� ===> runnable �� target���� thread����� ����� ���ִ°� �� ����


