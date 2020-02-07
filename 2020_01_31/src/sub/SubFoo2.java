package sub;

import constructor.Foo2;

public class SubFoo2 extends Foo2 {
	public SubFoo2(int age, String addr) {
		//기초 클래스에 default 생성자 호출하는것 
	
	}
	public SubFoo2() {

	}
	public SubFoo2(int age) {

	}
	public SubFoo2(String addr) {
		super(addr);
	}
}
