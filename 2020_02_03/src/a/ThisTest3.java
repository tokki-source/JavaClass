package a;

public class ThisTest3 {

	 private String name;
	 private int age;
	 
	 public ThisTest3() {
		 System.out.println("���࿡");
		 System.out.println("��� �����ڿ��� �������� ó���� ������");
		 System.out.println("������ �ִٸ�");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");

	 }
	 
	 
	public ThisTest3(String name, int age) {
		this();  
		///this(name); //������ ȣ���� ���� �ݵ�� ù��° �ٿ��� ���;���
		// �����ڴ� �ڵ����� ȣ��Ǳ⶧���� ����� ���ų� ȣ���� �� ����
	 //ThisTst3(): <<<- ���� 
	  //ThisTest3 r= new ThisTest3; <- �ʿ��ϸ� �����ؼ� �� ������ ���� ����(����o) 
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
