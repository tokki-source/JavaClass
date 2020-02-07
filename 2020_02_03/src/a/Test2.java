package a;

public class Test2 {
	static private int max; //MIN 대문자인 이유
	 // static public final int MIN; final 쓸때는 초기화 시켜줘야
	static public final int MIN=13;
	//static public final int LAST;
	static private final int FIRST;
	private final double rate;
	
	//생성자에서 처리x => static block
	
	static {
		max = 999;
		System.out.println("static 블럭");
		FIRST = MIN/3; //메인메소드 실행전에 먼저 실행,
	}
	public Test2() {  //db에서 값을 가져오거나 하면 이렇게 생성
		System.out.println("생성자");
		//FIRST = 1;   //final 적인 것은 생성자에서 쓰지 말라 why? 생성자가 나오기 전에 먼저 ststic 발생
		//LAST = 31;
		rate=MIN*9.9;
	}

	static public void method() {
		System.out.println("static한 method");
	}
	public static void main(String[] args) { //start
		max = 70;
		System.out.println("main () method");
		//end
		//인식 순서 - static 멤버변수 =>static 블럭= > static
	}
}
