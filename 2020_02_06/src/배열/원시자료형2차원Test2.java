package �迭;

public class �����ڷ���2����Test2 {

	public static void main(String[] args) {
		int s = 7;
		int[] datas[] = new int[3][2];
		int datasLength = datas.length; // ���
		for (int r = 0; r < datasLength; r++) {

			for (int c = 0; c < datas[r].length; c++) {
				datas[r][c] = s + c;
			}
			//////// �� ���� ������
			s -= datas[r].length; //�ึ�� ���� ���̰� ����
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
