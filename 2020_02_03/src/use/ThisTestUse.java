package use;

import a.ThisTest;

public class ThisTestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest ref1 = new ThisTest();
		ThisTest ref2 = new ThisTest("김말자", 90);
		ThisTest ref3 = new ThisTest("박말자", 10);
		ThisTest ref4 = new ThisTest("성말자");

		
		System.out.println("ref1이 참조하는 인스턴스의 주소: "+ref1.hashCode());
		System.out.println("ref2가 참조하는 인스턴스의 주소: "+ref2.hashCode());
		System.out.println("ref3가 참조하는 인스턴스의 주소: "+ref3.hashCode());

		ref1.output();
		ref2.output();
		ref3.output();
		ref4.output();
	}

}
