package a;

public class Test2 {
	static private int max; //MIN �빮���� ����
	 // static public final int MIN; final ������ �ʱ�ȭ �������
	static public final int MIN=13;
	//static public final int LAST;
	static private final int FIRST;
	private final double rate;
	
	//�����ڿ��� ó��x => static block
	
	static {
		max = 999;
		System.out.println("static ��");
		FIRST = MIN/3; //���θ޼ҵ� �������� ���� ����,
	}
	public Test2() {  //db���� ���� �������ų� �ϸ� �̷��� ����
		System.out.println("������");
		//FIRST = 1;   //final ���� ���� �����ڿ��� ���� ���� why? �����ڰ� ������ ���� ���� ststic �߻�
		//LAST = 31;
		rate=MIN*9.9;
	}

	static public void method() {
		System.out.println("static�� method");
	}
	public static void main(String[] args) { //start
		max = 70;
		System.out.println("main () method");
		//end
		//�ν� ���� - static ������� =>static ��= > static
	}
}
