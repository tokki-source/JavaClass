package ����;
/**
 ��1: 5.5 
 ��2: 5
 5.5+5 = 10.5
 5.5-5 = 0.5
 5.5*5 = 
 5.5/5 = 
 -> ���������ϰ� ��ٷ� 
  ���� ������ �Է�, �Ҽ��� ���ϴ� �Է����� ������
 ->��1��
  ��1: 5�Է�
 ->��2
 ��2 : 0
 ==> ���������� ����
  0�� �Է����� ������
  => ��2��
 ��2 : 1~
 ��Ģ����

//////////////
 class
 	num1
 	num2
 	
 	plus
 	minus
 	multiple
 	div
 		
 		�Է� �޼ҵ�
 		���� �޼ҵ�
 		��� ��� �޼ҵ�
 * @author bitcamp
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest5 {
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
	public void input() {
		try {
			System.out.print("��1: "); 
			num1 = conInput.nextInt(); 
			/*
			 * conInput.nextInt(); conInput.nextInt(); conInput.reset();
			 */
			
			System.out.print("��2: "); 
			num2 = conInput.nextInt();

			calc();
			return;
		}catch (InputMismatchException e) {
			msg = "���� ������ �Է�, �Ҽ��� ���ϴ� �Է����� ������.";
		}catch(Exception e){
			msg = "�� �� ���� ���� �߻�, �Ҽ��� ���ϴ� �Է� ���� ������.";
		} //������ ���� finally �ʿ��
		
		//int ����ȯ�ǰ� ���� .0�� ����Ǿ� �ֱ� ������ ���� 
		//conInput.reset();
		System.out.println(msg);
		input();
	}
	
	//����(), public �ʿ����� ���
	public void calc() {
		add = num1 + num2;
		subt = num1 - num2;
		multiple =num1 * num2;
		div = num1 / num2;
		
		//0�� ���ް� ���� ���� divide zero �� ��ٸ� num2�� ���� �Է¹޾Ƽ� ����ó��
	}
	
	//������
	public void resOutPut() {
		System.out.println(num1 + "+" + num2 + "= " +add);
		System.out.println(num1 + "-" + num2 + "= " +subt);
		System.out.println(num1 + "*" + num2 + "= " +multiple);
		System.out.println(num1 + "/" + num2 + "= " +div);

	}

}
