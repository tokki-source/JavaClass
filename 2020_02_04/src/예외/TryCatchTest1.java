package ����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int res = 0;
		
		try {
			
		
		Scanner conInput = new Scanner(System.in);
			//in ���¸�ü ����? 1.0 ����, static & final�ϴϱ� ����� In �Ǿ��.
		
		System.out.println("��1: "); num1 = conInput.nextInt();
		System.out.println("��2: "); num2 = conInput.nextInt();

		res = num1 / num2;
		
		System.out.println(num1 + "/" + num2 + "= " +res);
		
		}catch(ArithmeticException e) { //ù��° ���� , exception handling�̶�� �� 
			System.out.println(e.getMessage());
			System.out.println("0�� �ƴ� ��ġ �Է�");
		}catch(InputMismatchException e) { //�ι��� ����
			System.out.println(e.getMessage());
			System.out.println("������ �Է�");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("������ �� ���� ���ܻ���");
		}finally {
			System.out.println("����� ����");
		}
		System.out.println("end"); //�̵��� break, return�� ����
	}

}
