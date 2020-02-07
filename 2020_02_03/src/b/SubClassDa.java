package b;

public class SubClassDa extends SuperClassDa{
	private String name= "기본값";
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
		System.out.println("나이: "+age);
		System.out.println("기초의 age: " + super.getAddr() );
		System.out.println("주소: "+getAddr()); 
		//super.라고 쓰지 않은 이유? 부모 클래스age가 private 이기 때문에
		System.out.println("성별: "+ gender);
	}
}
