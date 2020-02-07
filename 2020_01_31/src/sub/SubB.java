package sub;

import abstractTest.B;

public class SubB extends B {
	//@Override
	public void m1(int a) {
		for(int i=0; i<a ; i++) {
		System.out.println("///////////");
		}
	}
	@Override
	public void m1() { //얘도 override인데 강제성 x
	System.out.println("%%%%%쌀밥%%%%%");
	}
	
	public void output() {
		mustCall();
	}
	@Override
	protected void overriding() {
		// TODO Auto-generated method stub
		
	}
	
	/* @overloading
	 * public void a() { System.out.println("콜라,사이다,"); } public void a(int a) {
	 * System.out.println("라면 1 라면2"); }
	 */

}
