package 예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest6 {
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
	public void input2() {
		num1 = input("수1");
		num2 = input("수2");
		calc();

	}
	int temp =0;

	public int input(String str) {
		
		try {
			System.out.print(str); 
			return temp = conInput.nextInt();
		}catch (InputMismatchException e) {
			msg = "수는 정수로 입력, 소수점 이하는 입력하지 마세요.";
		}catch(Exception e){
			msg = "알 수 없는 예외 발생, 소수점 이하는 입력 하지 마세요.";
		} //지금은 굳이 finally 필요없
		
		//int 형변환되고 남은 .0이 저장되어 있기 때문에 오류 
		//conInput.reset();
		conInput.nextLine();
	
		System.out.println(msg);
		
		return input(str);
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
