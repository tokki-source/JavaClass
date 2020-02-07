package 배열;

public class 원시자료형Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; //sysin.read로 받아줘도 됨
		
		int [] datas = new int[ size  ] ; //5번째 != 5번방 ,5번방 =6번째
		int da;
		for(int i=0; i <size  ;i++) {
			da = datas[i];			System.out.println(i+ ":" + da);

			System.out.println(i+ ":" + datas[i] +":" +da);
		}
		//for ( 자료형   ____  :배열을 참조하고 있는 변수명  )
		for( int data :datas ) {
			System.out.println(data); //index 번호가 필요 없을 때
		}
	}

}
