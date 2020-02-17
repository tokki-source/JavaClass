package 정리;

public class AA2 {

	// 메소드명 모두 중복-> 오버로딩
	/*
	 * void m1() { //#1 System.out.println("Super의 m1"); }
	 */
	//integer 많을 때 하는 일이 비슷하다면?
	//따로 구분할 필요 없이 메서드(자료형 ...변수명) 형태로 
	// => varargs : (variable args, 가변인자, 가변 매개변수)
	// 오버로딩을 줄이기 위해서 씀
	public void m1(int ...a) { 
		System.out.println("int...a");
		for (int d : a) {
			System.out.println(d);
		}
	}

	/*
	 * void m1(int a) { //#2 System.out.println(a); } void m1(int a, int b) { //#3
	 * System.out.println(a+b);
	 * 
	 * } void m1(int a, int b, int c) { //#4 System.out.println(a+b+c);
	 */

	public void m1(String a) { // #5

	}

}
