package 배열;

public class 원시자료형Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; //sysin.read로 받아줘도 됨
		
		int [] datas = new int[ size  ] ; //5번째 != 5번방 ,5번방 =6번째
		
		datas[2] =9;
		
		int[] kors = {}; //참조하는 곳 갔더니 배열 길이 0
		System.out.println(kors.length);
		int[]maths; 	//참조할거야 까지만
		//System.out.println(maths.length);
		int engs [] = null; //참조할 주소 없음 
		System.out.println(engs.length);
		//실행시점 != 컴파일 시점
	}

}
