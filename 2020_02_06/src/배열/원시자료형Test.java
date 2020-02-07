package 배열;

public class 원시자료형Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; //sysin.read로 받아줘도 됨
		System.out.println(0+':');   // 58 출력 ∵ char
		int [] datas = new int[ size  ] ; //5번째 != 5번방 ,5번방 =6번째
		for(int i=0; i <size  ;i++) {
			System.out.println(i+ ":" +datas[i]);
		}
		int k =80;
			//method 안에서 지역변수는 초기화 안되지만, 배열은 0, null, false로 초기화가 됨
		System.out.println(datas.length);
		System.out.println(datas.toString()); //toString : fullname 과 함께(i) @ 헥스코드를 헥사 데시말로 잡아서 표현 
		System.out.println(datas.getClass().getName());
	}

}
