package a;

public class ThisSuperGeneralMethodTest extends MySuper{
	public ThisSuperGeneralMethodTest() {
		System.out.println("&&&&&&&&&&&&&");
		System.out.println("***************");
	}
	public ThisSuperGeneralMethodTest(String str, int n) {
		for(int i =1 ; i <=n ; i++) {
			System.out.println(str);
		}
	}
	public ThisSuperGeneralMethodTest(String str, int n) {
		/*
		 * for(int i =1 ; i <=str.length() ; i++) { System.out.println(str);
		 * 
		 * }
		 */
	this();
		//this("KimMalja", "KimMalja"length());' ---> 일반메소드 호출
	}
}
