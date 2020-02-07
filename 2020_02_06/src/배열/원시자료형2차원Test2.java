package 배열;

public class 원시자료형2차원Test2 {

	public static void main(String[] args) {
		int s = 7;
		int[] datas[] = new int[3][2];
		int datasLength = datas.length; // 행수
		for (int r = 0; r < datasLength; r++) {

			for (int c = 0; c < datas[r].length; c++) {
				datas[r][c] = s + c;
			}
			//////// 한 행이 끝났다
			s -= datas[r].length; //행마다 열의 길이가 같다
		}
		/////////////////////////////////////
		for (int r = 0; r < datasLength; r++) {

			for (int c = 0; c < datas[r].length; c++) {
				System.out.print(datas[r][c] + " ");

			}
			System.out.println("");
		}
		System.out.println("\n"+datas[2][1]);
	}

}
