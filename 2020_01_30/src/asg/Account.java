package asg;
/**
2. ���¹�ȣ ���� account number 
       ���ະ, ������, ��ǰ�� �����?
       ������ : 100-001
     	  100-002
     	  100-003...
     	  

    	�̸�?  �踻��
   	 	�� �� ? 1��
 		�� �Աݾ� ? 10000
	  	 	���� ===> �� 10000 x 12���� == 120,000
	  	 	����� �ݾ� === > ����rate = 2% //���� 120,000 + 2,400 = 122,400
	  	 	�����Ͻðڽ��ϱ�? Y
 */
import java.util.Scanner;
public class Account {
	private int num = 0;
	private String name = "";
	//������ �������Ѿ� static
	private int deposit = 0;
	private int year = 0;
	private static double rate = 2;
	private int total = 0;
	private int intAmount =0;
	private int refund = 0;
	
	public Account() {
		
	}
	
	public void output() {
		System.out.printf("%8d %14s %8d %8d %6.2f %8d %8d %8d  ",
				num, name, deposit, year, rate, total, intAmount, refund);
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�");
		name = scanner.nextLine() ;
		
		System.out.print("���ݾ�");
		deposit = scanner.nextInt() ;
		
		System.out.print("�Ⱓ(��)");
		year = scanner.nextInt() ;
		
		/*
		 * System.out.print("�Ѿ�"); total = scanner.nextInt() ;
		 * 
		 * System.out.print("���ھ�"); intAmount = scanner.nextInt() ;
		 * 
		 * System.out.print("�� ȯ�޾�"); refund = scanner.nextInt() ;
		 */
		
		calc() ;
	}
//	���¹�ȣ     �̸�     ���Աݾ�     �Ⱓ    ����        �Ѿ�       ���ھ�     �����ȯ�޾� 	 
	//����ʿ� : intAmount, 
	private void calc() {
		total = deposit * year ;
		double intAmount = (double)total + (double)total*rate/100;
	

		//get, set generate
		// �������� ������ ������ ��� ������ �����غ���
		// �����Ͻðڽ��ϱ�? ���, ���? ---- �����Ͻðڽ�
		// - �� �ν��Ͻ� ��������� ���� , ��ȣǥ: �����ڿ��� ++
		//���¹�ȣ�� ���� ���� ��������� 
	}

}
