package exception.sub;

import exception.MyException;
import exception.ThrowsTest2;

public class SubThrowTest2 extends ThrowsTest2 {
	
	public SubThrowTest2(int a , int b) {
		super(a,b);
	}

	@Override  //throws ~~Exception 
	public int calc(int a, int b) throws ArithmeticException, MyException {
		// ������ ó�� ������ �߿����� ����. ���� Override �� throws �κп� ���� ��Ģ
		return 0;		
	}@Override 
	public void init()throws Exception{
		super.init();
	}
	/*  
	 * @Override public int calc(int a, int b) throws Exception { // ������ ó�� ������ �߿�����
	 * ���� ���� , �������̵�� throws �κп� ���� ��Ģ return 0; }
	 */
}
