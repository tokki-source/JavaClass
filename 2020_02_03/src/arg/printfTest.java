package arg;

import java.util.Scanner;

public class printfTest {

	public static void main(String[] args) {
		//�ǽ�1
		int a=3;
		int b=10;
		System.out.printf("%d\n",a*b);
		
		//�ǽ�2
		char k=75;
		System.out.println(k);
		
		
		
		//�ǽ�3
		Scanner scanner = new Scanner(System.in);
		int cash = Integer.parseInt("10000"); //���۷���Ÿ�� ����ȯ
		if(cash<9999) {
			System.out.println("ȯ���մϴ�.");
	
			}
		else {
			System.out.println("�ܾ��� ������ ����ī�带 ����� �� �����ϴ�");

		}
		
		
		scanner.close();
	}

}
