package ����;
import java.util.ArrayList;
import java.util.Date;

public class OverTest_Param2 {
	static public void callAA(AA ref) { //upcasting 
		System.out.println("callAA(AA ref)");
		ref.m1();
	}

	public static void main(String[] args) {

		callAA(new SubAA()); 
		System.out.println("//////////////////");
		callAA(new BBAA());

		System.out.println("/////////////////");
		System.out.println(new Date()); // ����Ŭ���� �� object�� �޾���
		System.out.println(new BBAA()); //upcasting
		//�����ڷ����� �͵� 10 -> ����ȯ �ڵ����εǼ� 10�� integerŸ���� �޾���
		System.out.printf("%d", 10); 
	
		AA aaa = new SubAA(); //upcasting 
		// SubAA rrr = aaa; //subAA�� ������ ���⶧���� ����
		AA aa22 = new BBAA();

		//�������� �ʴ� ����??? �ڷ����� �±� ������(casting)
		//bbaaŸ�԰� ��� ����==> ���� �ٲ� �� ����
		//aa22�� �����ϴ� ��ü�� ���������� �ľ��ؾ�
		SubAA rrr = (SubAA)aaa;
			  rrr = (SubAA)aa22;
	
			  int qq= 10;
			  Integer ii = new Integer(qq); //---> ����
			  ii = qq;
			  qq = new Integer(99);
	}

}