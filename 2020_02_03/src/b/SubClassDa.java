package b;

public class SubClassDa extends SuperClassDa{
	private String name= "�⺻��";
	private int age=10 ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void output() {
		System.out.println("����: "+age);
		System.out.println("������ age: " + super.getAddr() );
		System.out.println("�ּ�: "+getAddr()); 
		//super.��� ���� ���� ����? �θ� Ŭ����age�� private �̱� ������
		System.out.println("����: "+ gender);
	}
}
