package sub;

import abstractTest.B;

public class SubB extends B {
	//@Override
	public void m1(int a) {
		for(int i=0; i<a ; i++) {
		System.out.println("///////////");
		}
	}
	@Override
	public void m1() { //�굵 override�ε� ������ x
	System.out.println("%%%%%�ҹ�%%%%%");
	}
	
	public void output() {
		mustCall();
	}
	@Override
	protected void overriding() {
		// TODO Auto-generated method stub
		
	}
	
	/* @overloading
	 * public void a() { System.out.println("�ݶ�,���̴�,"); } public void a(int a) {
	 * System.out.println("��� 1 ���2"); }
	 */

}
