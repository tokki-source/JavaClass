package use;

import java.sql.Ref;

import staticTest.Test1;

public class Test1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ref =new Test1();
		ref.nonStaticMethod1(); // �ν��Ͻ�(�� ���� ȣ��Ǵ�) �޼ҵ�
		ref.staticMethod1();
		
		Test1.staticMethod1();	
		//Test1.nonstaticMethod1(); //non~ �ν��Ͻ��� ���;߸� �� �� ����

		int num =Integer.parseInt("123"); //Ŭ���� �� ���� ȣ�� �޾���
	}

}
