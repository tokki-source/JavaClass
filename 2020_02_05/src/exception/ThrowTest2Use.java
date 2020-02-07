package exception;

import exception.ThrowsTest2;

public class ThrowTest2Use {
/**
 * 예외발생된 것을 해결하지 않은 것
 * throws는 예외를 해결하는 것이 아니라 다음 메소드에게 떠넘기는것
 * main을 호출한 JVM 에 예외 사항을 떠 넘기므로 여전히
 * 예외가 발생된다. 
 * ---> main 뒤 throws ArithmeticException 지우고 try catch
 */ 
	public static void main(String[] args)/* throws ArithmeticException */ {
		// TODO Auto-generated method stub
		ThrowsTest2 test2 = new ThrowsTest2();
		try {
			System.out.println( test2.calc(4,0) ); //calc() call 
		} catch(ArithmeticException e) {
			System.out.println(ThrowTest2Use.class +"0으로 나누면 안된다");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외사항");
		}
		
	}

}
