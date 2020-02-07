package abstractTest;

public abstract class B {
	public void m1() {
		System.out.println("&&&&잡곡&&&&");
		
	}
	protected void mustCall() { //protectd -> 서브 클래스에서는 사용할 수 있음
		System.out.println("mustcall()");

	} //pro ~() : 선언, {} 정의(문) 
	protected void mustSubOverride() { //body
		//b에 있는 메소드를 subB에 그대로 써주는것 _ overriding
		System.out.println("mustSubOverride()");
		//overriding 안하면 컴파일 에러나게 강제로 만들어버림
	}//public도 가능
	protected abstract void overriding() ; 
	//강제성 띄고싶다면 이렇게 붙여줌, { } 없어야! 
}
