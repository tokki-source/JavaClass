package ch3;

import java.util.Scanner;

/**
  �Ǹ� ������ ���ڵ�� �о� �Ѿ��� ����ϴ� ���α׷� �ۼ�
  ���� : ���ڵ� ������ ��ü�� ���ݴ�� q�� �Է��ϸ� �Է� ������ ����ϰ� ����
  ���� : ��ǰ
  ��ǰ1 -> ��� or ���� 
  ��� - ��ǰ 1 
  ���� - ���� while ��
  q�Է�
 */
public class Test6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		String end;
		
		while(true) {
			System.out.println("��ǰ������ �Է��ϼ���");
			end = scanner.nextLine();
			
			switch(end){
				case "q":{
					System.out.println("�հ�: "+sum);
					return;
				}
				default :
					sum+=Integer.parseInt(end);
					break;
					
			}
		}	
	}

}
/*
public static void main(String [] args){}   �̷��� ������� ���θ޼ҵ� �Դϴ�.
�� �޼ҵ�� Ư���� �޼ҵ�� ������ �ִ� �޼ҵ��̰� java �����Ϸ��� �����ϴ� ���� �̷� �޼ҵ带 ��ó�� ã�� ���� �Ǿ� �ֽ��ϴ�.
���⼭  String [ ] args ��  ��Ʈ��Ÿ���� �迭�� args�� �����Ѱ����μ�
�ڹٸ� ����ÿ� �ִ� �μ����� �޽��ϴ�.  

��� ����ÿ� java Ŭ�����̸� a,b,c...�ϰ� �Ǹ�
args[0] = "a";    args[1] = "b";.. �̷������� ���� �˴ϴ�.

Integer.parseInt(args[0]); 
->ù��° ���� args[0]�� ���� �������·� �ٲٷ��� �ϴ� ���Դϴ�.
 
 * */