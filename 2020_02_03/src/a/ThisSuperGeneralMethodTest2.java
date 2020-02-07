package a;
//중복코드 제거(정리) 위한 메소드 만들기, 
//처리하는 문장이 별 차이 없으니 한군데로 몰아주고 재사용 위해 호출해서 사용
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
