package thread;
// Runnable ����
// Thread �� �ν��Ͻ����� �����ϴ� �ڿ��� ���ؼ� �� �������� ������ �ְ� �ʹ�
//--> class�� Runnable �� ����� Thread �� Ÿ���� �����. 
// == ����� ���ҽ�, �����͸� ó���ϱ� ���� ��
// withdraw �� run �� ����־ ��� x but synchro methodó���� ���� �� �������ϱ� ������ ���� ����
// �� Ÿ���� ��Ҵ���? 
// synchro ���� ������ ������ ���� �� ����. --> ���� ���� ��� �켱���� ó���ϵ��� ���ִ� �޼ҵ�
// while �ٱ��� �ֵ� �������, ����� �Էº� ��~wait �ձ��� �� �ֵ� ������
import java.util.Scanner;

/**
 * �󸶸� ����? ������� ������ ó�� ����ó���޼ҵ� withDraw
 */
public class ATMSample implements Runnable {
	private int balance = 100000;
	private String custName = "";
	private Scanner input = new Scanner(System.in);

	/**
	 * howMuch : ��ݾ� 
	 * ��ݾ��� �ܾװ� ���ؼ� �����ϸ� balance ���� ���ش� 
	 * �ܾ��� �����ϸ� �޼��� ���
	 */
	synchronized private void withDraw(int howMuch) {// �Ű������� �޾��� �� ��ŭ �����Ϸ��� �ϴ� �޼ҵ�
		if (balance >= howMuch) {
			// ������� ����
			balance -= howMuch;
			// �ܾ��� �� ���Ҵ��� ���
			System.out.println(custName + "��\n" + howMuch + "���� �����Ͽ� " + balance + "�� ���ҽ��ϴ�");
		} else {
			// �ܾ��� ����
			System.err.println("�ܾ���" + balance + "��, ã�� �ݾ�:" + howMuch + "��" + "\n�ܾ��� �����մϴ�");
		}
		notifyAll();
	}

	/**
	 * ������ �󸶸� ������ ������ ����, �ݾ� ���� ���ְ�(withdraw ȣ��) 
	 * ������ ������ ��� �ݺ� ---> �ܾ��� 0���� �� ������
	 */
	@Override
	public void run() {

		while (balance > 0) {
			synchronized (this) {
				try {
					custName = Thread.currentThread().getName();
					System.out.print(custName + "���� " + "�����ܾ��� " + balance + "�� �Դϴ�\n");
					System.out.println(custName + "��" + "�󸶸� �����Ͻðڽ��ϱ�?");
					int a = input.nextInt();
					withDraw(a);

					wait(); // �ݵ�� synchronized method�� ���� ���� ��� ����
							//--> �̰��� �����ϴ� ���� notify or notifyAll
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
	}

}
