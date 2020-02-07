package staticTest;

public class Test2 { //멤버변수 기본 : private,지금은 편하게public으로 씀
	public static int staticVariable;	 
	public 		  int nonStaticVariable; 
	public void output() {
		System.out.println(staticVariable +" "+ nonStaticVariable);

	}

}
