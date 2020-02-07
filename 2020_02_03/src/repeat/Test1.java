package repeat;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 
		for(int a=1; a<=10 ; a++) { //규칙적 반복문
			System.out.print(a+" "); 		
		}					//a--> for 문 바깥에서 쓸 수 없음
		// System.out.println("\n for 종료 후 a: "+ a);
		System.out.println("////////////////");
		
		int b= 1;
		while(b<=10) {	//불규칙적 반복문
			System.out.print(b++ +" ");
			// 			==System.out.println(b +" ");
						// b++;

		}					//b while문 바깥에서 쓸수 o 
		System.out.println("while 종료 후 b: " +b );
		
	}

}
