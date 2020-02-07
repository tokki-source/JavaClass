package exception;

public class ThrowTest1 {
	private int a;
	private int b;
	private int c;
	
	public ThrowTest1(int a , int b) {
		this.a=a;
		this.b=b;
	}
	
	public int calc(int a, int b ) throws ArithmeticException, MyException {
		if(a == 0) {
			throw new MyException("0�� �ƴ� ���� �Է��ϼ���"); // :unchecked e �� ���� �ȳ�
		}

		return this.a/this.b;
	} //calc end
	public void init()  { //throws XXX
		try {
			c = calc(a,b);  //���� ��ɾ�� �����ϰ� 
		} catch (ArithmeticException e) {
			System.out.println("���� �߻� ���ΰ� ��� �� ��Ȳ�� ��� �� �ִ���  ");
			e.printStackTrace();
			
		}catch(MyException e) {
			System.out.println("dfsfsdfe");
		}
		catch (Exception e) { //����Ŭ������ �ؿ�, �� ������ �ɷ����� �ʴ� �͵��� ������ exception �̳� ���ξ���?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void output() { //output���� calcȣ���� ���� ��� �ƴ� 
		System.out.println(a+"/" +b + "=" +c);
	}
}
