package 예외;
/**
 수1: 5.5 
 수2: 5
 5.5+5 = 10.5
 5.5-5 = 0.5
 5.5*5 = 
 5.5/5 = 
 -> 문장실행안하고 곧바로 
  수는 정수로 입력, 소수점 이하는 입력하지 마세요
 ->수1로
  수1: 5입력
 ->수2
 수2 : 0
 ==> 나눗셈에서 멈춤
  0을 입력하지 마세요
  => 수2로
 수2 : 1~
 사칙연산

//////////////
 class
 	num1
 	num2
 	
 	plus
 	minus
 	multiple
 	div
 		
 		입력 메소드
 		연산 메소드
 		결과 출력 메소드
 * @author bitcamp
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest5 {
	//필드 
	private int num1;
	private int num2;
	private int add;
	private int subt;
	private int multiple;
	private int div;
	

	private Scanner conInput = new Scanner(System.in);
	private String msg;
	//입력()
	public void input() {
		try {
			System.out.print("수1: "); 
			num1 = conInput.nextInt(); 
			/*
			 * conInput.nextInt(); conInput.nextInt(); conInput.reset();
			 */
			
			System.out.print("수2: "); 
			num2 = conInput.nextInt();

			calc();
			return;
		}catch (InputMismatchException e) {
			msg = "수는 정수로 입력, 소수점 이하는 입력하지 마세요.";
		}catch(Exception e){
			msg = "알 수 없는 예외 발생, 소수점 이하는 입력 하지 마세요.";
		} //지금은 굳이 finally 필요없
		
		//int 형변환되고 남은 .0이 저장되어 있기 때문에 오류 
		//conInput.reset();
		System.out.println(msg);
		input();
	}
	
	//연산(), public 필요할지 고민
	public void calc() {
		add = num1 + num2;
		subt = num1 - num2;
		multiple =num1 * num2;
		div = num1 / num2;
		
		//0을 못받게 하지 말고 divide zero 가 뜬다면 num2를 새로 입력받아서 오류처리
	}
	
	//결과출력
	public void resOutPut() {
		System.out.println(num1 + "+" + num2 + "= " +add);
		System.out.println(num1 + "-" + num2 + "= " +subt);
		System.out.println(num1 + "*" + num2 + "= " +multiple);
		System.out.println(num1 + "/" + num2 + "= " +div);

	}

}
