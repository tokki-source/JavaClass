package oop;

public class ���м�Sample2 {
	//����,�ʵ�,�Ӽ�(attribute)  
	int kor;   //������ default �� =0
	String name;  // string : ��ü�ڷ��� ��= null, 
				  //����ϰ��ִµ� �ּҰ����� , �׸� �ȿ� null
	 //method : Ŭ���� �ȿ� �����ִ� �����, ��� ���� ó���ϰų� ����, ó���ϱ� ���� ������ �������� ���� ��( �ɷ��� ������ �ִ°� )
	void method( ) {  
		System.out.println(kor*10 + " " +name);
	}
	//inner class
	class ����� {
		String type ; 
		void method( ) { //���� �޼ҵ�� ��ġ�� ���� 
			 	//int void class .. ���� ����x = all default
		}
	}
	
}
