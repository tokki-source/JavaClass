package a;

public class ThisTest {

	private String name;	
	private int age;
	//����Ʈ ������
	public ThisTest() {		//this = ref1
		System.out.println("�ν��Ͻ� ������ġ"+this.hashCode());
	}
	//�Ű������� ���� ������ --- �Ű����� ���� ������ ������ �ݵ�� default ������ �������ؼ� �� ����
	public ThisTest(String name) {
		// name=name; //�ν��Ͻ� name �ƴϰ� �Ű�����(�Ķ����) name �� �־��ְ� ��
		this.name=name;
		
	}
	public ThisTest(String n, int a) {
		name = n; //����x  ->�� ��� ��� ��򰡿�(��) name 
		age = a;
		System.out.println("�ν��Ͻ� ������ġ"+this.hashCode());

	}
	public void output() {
		System.out.println("output()�� ȣ���� �ν��Ͻ� ��ġ :" +this.hashCode() + 
				" �ν��Ͻ��� age: "+age +" �̸�: "+name);
		
	}

}
