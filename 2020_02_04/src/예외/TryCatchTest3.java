package 예외;

import java.io.InputStream;

import java.util.InputMismatchException;

import java.util.Scanner;

public class TryCatchTest3 {

	public int method() { 
		// TODO Auto-generated method stub
		Scanner conInput = new Scanner(System.in);
		//in 이태릭체 이유? 1.0 버전, static & final하니까 사실은 In 되어야5.
		int num1 = 0;
		int num2 = 0;
		int res = 0;
		
		try {
	
		System.out.println("수1: "); num1 = conInput.nextInt();
		System.out.println("수2: "); num2 = conInput.nextInt();

		res = num1 / num2;
		
		System.out.println(num1 + "/" + num2 + "= " +res);
		return res; //return 해도 finally 실행 
		
		}catch(ArithmeticException e) { //첫번째 예외 , exception handling이라고 함 
			System.out.println(e.getMessage());
			System.out.println("0이 아닌 수치 입력");
			return -1;
		}catch(InputMismatchException e) { //두번쨰 예외
			System.out.println(e.getMessage());
			System.out.println("정수값 입력");
			return -2;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("예측할 수 없는 예외사항");
			return -3;
		}finally {
			System.out.println("약방의 감초");
		}
		
		 // System.out.println("end"); 
		 // return  0;
	}
	public static void main(String[] args) {
		//method();
		TryCatchTest3 test3 = new TryCatchTest3();
		System.out.println("return value:" + test3.method());
	
	}

}
