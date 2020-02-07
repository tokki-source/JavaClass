package use;

import method.B;

public class BUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bRef = new B();
		/*
		 * int num1 = 90; int num2 = 100; int resSum=bRef.sum(num1, num2); //bRef
		 * sum(90,100) System.out.println(num1+" "+num2+" "+resSum);
		 */
		double num1 = 9.9; //1번째 변수
		double num2 = 10;  //2번째 변수
		System.out.println( bRef.sum(num1, num2) );
			//call-by-value 방식 
		System.out.println(num1 +" " + num2);
	}

}

// 1 18번째 줄 실행 -> b클래스 17 ~ 99.0 +10 
//99.0 +1