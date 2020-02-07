package ch3;

import java.util.Scanner;
/**
 * 4자리 숫자 입력받으면 왼쪽으로 2비트씩 이동시켜 암호화된 결과 출력
 * 1. << 비트 시프트 연산자 사용
 * 2. pw
 */
public class Test5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("비밀번호: \n");
		int pw=scanner.nextInt();
		System.out.println(pw << 2);

		
	}

}
