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
			throw new MyException("0�� �ƴ� ���� �Է��ϼ���"); // :unchecked e �� ���� �ȳ�
		}

		return a/b;	
	} //calc end
	public void init()  { //throws XXX
		try {
			c = calc(a,b);  //���� ��ɾ�� �����ϰ� 
		} catch (ArithmeticException e) {
 			System.out.println("���� �߻� ���ΰ� ��� �� ��Ȳ�� ��� �� �ִ���"
 							+ " �����ϴ� ����  & ó�� ���� ��� ");
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
