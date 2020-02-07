package arg;

import java.util.Scanner;

public class printfTest {

	public static void main(String[] args) {
		//실습1
		int a=3;
		int b=10;
		System.out.printf("%d\n",a*b);
		
		//실습2
		char k=75;
		System.out.println(k);
		
		
		
		//실습3
		Scanner scanner = new Scanner(System.in);
		int cash = Integer.parseInt("10000"); //레퍼런스타입 형변환
		if(cash<9999) {
			System.out.println("환영합니다.");
	
			}
		else {
			System.out.println("잔액이 부족해 교통카드를 사용할 수 없습니다");

		}
		
		
		scanner.close();
	}

}
