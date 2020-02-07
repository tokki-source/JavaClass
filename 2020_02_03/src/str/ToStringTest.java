package str;

public class ToStringTest {
	
	private String name ; 
	private int age ;
	public ToStringTest() {
		
	}
	public ToStringTest(String name, int age) {
		this.age = age;
		this.name = name;
		
	} //setter, getter 만들듯이 거의 매번 만듦. 
	@Override
	public String toString() {
		return "ToStringTest [name=" + name + ", age=" + age + "]";
	}
}
//output 만들 필요 x why? 필요하면 불러 쓰면 됨
// 
