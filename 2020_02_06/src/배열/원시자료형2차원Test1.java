package �迭;

public class �����ڷ���2����Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] datas1 = new int[3][];
		int [][] datas2 = new int[2][3];
		// ERROR // int [][] datas3 = new int[][3];

		int [][] datas4 = { } ;
		// int [][] datas5 = { 4,9,1,2 } ; //=data3 , �� ����
		int [][] datas6 = { {4,9,1,2} } ; //�� 1, �� 4
		int [][] datas7 = { {4,9,1,2},{8,7} };

		//datas1�� ���� ���̴�?
		System.out.println(datas1.length);
		//datas2�� �� ���� ������? = �� �࿡ ���� ��ΰ�?
//			System.out.println(datas2[0].length);  ----3�� 
		System.out.println(datas2.length);
		for(int rowIndex = 0; rowIndex <datas2.length ; rowIndex++) {
			System.out.println("datas2["+rowIndex+"���� ������ �ִ� ���� �� "+datas2[rowIndex].length);
		}
		//datas4�� ���� ���̴�? 
		System.out.println("datas4.length ==>"+datas4.length);
		
		//datas6�� ���� ����, �� ���� ���� ����?
		System.out.println(datas6.length);
		for(int rowIndex = 0; rowIndex <datas6.length ; rowIndex++) {
			System.out.println("datas6["+rowIndex+"���� ������ �ִ� ���� ��(����) "+datas6[rowIndex].length);
		}
		//datas6�� ������ ���?
		System.out.println(datas6.length);
		for(int r = 0; r <datas6.length ; r++) {
			for(int c = 0; c < datas6[r].length ; c++) {
				System.out.println("datas6["+ r +"]+["+c+"]"+"====>"+datas6[c].length);
			}
		}
		//data7 ������ ���
		System.out.println(datas7.length);
		for(int r = 0; r <datas7.length ; r++) {
			for(int c = 0; c < datas7[r].length ; c++) {
				System.out.println( r + ":" +c );
			}
		}
		//datas4�� �����Ѵ�. 4�� 3����
		datas4 = new int[4][3];
		System.out.println("datas4.length ==>"+ datas4.length);
		for(int r = 0; r <datas4.length ; r++) {
				System.out.println("datas4["+r+"]���� ������ �ִ� ���� ��(����) "+datas4[r].length);

			}
		
		///7, 8, 9
		///4, 5, 6
		///1, 2, 3  for������ ���

	}

}
