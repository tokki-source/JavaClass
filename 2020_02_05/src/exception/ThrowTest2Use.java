package exception;

import exception.ThrowsTest2;

public class ThrowTest2Use {
/**
 * ���ܹ߻��� ���� �ذ����� ���� ��
 * throws�� ���ܸ� �ذ��ϴ� ���� �ƴ϶� ���� �޼ҵ忡�� ���ѱ�°�
 * main�� ȣ���� JVM �� ���� ������ �� �ѱ�Ƿ� ������
 * ���ܰ� �߻��ȴ�. 
 * ---> main �� throws ArithmeticException ����� try catch
 */ 
	public static void main(String[] args)/* throws ArithmeticException */ {
		// TODO Auto-generated method stub
		ThrowsTest2 test2 = new ThrowsTest2();
		try {
			System.out.println( test2.calc(4,0) ); //calc() call 
		} catch(ArithmeticException e) {
			System.out.println(ThrowTest2Use.class +"0���� ������ �ȵȴ�");
		} catch(Exception e) {
			System.out.println("�� �� ���� ���ܻ���");
		}
		
	}

}
