package use;

import str.Test1;

public class StrTest1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		System.out.println(t1);
		System.out.println(t2.toString()); //13 == 14 ; 
		System.out.println(t2); //println 만 toString 내재
		
		// == String ref = t1 ; 에러 => t1.toString 으로
		//object 적인 것을 스트링으로 변환시켜주고 싶으면 toString사용
		//println은 굳이 toString쓰지않아도 자동으로 호출
	}

}
