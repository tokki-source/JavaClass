package use;
import method.A; //*, ? = wild card, // ctrl+shif+o : �ڵ� ���� 
//method.* : method��� �� ������ �ؿ� �ִ� ��� ���� ����� ���̶�� ��, �ӵ� ���� 
// import : path�� ����� �� 
// A��� Ŭ������ ����ϰڴ�. �̰��� ��� �����Ѵ�(��ġ �˷���)
// include = = copy + paste 
public class AUse {

	public static void main(String[] args) {
		A aRef= new A();	//toggle : ex.Ű������ capslock 
		aRef.intValueReturn(); //0 : �ֹ߼� 
		int returnValue = aRef.intValueReturn(); //aRef.~�� 0 �� ����
		//int Ÿ�� �������� = ���� int ��  0�� �޾Ҵ�--> ����ȯ x == > =������ �߽����� ��ġ�ϴ��� Ȯ��
		//��ġ���� ������ ���� �������� �Ѿ ==> returnValue��� 
		System.out.println(returnValue);	
		
		System.out.println("==>"+ aRef.stringValueReturn(-111 )); //aRef ���� => "==>" => why? +������ �����ʺ���
				/* System.out.pirntln( aRef.noValueReturn()); */ //noValue~ void �� ���� �� ����
			aRef.noValueReturn();
	}

}
