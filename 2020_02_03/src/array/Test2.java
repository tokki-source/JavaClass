package array;

public class Test2 {

	public static void main(String[] args) {
		Test3[] test3s = new Test3[3];  //�� �� ������� �����ϰ� ������
		/** test3s[0] = new Test3("aaa", "dddd"); */
		for(int i=0; i< test3s.length ; i++) {
			test3s[i] = new Test3("aaa", "dddd");
		}
		System.out.println( test3s[2]);
	}

}


class Test3{
	String name;
	String addr;
	
	//������
	public Test3(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	//toString
	@Override
	public String toString() {
		return "Test3 [name=" + name + ", addr=" + addr + "]";
	}
	
}