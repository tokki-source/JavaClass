package use;

import a.InterfaceTest1;
import sub.InterfaceTest1Impl;

public class InterfaceTest1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor =90;
		if(kor == InterfaceTest1.MAX) {
			//날짜(365), 의미를 가지고 있는 숫자(변하면 안되는 것)
			//final 변수로 만들어 주고 static으로 만들어 씀
		}
		switch(kor) {
		case InterfaceTest1.MAX :
		}
		InterfaceTest1 test1; 
		//instance아니고 reference(참조 변수)이기 
		//때문에 에러 나지 않음
		
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
