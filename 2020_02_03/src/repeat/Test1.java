package repeat;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 
		for(int a=1; a<=10 ; a++) { //��Ģ�� �ݺ���
			System.out.print(a+" "); 		
		}					//a--> for �� �ٱ����� �� �� ����
		// System.out.println("\n for ���� �� a: "+ a);
		System.out.println("////////////////");
		
		int b= 1;
		while(b<=10) {	//�ұ�Ģ�� �ݺ���
			System.out.print(b++ +" ");
			// 			==System.out.println(b +" ");
						// b++;

		}					//b while�� �ٱ����� ���� o 
		System.out.println("while ���� �� b: " +b );
		
	}

}
