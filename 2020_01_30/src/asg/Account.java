package asg;
/**
2. 계좌번호 적금 account number 
       은행별, 지점별, 상품별 몇번쨰?
       서초점 : 100-001
     	  100-002
     	  100-003...
     	  

    	이름?  김말자
   	 	몇 년 ? 1년
 		월 입금액 ? 10000
	  	 	원금 ===> 월 10000 x 12개월 == 120,000
	  	 	만기시 금액 === > 이율rate = 2% //원금 120,000 + 2,400 = 122,400
	  	 	가입하시겠습니까? Y
 */
import java.util.Scanner;
public class Account {
	private int num = 0;
	private String name = "";
	//이자율 고정시켜야 static
	private int deposit = 0;
	private int year = 0;
	private static double rate = 2;
	private int total = 0;
	private int intAmount =0;
	private int refund = 0;
	
	public Account() {
		
	}
	
	public void output() {
		System.out.printf("%8d %14s %8d %8d %6.2f %8d %8d %8d  ",
				num, name, deposit, year, rate, total, intAmount, refund);
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름");
		name = scanner.nextLine() ;
		
		System.out.print("예금액");
		deposit = scanner.nextInt() ;
		
		System.out.print("기간(연)");
		year = scanner.nextInt() ;
		
		/*
		 * System.out.print("총액"); total = scanner.nextInt() ;
		 * 
		 * System.out.print("이자액"); intAmount = scanner.nextInt() ;
		 * 
		 * System.out.print("총 환급액"); refund = scanner.nextInt() ;
		 */
		
		calc() ;
	}
//	계좌번호     이름     월입금액     기간    이율        총액       이자액     만기시환급액 	 
	//계산필요 : intAmount, 
	private void calc() {
		total = deposit * year ;
		double intAmount = (double)total + (double)total*rate/100;
	

		//get, set generate
		// 이율부터 나머지 계산식은 어디에 넣을지 생각해보기
		// 가입하시겠습니까? 어디에, 어떻게? ---- 가입하시겠습
		// - 고객 인스턴스 만들어지는 시점 , 번호표: 생성자에서 ++
		//계좌번호는 수락 이후 만들어지게 
	}

}
