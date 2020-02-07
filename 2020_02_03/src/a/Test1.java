package a;
//main method에서 자기 자신의 인스턴스를 사용해 만드는 이유 설명할 수 있어야함
public class Test1 {
	//age=10; instance에 공통으로 적용시켜 주고 싶다-> int age를 static으로
	private int age;
	
	public static void main(String[] args) {
		//age =10;
		Test1 test1 = new Test1();
		test1.age =10;
		
	}

}
