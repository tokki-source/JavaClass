package abstractTest;

public abstract class B {
	public void m1() {
		System.out.println("&&&&���&&&&");
		
	}
	protected void mustCall() { //protectd -> ���� Ŭ���������� ����� �� ����
		System.out.println("mustcall()");

	} //pro ~() : ����, {} ����(��) 
	protected void mustSubOverride() { //body
		//b�� �ִ� �޼ҵ带 subB�� �״�� ���ִ°� _ overriding
		System.out.println("mustSubOverride()");
		//overriding ���ϸ� ������ �������� ������ ��������
	}//public�� ����
	protected abstract void overriding() ; 
	//������ ���ʹٸ� �̷��� �ٿ���, { } �����! 
}
