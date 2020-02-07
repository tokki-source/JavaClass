package exception.sub;

import exception.MyException;
import exception.ThrowsTest2;

public class SubThrowTest2 extends ThrowsTest2 {
	
	public SubThrowTest2(int a , int b) {
		super(a,b);
	}

	@Override  //throws ~~Exception 
	public int calc(int a, int b) throws ArithmeticException, MyException {
		// 지금은 처리 문장이 중요하지 않음. 단지 Override 시 throws 부분에 대한 규칙
		return 0;		
	}@Override 
	public void init()throws Exception{
		super.init();
	}
	/*  
	 * @Override public int calc(int a, int b) throws Exception { // 지금은 처리 문장이 중요하지
	 * 않음 단지 , 오버라이드시 throws 부분에 대한 규칙 return 0; }
	 */
}
