package �迭;

public class �����ڷ���Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; //sysin.read�� �޾��൵ ��
		System.out.println(0+':');   // 58 ��� �� char
		int [] datas = new int[ size  ] ; //5��° != 5���� ,5���� =6��°
		for(int i=0; i <size  ;i++) {
			System.out.println(i+ ":" +datas[i]);
		}
		int k =80;
			//method �ȿ��� ���������� �ʱ�ȭ �ȵ�����, �迭�� 0, null, false�� �ʱ�ȭ�� ��
		System.out.println(datas.length);
		System.out.println(datas.toString()); //toString : fullname �� �Բ�(i) @ ���ڵ带 ��� ���ø��� ��Ƽ� ǥ�� 
		System.out.println(datas.getClass().getName());
	}

}
