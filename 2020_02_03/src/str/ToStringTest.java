package str;

public class ToStringTest {
	
	private String name ; 
	private int age ;
	public ToStringTest() {
		
	}
	public ToStringTest(String name, int age) {
		this.age = age;
		this.name = name;
		
	} //setter, getter ������� ���� �Ź� ����. 
	@Override
	public String toString() {
		return "ToStringTest [name=" + name + ", age=" + age + "]";
	}
}
//output ���� �ʿ� x why? �ʿ��ϸ� �ҷ� ���� ��
// 
