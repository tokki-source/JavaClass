package use;

import str.Test1;
import str.ToStringTest;

public class ToStringTestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringTest tt1 = new ToStringTest();
		ToStringTest tt2 = new ToStringTest("�ָ���", 18);
		Test1		test1 = new Test1();
		System.out.println(tt1); //~(tt1.toString)�� ����
		System.out.println(tt2);
		System.out.println(test1);

	}
//test1 �� ����Ʈ���� �������̵� ���� �ʾұ� ������ �ٸ���� ���
}
