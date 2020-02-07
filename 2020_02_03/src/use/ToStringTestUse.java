package use;

import str.Test1;
import str.ToStringTest;

public class ToStringTestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringTest tt1 = new ToStringTest();
		ToStringTest tt2 = new ToStringTest("최말자", 18);
		Test1		test1 = new Test1();
		System.out.println(tt1); //~(tt1.toString)과 동일
		System.out.println(tt2);
		System.out.println(test1);

	}
//test1 은 투스트링을 오버라이딩 하지 않았기 떄문에 다른결과 출력
}
