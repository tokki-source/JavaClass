package staticTest;

public class Test3 {
	static private double rate =3.7; //클래스 변수
	private String name;// 인스턴스 변수
	
	public void method() {
		System.out.println(rate +" " +name);
		
	}
	static public void method2() {
		System.out.println(rate +" " +name);  
	
	}
}
