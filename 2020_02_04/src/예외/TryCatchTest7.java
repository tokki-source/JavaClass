package ����;
//������
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest7 {
	//�ʵ� 
	private int num1;
	private int num2;
	private int add;
	private int subt;
	private int multiple;
	private int div;
	

	private Scanner conInput = new Scanner(System.in);
	private String msg;

	
	//�Է�()
	public void input2() {
		num1 = input("��1: ");
		num2 = input("��2: ");
		calc();

	}
	int temp =0;

	public int input(String str) {
		
		try {
			System.out.print(str); 
			return temp = conInput.nextInt();
		}catch (InputMismatchException e) {
			msg = "���� ������ �Է�, �Ҽ��� ���ϴ� �Է����� ������.";
		}catch(Exception e){
			msg = "�� �� ���� ���� �߻�, �Ҽ��� ���ϴ� �Է� ���� ������.";
		} //������ ���� finally �ʿ��
		
		//int ����ȯ�ǰ� ���� .0�� ����Ǿ� �ֱ� ������ ���� 
		//conInput.reset();
		conInput.nextLine();
	
		System.out.println(msg);
		
		return input(str);
	}
	
	//����(), public �ʿ����� ���
	/*���� : test6���� div = num1 / num2; 
	 * �� try ~ catch ���� �־ �ϼ��ϱ�*/
	public void calc() {
		add = num1 + num2;
		subt = num1 - num2;
		multiple =num1 * num2;
		try { 
		div = num1 / num2;
		} catch(ArithmeticException e) {
			num2 = input("0�� �Է����� ������");
			calc();
		//�� ���� ���� ����ֱ� ���� �߰��ؾ��� 
		}catch(Exception e) {
			this.msg = "�� �� ���� ����";
		}
		
		
	}
	
	//������
	public void resOutPut() {
		System.out.println(num1 + "+" + num2 + "= " +add);
		System.out.println(num1 + "-" + num2 + "= " +subt);
		System.out.println(num1 + "*" + num2 + "= " +multiple);
		System.out.println(num1 + "/" + num2 + "= " +div);

	}

}
