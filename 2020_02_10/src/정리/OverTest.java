package 정리;

import java.util.ArrayList;
import java.util.List;

public class OverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA ref = new AA(); //정적 결합, static binding 
		SubAA  ref2 = new SubAA();  //정적 바인딩에 대한 예제들?
		ref.m1();// AA
		ref2.m1();//SubAA
		
		AA refX= new SubAA();
		refX.m1();
		refX= new SubAASub();
		refX.m1();
		refX= new AA();
		refX.m1();
	
		/**
		 * abstract, interface 가 가지고 있는 메소드를 오버라이딩 하기 위해 씀
		 * ==> 
		 */	
		List  refff= new ArrayList();
		refff.add("dfsdfs");
		//refff= new List();
		
		
	}
	
}
