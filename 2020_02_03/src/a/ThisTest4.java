package a;

public class ThisTest4 {

	 private String name;
	 private int age;
	 
	 public ThisTest4() {
		 super();
		 System.out.println("���࿡");
		 System.out.println("��� �����ڿ��� �������� ó���� ������");
		 System.out.println("������ �ִٸ�");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 System.out.println("//////////////////////");
		 //super();  //���⾲�� ����, super(), ����Ŭ������ �����ڸ� ȣ���ϴ°�
		 			//this() �ڱ�� ������ ��ġ�� �ִ� ������ ȣ��  -> �ݵ�� �� �� ù��° ��
	 }
	 
	 
	public ThisTest4(String name, int age) {
		super(); 
		//error this(); �� �� �����ڶ� ���� �� �� ���� 
		///this(name); //������ ȣ���� ���� �ݵ�� ù��° �ٿ��� ���;���
		// �����ڴ� �ڵ����� ȣ��Ǳ⶧���� ����� ���ų� ȣ���� �� ����
	 //ThisTest3(): <<<- ���� 
	  //ThisTest3 r= new ThisTest3; <- �ʿ��ϸ� �����ؼ� �� ������ ���� ����(����o) 
		this.name = name;
		this.age=age;
	}


	public ThisTest4(String name) {
		this();
		this.name = name;

	}

	public ThisTest4(int age) {
		this();
		this.age = age;
	}
	 
	

}
