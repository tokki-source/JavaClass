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

import java.util.Scanner;

public class TryCatchTest4 {
	
	//�ʵ� 
	private int num1;
	private int num2;
	private int add;
	private int subt;
	private int multiple;
	private int div;
	

	Scanner conInput = new Scanner(System.in);
	//�Է�()
	public void input() {
		System.out.println("��1: "); num1 = conInput.nextInt();
		System.out.println("��2: "); num2 = conInput.nextInt();
	}
	
	//����(), public �ʿ����� ���
	public void calc() {
		add = num1 + num2;
		subt = num1 - num2;
		multiple =num1 * num2;
		div = num1 / num2;
		
	}
	
	//������
	public void resOutPut() {
		System.out.println(num1 + "+" + num2 + "= " +add);
		System.out.println(num1 + "-" + num2 + "= " +subt);
		System.out.println(num1 + "*" + num2 + "= " +multiple);
		System.out.println(num1 + "/" + num2 + "= " +div);

	}

}
