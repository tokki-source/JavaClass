package use;

import constructor.Foo;
import constructor.Foo2;

public class Foo2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Foo2 foo2 = new 
		Foo foo = new Foo();
		Foo2 foo2 = new Foo2(11,"dfsdfsdfs");
	}
 //생성자 중에 매개변수를 갖는 생성자가 하나라도 있으면 default 생성자는 만들어지지 않는다.
	//==> 매개변수 갖는 생성자써야한다면 반드시 default생성자도 만들어줘야함
	//서브클래스에서 생성자들은 무조건 기초클래스의 디폴트 생성자를 호출
	//서브클래스에서 기초클래스의 디폴트 생성자가 호출되지 않게하려면 
	//기초클래스의 매개변수를 갖는 생성자를 호출하면 됨 by using super() ;
}
