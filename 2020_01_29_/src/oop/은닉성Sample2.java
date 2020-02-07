package oop;

public class 은닉성Sample2 {
	//변수,필드,속성(attribute)  
	int kor;   //숫자의 default 값 =0
	String name;  // string : 객체자료형 값= null, 
				  //기억하고있는데 주소가없음 , 그릇 안에 null
	 //method : 클래스 안에 속해있는 멤버들, 멤버 변수 처리하거나 조작, 처리하기 위한 문장을 나열시켜 놓은 것( 능력을 가지고 있는것 )
	void method( ) {  
		System.out.println(kor*10 + " " +name);
	}
	//inner class
	class 기생충 {
		String type ; 
		void method( ) { //위의 메소드와 겹치지 않음 
			 	//int void class .. 접근 유형x = all default
		}
	}
	
}
