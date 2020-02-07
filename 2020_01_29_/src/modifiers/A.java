package modifiers;

import oop.MemberTest; //MemberTest라는 클래스 쓸건데 얘는 oop클래스에 있고 이걸 사용할거야 라는 뜻 
import oop.은닉성Sample; //에러 나면 에러 메세지 고쳐놓고, 왜 에러인지 써놓기 5번 ex. 은닉성Sampel은 클래스가 default로 되어있어서 다른 패키지에서 접근 불가
						//은닉성Sample is not visible
public class DefaultClassAccessError{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTest t;
		은닉성Sample s; 
	}

}
