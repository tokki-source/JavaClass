package ����;

import java.io.InputStream;

import java.util.InputMismatchException;

import java.util.Scanner;

public class TryCatchTest3 {

	public int method() { 
		// TODO Auto-generated method stub
		Scanner conInput = new Scanner(System.in);
		//in ���¸�ü ����? 1.0 ����, static & final�ϴϱ� ����� In �Ǿ��5.
		int num1 = 0;
		int num2 = 0;
		int res = 0;
		
		try {
	
		System.out.println("��1: "); num1 = conInput.nextInt();
		System.out.println("��2: "); num2 = conInput.nextInt();

		res = num1 / num2;
		
		System.out.println(num1 + "/" + num2 + "= " +res);
		return res; //return �ص� finally ���� 
		
		}catch(ArithmeticException e) { //ù��° ���� , exception handling�̶�� �� 
			System.out.println(e.getMessage());
			System.out.println("0�� �ƴ� ��ġ �Է�");
			return -1;
		}catch(InputMismatchException e) { //�ι��� ����
			System.out.println(e.getMessage());
			System.out.println("������ �Է�");
			return -2;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("������ �� ���� ���ܻ���");
			return -3;
		}finally {
			System.out.println("����� ����");
		}
		
		 // System.out.println("end"); 
		 // return  0;
	}
	public static void main(String[] args) {
		//method();
		TryCatchTest3 test3 = new TryCatchTest3();
		System.out.println("return value:" + test3.method());
	
	}

}
