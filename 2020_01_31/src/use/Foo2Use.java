package use;

import constructor.Foo;
import constructor.Foo2;

public class Foo2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Foo2 foo2 = new 
		Foo foo = new Foo();
		Foo2 foo2 = new Foo2(11,"dfsdfsdfs");
	}
 //������ �߿� �Ű������� ���� �����ڰ� �ϳ��� ������ default �����ڴ� ��������� �ʴ´�.
	//==> �Ű����� ���� �����ڽ���Ѵٸ� �ݵ�� default�����ڵ� ����������
	//����Ŭ�������� �����ڵ��� ������ ����Ŭ������ ����Ʈ �����ڸ� ȣ��
	//����Ŭ�������� ����Ŭ������ ����Ʈ �����ڰ� ȣ����� �ʰ��Ϸ��� 
	//����Ŭ������ �Ű������� ���� �����ڸ� ȣ���ϸ� �� by using super() ;
}
