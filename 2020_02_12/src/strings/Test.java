package strings;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {		
		/*
		 * System.out.println(s1.contains("������"));
		 * System.out.println(s1.startsWith("����"));
		 */
		List<String> list = new ArrayList<String>();
		list.add("����� ������ ���ﵿ 456-77");
		list.add("�λ�� ���� ���ﵿ 456-78");
		list.add("���ֽ� ���� ���ﵿ 456-79");
		list.add("������ �ϱ� ���ﵿ 456-7");
		list.add("����� ���ʱ� ���ʵ� 456-77");
		
		/*
		 * for(int i=0; i<list.size();i++) { if(list.get(i).contains("���ﵿ")) {
		 * System.out.println(i+1 +"���� "+list.get(i)); //list.get(i)ó�� ���� �� ������ �Ǹ� ������
		 * ��� ���۷����� ���°� ���� }
		 */
			
		for(int i=0; i<list.size();i++) {
			//if(list.get(i).contains("������")) {
			//if(list.get(i).startsWith("����")) {
			if(list.get(i).endsWith("���ﵿ")) {
				System.out.println(i+1 +"���� "+list.get(i)); 					
				}	
		}
		System.out.println("////////////////");
		String str2= "Kim,park,lee";
		String[] splitStr = str2.split(",");
		for(String s : splitStr) {
			System.out.println(s);
		}
		System.out.println("/////////////////");
		String str3 = "            Kim ";
		String str4="Kim";
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.trim().equals(str4));

	}

}
