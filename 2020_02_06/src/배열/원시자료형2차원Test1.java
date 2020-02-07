package 배열;

public class 원시자료형2차원Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] datas1 = new int[3][];
		int [][] datas2 = new int[2][3];
		// ERROR // int [][] datas3 = new int[][3];

		int [][] datas4 = { } ;
		// int [][] datas5 = { 4,9,1,2 } ; //=data3 , 행 없음
		int [][] datas6 = { {4,9,1,2} } ; //행 1, 열 4
		int [][] datas7 = { {4,9,1,2},{8,7} };

		//datas1의 행의 길이는?
		System.out.println(datas1.length);
		//datas2의 각 행의 사이즈? = 각 행에 열이 몇개인가?
//			System.out.println(datas2[0].length);  ----3열 
		System.out.println(datas2.length);
		for(int rowIndex = 0; rowIndex <datas2.length ; rowIndex++) {
			System.out.println("datas2["+rowIndex+"행이 가지고 있는 열의 수 "+datas2[rowIndex].length);
		}
		//datas4의 행의 길이는? 
		System.out.println("datas4.length ==>"+datas4.length);
		
		//datas6의 행의 길이, 각 행의 열의 길이?
		System.out.println(datas6.length);
		for(int rowIndex = 0; rowIndex <datas6.length ; rowIndex++) {
			System.out.println("datas6["+rowIndex+"행이 가지고 있는 열의 수(길이) "+datas6[rowIndex].length);
		}
		//datas6의 데이터 출력?
		System.out.println(datas6.length);
		for(int r = 0; r <datas6.length ; r++) {
			for(int c = 0; c < datas6[r].length ; c++) {
				System.out.println("datas6["+ r +"]+["+c+"]"+"====>"+datas6[c].length);
			}
		}
		//data7 데이터 출력
		System.out.println(datas7.length);
		for(int r = 0; r <datas7.length ; r++) {
			for(int c = 0; c < datas7[r].length ; c++) {
				System.out.println( r + ":" +c );
			}
		}
		//datas4를 설정한다. 4행 3열로
		datas4 = new int[4][3];
		System.out.println("datas4.length ==>"+ datas4.length);
		for(int r = 0; r <datas4.length ; r++) {
				System.out.println("datas4["+r+"]행이 가지고 있는 열의 수(길이) "+datas4[r].length);

			}
		
		///7, 8, 9
		///4, 5, 6
		///1, 2, 3  for문으로 출력

	}

}
