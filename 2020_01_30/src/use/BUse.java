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
		double num1 = 9.9; //1��° ����
		double num2 = 10;  //2��° ����
		System.out.println( bRef.sum(num1, num2) );
			//call-by-value ��� 
		System.out.println(num1 +" " + num2);
	}

}

// 1 18��° �� ���� -> bŬ���� 17 ~ 99.0 +10 
//99.0 +1