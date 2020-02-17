package use;

import thread.MyThread1;

public class MyThread1Use {
	public static void m() {
		Thread thread = new MyThread1("#2"); //MyThread1 : Thread로부터 파생된 클래스 
		thread.start();						//생성자 만들어놓고 이름을 집어넣음
		
	}
	public static void main(String[] args) {
		// 기초클래스 thread 의 레퍼런스로 서브클래스 mythread1의 레퍼런스를 참조한다
		Thread thread = new MyThread1("#1");  
		thread.start();//mythread1의 고유한 메소드 아님, 불로소득
		m();
		System.out.println(Thread.currentThread()); //-> Thread[main, 5(우선순위), main]
	}

} //각각 인스턴스에 맞춰 run 메소드 실행 == 개별적 처리
//하나의 클래스에 jframe 도 만들고 싶다면? 쓸수 X -- 상속 1뿐 안되서
// 기능을 여러 개 가지려면? 핵심적인것은 extends 로 부터 받고, 나머지는 interface로 쓰자
// 근데 필요하면 이너클래스 만들어 구역으로 작업하는게 관리가 더 편함....
// 기초 책에 대두분 설명 ? 두 개 이상의 기초 클래스를 만들 수 없으므로 그런 경우에는 thread로 파생시키지말고 runnable 로부터 implement 시켜서 run method 구현
// ===> 확장, runnable은 run method가 올때 처리할 대상으로서?!?!?!?!? 못들음
// ex. ticketing 시? 여럿이 공통적으로 공통된 데이터에 접근하여 사용 ===> runnable 의 target으로 thread대상을 만들어 써주는게 더 편함


