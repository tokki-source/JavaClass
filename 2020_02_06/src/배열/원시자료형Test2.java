package �迭;

public class �����ڷ���Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; //sysin.read�� �޾��൵ ��
		
		int [] datas = new int[ size  ] ; //5��° != 5���� ,5���� =6��°
		int da;
		for(int i=0; i <size  ;i++) {
			da = datas[i];			System.out.println(i+ ":" + da);

			System.out.println(i+ ":" + datas[i] +":" +da);
		}
		//for ( �ڷ���   ____  :�迭�� �����ϰ� �ִ� ������  )
		for( int data :datas ) {
			System.out.println(data); //index ��ȣ�� �ʿ� ���� ��
		}
	}

}
