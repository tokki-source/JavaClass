package thread;

public class Test {

	public static void main(String[] args) {
		// thString을 불러준 것과 같음( toSring 오버라이딩 해두었기 떄문에)
		System.out.println(Thread.currentThread().getName()  ); //현재 실행중인 스레드가 메인이라는 뜻
	}

}
