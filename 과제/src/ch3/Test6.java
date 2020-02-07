package ch3;

import java.util.Scanner;

/**
  판매 가격을 바코드로 읽어 총액을 계산하는 프로그램 작성
  가격 : 바코드 리딩을 대체해 가격대신 q를 입력하면 입력 총합을 출력하고 종료
  변수 : 상품
  상품1 -> 계속 or 총합 
  계속 - 상품 1 
  총합 - 종료 while 문
  q입력
 */
public class Test6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		String end;
		
		while(true) {
			System.out.println("상품가격을 입력하세요");
			end = scanner.nextLine();
			
			switch(end){
				case "q":{
					System.out.println("합계: "+sum);
					return;
				}
				default :
					sum+=Integer.parseInt(end);
					break;
					
			}
		}	
	}

}
/*
public static void main(String [] args){}   이렇게 생긴넘이 메인메소드 입니다.
이 메소드는 특별한 메소드로 정해져 있는 메소드이고 java 컴파일러나 실행하는 넘은 이런 메소드를 맨처음 찾게 정의 되어 있습니다.
여기서  String [ ] args 는  스트링타입의 배열인 args를 선언한것으로서
자바를 실행시에 넣는 인수값을 받습니다.  

고로 실행시에 java 클레스이름 a,b,c...하게 되면
args[0] = "a";    args[1] = "b";.. 이런식으로 들어가게 됩니다.

Integer.parseInt(args[0]); 
->첫번째 들어온 args[0]의 값을 숫자형태로 바꾸려고 하는 것입니다.
 
 * */