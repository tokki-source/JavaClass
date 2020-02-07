package oop;

public class 은닉성Sample2Use {

	public static void main(String[] args) {
	은닉성Sample2  ref1 ;
		ref1 = new 은닉성Sample2(); //은닉성Sample2를 메모리상에 동적으로(=실행할 때) 할당시킨다는 뜻
		//변수명  --- 없이 new 은닉성Sample2(); 쓰면 가능, but }에서 사라짐  
		//  ref1 = new ~의 시작 주소 가지고 있음 (리모콘 - 에어컨 관계) 
		ref1.kor=100;
		ref1.method();
		
		 String s; //String : 지역변수, main method 안에 있음. 
					 // 지역변수는 초기화하지않으면 사용할 수 없음
					 //그릇만 잡히고 준비 x 
		 
		System.out.println();
		
	
		
	}

}
 