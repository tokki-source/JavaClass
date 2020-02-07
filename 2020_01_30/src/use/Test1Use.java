package use;

import java.sql.Ref;

import staticTest.Test1;

public class Test1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ref =new Test1();
		ref.nonStaticMethod1(); // 인스턴스(에 의해 호출되는) 메소드
		ref.staticMethod1();
		
		Test1.staticMethod1();	
		//Test1.nonstaticMethod1(); //non~ 인스턴스가 나와야만 쓸 수 있음

		int num =Integer.parseInt("123"); //클래스 명에 의해 호출 받아짐
	}

}
