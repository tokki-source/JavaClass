package ����;

public class AA2 {

	// �޼ҵ�� ��� �ߺ�-> �����ε�
	/*
	 * void m1() { //#1 System.out.println("Super�� m1"); }
	 */
	//integer ���� �� �ϴ� ���� ����ϴٸ�?
	//���� ������ �ʿ� ���� �޼���(�ڷ��� ...������) ���·� 
	// => varargs : (variable args, ��������, ���� �Ű�����)
	// �����ε��� ���̱� ���ؼ� ��
	public void m1(int ...a) { 
		System.out.println("int...a");
		for (int d : a) {
			System.out.println(d);
		}
	}

	/*
	 * void m1(int a) { //#2 System.out.println(a); } void m1(int a, int b) { //#3
	 * System.out.println(a+b);
	 * 
	 * } void m1(int a, int b, int c) { //#4 System.out.println(a+b+c);
	 */

	public void m1(String a) { // #5

	}

}
