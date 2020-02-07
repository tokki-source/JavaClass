package use;

import staticTest.Test2;

public class Test2Use {
	public static void main(String[] args) {
		
		Test2.staticVariable =89;
		//Test2.nonStaticVariable =89; 
		Test2 t2Ref = new Test2();
		t2Ref.nonStaticVariable =89 ;
		t2Ref.output();
		
		Test2	t2Ref2= new Test2();
		t2Ref2.nonStaticVariable =100;
		t2Ref.output();
		
		Test2	test2 = new Test2();
		test2.nonStaticVariable =200;
		test2.output();
		///////////////////////////////
		test2.staticVariable =777;
		t2Ref.output();
		t2Ref2.output();
		test2.output();
		
		//static한 멤버 변수는 하나씩 가짐. 
		//메모리 구조의 static영역 
		//nonstatic 멤버변수는 
		//staticgks 멤버변수는 메모리 잡힐때마다 하나 만들어지면 그것을 공유해서 씀. 
	}
}
