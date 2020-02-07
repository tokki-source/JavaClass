package a;

public class ThisTest3 {

	 private String name;
	 private int age;
	 
	 public ThisTest3() {
		 System.out.println("만약에");
		 System.out.println("모든 생성자에서 공통으로 처리할 문장을");
		 System.out.println("가지고 있다면");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");

	 }
	 
	 
	public ThisTest3(String name, int age) {
		this();  
		///this(name); //생성자 호출할 때는 반드시 첫번째 줄에만 나와야함
		// 생성자는 자동으로 호출되기때문에 맘대로 쓰거나 호출할 수 없음
	 //ThisTst3(): <<<- 에러 
	  //ThisTest3 r= new ThisTest3; <- 필요하면 생성해서 또 가져올 수는 있음(문법o) 
		this.name = name;
		this.age=age;
	}


	public ThisTest3(String name) {
		this();
		this.name = name;
		this.name=name;

	}

	public ThisTest3(int age) {
		this();
		this.age = age;
	}
	 
	

}
