package ����;

import java.util.ArrayList;
import java.util.List;

public class OverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA ref = new AA(); //���� ����, static binding 
		SubAA  ref2 = new SubAA();  //���� ���ε��� ���� ������?
		ref.m1();// AA
		ref2.m1();//SubAA
		
		AA refX= new SubAA();
		refX.m1();
		refX= new SubAASub();
		refX.m1();
		refX= new AA();
		refX.m1();
	
		/**
		 * abstract, interface �� ������ �ִ� �޼ҵ带 �������̵� �ϱ� ���� ��
		 * ==> 
		 */	
		List  refff= new ArrayList();
		refff.add("dfsdfs");
		//refff= new List();
		
		
	}
	
}
