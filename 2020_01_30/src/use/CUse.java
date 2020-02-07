package use;

import method.C;

public class CUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("KimMalJa");
		C  cRef = new C() ;
		System.out.println("main()==>"+sb);
		cRef.method1(sb);  //실인자(argument) , 지역변수 
		System.out.println("main()==>"+sb);
	}

}
