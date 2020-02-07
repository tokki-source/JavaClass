package sub;

import a.InterfaceTest1;

public class InterfaceTest1Impl implements InterfaceTest1{
	 //interface는 method가 all public 
	// sub에서 default로 축소시켜서 쓰려고해서 안됨(범위 넓게썼던 거기때문에)
	
	@Override
	public void method(String msg) {
		System.out.println("override한 메소드");
	}
	public void method2() {
		//interface 없기때문에 use에서 test2.method2();로 호출 불가
	}
	//@Override
	public static void method3() {
		System.out.println("InterfaceTest1의 Method3()");
	}
	
}
