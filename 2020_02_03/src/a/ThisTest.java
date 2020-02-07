package a;

public class ThisTest {

	private String name;	
	private int age;
	//디폴트 생성자
	public ThisTest() {		//this = ref1
		System.out.println("인스턴스 생성위치"+this.hashCode());
	}
	//매개변수를 갖는 생성자 --- 매개변수 갖는 생성자 있으면 반드시 default 생성자 만들어야해서 위 만듦
	public ThisTest(String name) {
		// name=name; //인스턴스 name 아니고 매개변수(파라미터) name 에 넣어주게 됨
		this.name=name;
		
	}
	public ThisTest(String n, int a) {
		name = n; //윗줄x  ->블럭 벗어나 멤버 어딘가에(위) name 
		age = a;
		System.out.println("인스턴스 생성위치"+this.hashCode());

	}
	public void output() {
		System.out.println("output()을 호출한 인스턴스 위치 :" +this.hashCode() + 
				" 인스턴스의 age: "+age +" 이름: "+name);
		
	}

}
