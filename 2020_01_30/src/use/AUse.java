package use;
import method.A; //*, ? = wild card, // ctrl+shif+o : 코드 정리 
//method.* : method라는 새 페이지 밑에 있는 모든 것을 사용할 것이라는 뜻, 속도 느림 
// import : path와 비슷한 것 
// A라는 클래스를 사용하겠다. 이것이 어디에 존재한다(위치 알려줌)
// include = = copy + paste 
public class AUse {

	public static void main(String[] args) {
		A aRef= new A();	//toggle : ex.키보드의 capslock 
		aRef.intValueReturn(); //0 : 휘발성 
		int returnValue = aRef.intValueReturn(); //aRef.~에 0 이 오고
		//int 타입 정수변수 = 정수 int 값  0을 받았다--> 형변환 x == > =연산자 중심으로 일치하는지 확인
		//일치하지 않으면 왼쪽 기준으로 넘어감 ==> returnValue출력 
		System.out.println(returnValue);	
		
		System.out.println("==>"+ aRef.stringValueReturn(-111 )); //aRef 먼저 => "==>" => why? +연산자 오른쪽부터
				/* System.out.pirntln( aRef.noValueReturn()); */ //noValue~ void 라 받을 수 없음
			aRef.noValueReturn();
	}

}
