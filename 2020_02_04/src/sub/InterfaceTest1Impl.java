package sub;

import a.InterfaceTest1;

public class InterfaceTest1Impl implements InterfaceTest1{
	 //interface�� method�� all public 
	// sub���� default�� ��ҽ��Ѽ� �������ؼ� �ȵ�(���� �аԽ�� �ű⶧����)
	
	@Override
	public void method(String msg) {
		System.out.println("override�� �޼ҵ�");
	}
	public void method2() {
		//interface ���⶧���� use���� test2.method2();�� ȣ�� �Ұ�
	}
	//@Override
	public static void method3() {
		System.out.println("InterfaceTest1�� Method3()");
	}
	
}
