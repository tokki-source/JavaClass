package a;
//�ߺ��ڵ� ����(����) ���� �޼ҵ� �����, 
//ó���ϴ� ������ �� ���� ������ �ѱ����� �����ְ� ���� ���� ȣ���ؼ� ���
public class ThisSuperGeneralMethodTest2 extends MySuper{
	public ThisSuperGeneralMethodTest2() {
		out();
	}
	public ThisSuperGeneralMethodTest2(String str, int n) {
		forOut(str, n);
	}
	public ThisSuperGeneralMethodTest2(String str) {
		super();
		out();
		forOut("KimMalja", "KimMalja".length());
	}
	private void out() {
		System.out.println("&&&&&&&&&&&&&");
		System.out.println("***************");
	}
	private void forOut(String str, int n) {
		for(int i =1 ; i <=n ; i++) {
			System.out.println(str);
		}
	}
}
