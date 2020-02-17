package thread;
// Runnable 사용법
// Thread 의 인스턴스들이 공유하는 자원에 대해서 그 값에대한 변경을 주고 싶다
//--> class를 Runnable 로 만들고 Thread 의 타겟을 만든다. 
// == 공통된 리소스, 데이터를 처리하기 위해 씀
// withdraw 를 run 에 집어넣어도 상관 x but synchro method처리할 것을 또 만들어야하기 떄문에 따로 뺴줌
// 왜 타겟을 잡았는지? 
// synchro 잡지 않으면 누구든 들어올 수 있음. --> 먼저 들어온 사람 우선으로 처리하도록 해주는 메소드
// while 바깥에 둬도 상관없고, 인출금 입력부 앞~wait 앞까지 에 둬도 괜찮음
import java.util.Scanner;

/**
 * 얼마를 인출? 인출금을 가지고 처리 인출처리메소드 withDraw
 */
public class ATMSample implements Runnable {
	private int balance = 100000;
	private String custName = "";
	private Scanner input = new Scanner(System.in);

	/**
	 * howMuch : 출금액 
	 * 출금액을 잔액과 비교해서 가능하면 balance 에서 빼준다 
	 * 잔액이 부족하면 메세지 출력
	 */
	synchronized private void withDraw(int howMuch) {// 매개변수가 받아준 것 만큼 인출하려고 하는 메소드
		if (balance >= howMuch) {
			// 인출금을 빼고
			balance -= howMuch;
			// 잔액이 얼마 남았는지 출력
			System.out.println(custName + "님\n" + howMuch + "원을 인출하여 " + balance + "원 남았습니다");
		} else {
			// 잔액이 부족
			System.err.println("잔액은" + balance + "원, 찾을 금액:" + howMuch + "원" + "\n잔액이 부족합니다");
		}
		notifyAll();
	}

	/**
	 * 고객에게 얼마를 인출할 것인지 묻고, 금액 인출 해주고(withdraw 호출) 
	 * 스레드 고객마다 계속 반복 ---> 잔액이 0원이 될 때까지
	 */
	@Override
	public void run() {

		while (balance > 0) {
			synchronized (this) {
				try {
					custName = Thread.currentThread().getName();
					System.out.print(custName + "님의 " + "현재잔액은 " + balance + "원 입니다\n");
					System.out.println(custName + "님" + "얼마를 인출하시겠습니까?");
					int a = input.nextInt();
					withDraw(a);

					wait(); // 반드시 synchronized method나 블럭과 같이 써야 먹힘
							//--> 이것을 선언하는 것이 notify or notifyAll
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
	}

}
