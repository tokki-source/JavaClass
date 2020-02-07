package exception;

public class ThrowsTest2 {
	private int a;
	private int b;
	private int c;
	
	public ThrowsTest2(int a , int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calc(int a, int b ) throws Exception {
		if(a == 0) {
			throw new MyException("0이 아닌 수를 입력하세요"); // :unchecked e 라서 에러 안남
		}

		return a/b;	
	} //calc end
	public void init()  { //throws XXX
		try {
			c = calc(a,b);  //실행 명령어는 간단하게 
		} catch (ArithmeticException e) {
 			System.out.println("예외 발생 원인과 어떻게 현 상황을 벗어날 수 있는지"
 							+ " 유도하는 문장  & 처리 문장 기술 ");
			e.printStackTrace();
			
		}catch(MyException e) {
			System.out.println("dfsfsdfe");
		}
		catch (Exception e) { //기초클래스는 밑에, 두 가지로 걸러지지 않는 것들을 마지막 exception 이나 쓰로어블로?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void output() { //output에서 calc호출은 좋은 방법 아님 
		System.out.println(a+"/" +b + "=" +c);
	}
}
