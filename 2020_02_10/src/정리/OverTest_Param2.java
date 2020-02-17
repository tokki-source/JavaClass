package 정리;
import java.util.ArrayList;
import java.util.Date;

public class OverTest_Param2 {
	static public void callAA(AA ref) { //upcasting 
		System.out.println("callAA(AA ref)");
		ref.m1();
	}

	public static void main(String[] args) {

		callAA(new SubAA()); 
		System.out.println("//////////////////");
		callAA(new BBAA());

		System.out.println("/////////////////");
		System.out.println(new Date()); // 기초클래스 중 object가 받아줌
		System.out.println(new BBAA()); //upcasting
		//원시자료형이 와도 10 -> 형변환 자동으로되서 10을 integer타입이 받아줌
		System.out.printf("%d", 10); 
	
		AA aaa = new SubAA(); //upcasting 
		// SubAA rrr = aaa; //subAA의 영역이 없기때문에 에러
		AA aa22 = new BBAA();

		//에러나지 않는 이유??? 자료형이 맞기 떄문에(casting)
		//bbaa타입과 얘는 형제==> 서로 바뀔 수 없음
		//aa22가 참조하는 실체가 누구인지를 파악해야
		SubAA rrr = (SubAA)aaa;
			  rrr = (SubAA)aa22;
	
			  int qq= 10;
			  Integer ii = new Integer(qq); //---> 정석
			  ii = qq;
			  qq = new Integer(99);
	}

}