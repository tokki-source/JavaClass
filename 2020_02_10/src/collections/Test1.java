package collections;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		//List : �迭�� Ȯ��ü
		String a = "Kim malja";  //a, b, c ���۷������� �Ϲݺ���
		String b = "Sung malja";
		String c = "Ja malja";
		
		String[] strs = {"Kim malja","Sung malja","Ja malja"};
		String[] ss	= {a,b,c};
		String[] xx = new String[3];
		xx[0] ="Kim malja";
		xx[1] ="Sung malja";
		xx[2] ="Ja malja";
		xx[0] =a;
		xx[1] =b;
		xx[2] =c;
			/**
			 * List<E> ; list�� �����ϴ� elements(ex.String), �Ƚ��ָ� object�� ����
			 * ex. ������ - 20��, 30��, �����ο�, �Ӻκ�... ��� ��������, �ƴ� ��ȭ�������� �������� ��������
			 */
		List<String> strings = new ArrayList<String>();
			strings.add("Kim malja");
			strings.add("Ja malja");
			strings.add("Sung malja");
			strings.add("Lee malja");
			strings.add("go malja");
			strings.add("cho malja");
			
			System.out.println(strings.size());

			for( String str :strings ) {
				System.out.println(str);
			}
			for( int i = 0 ; i<strings.size() ; i++ ) {
				System.out.println(strings.get(i));
			}
			
			
			strings.remove(2);
			System.out.println(strings.size());

			for( String str :strings ) {
				System.out.println(str);
			}
		
			//���� �迭���� ������(1)�� ����� ���� ��
			//=1������ ������ �迭�� ���̸� ���� ��
			strs[1]="";
				//������ ���鼭 ����� �ʹٸ�?(����Ʈó��)
			String[] removeAfters = new String[strs.length];
			removeAfters[0]= strs[0];
			removeAfters[1]= strs[2];
			strs = null;
			strs = removeAfters.clone();
			System.out.println("removeAfters.clone()"+ strs.length);
			
			
		
	}
}
