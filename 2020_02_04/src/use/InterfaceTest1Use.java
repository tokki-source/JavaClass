package use;

import a.InterfaceTest1;
import sub.InterfaceTest1Impl;

public class InterfaceTest1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor =90;
		if(kor == InterfaceTest1.MAX) {
			//��¥(365), �ǹ̸� ������ �ִ� ����(���ϸ� �ȵǴ� ��)
			//final ������ ����� �ְ� static���� ����� ��
		}
		switch(kor) {
		case InterfaceTest1.MAX :
		}
		InterfaceTest1 test1; 
		//instance�ƴϰ� reference(���� ����)�̱� 
		//������ ���� ���� ����
		
		//test1 = new InterfaceTest1();
		test1= new InterfaceTest1Impl();
		System.out.println(InterfaceTest1Impl.MAX);
		test1.method("asdfgdsfa");
		// test2.method2();
		
		InterfaceTest1.method3();
		InterfaceTest1Impl.method3();
		//new InterfaceTest1lmp();
	
		
	
		
		
		
		
	}

}
