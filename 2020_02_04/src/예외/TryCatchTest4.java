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

import java.util.Scanner;

public class TryCatchTest4 {
	
	//필드 
	private int num1;
	private int num2;
	private int add;
	private int subt;
	private int multiple;
	private int div;
	

	Scanner conInput = new Scanner(System.in);
	//입력()
	public void input() {
		System.out.println("수1: "); num1 = conInput.nextInt();
		System.out.println("수2: "); num2 = conInput.nextInt();
	}
	
	//연산(), public 필요할지 고민
	public void calc() {
		add = num1 + num2;
		subt = num1 - num2;
		multiple =num1 * num2;
		div = num1 / num2;
		
	}
	
	//결과출력
	public void resOutPut() {
		System.out.println(num1 + "+" + num2 + "= " +add);
		System.out.println(num1 + "-" + num2 + "= " +subt);
		System.out.println(num1 + "*" + num2 + "= " +multiple);
		System.out.println(num1 + "/" + num2 + "= " +div);

	}

}
