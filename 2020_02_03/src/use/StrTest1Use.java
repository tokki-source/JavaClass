package use;

import str.Test1;

public class StrTest1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		System.out.println(t1);
		System.out.println(t2.toString()); //13 == 14 ; 
		System.out.println(t2); //println �� toString ����
		
		// == String ref = t1 ; ���� => t1.toString ����
		//object ���� ���� ��Ʈ������ ��ȯ�����ְ� ������ toString���
		//println�� ���� toString�����ʾƵ� �ڵ����� ȣ��
	}

}
