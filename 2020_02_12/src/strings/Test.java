package strings;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {		
		/*
		 * System.out.println(s1.contains("강남구"));
		 * System.out.println(s1.startsWith("서울"));
		 */
		List<String> list = new ArrayList<String>();
		list.add("서울시 강남구 역삼동 456-77");
		list.add("부산시 서구 역삼동 456-78");
		list.add("광주시 동구 역삼동 456-79");
		list.add("대전시 북구 역삼동 456-7");
		list.add("서울시 서초구 서초동 456-77");
		
		/*
		 * for(int i=0; i<list.size();i++) { if(list.get(i).contains("역삼동")) {
		 * System.out.println(i+1 +"번쨰 "+list.get(i)); //list.get(i)처럼 여러 번 나오게 되면 변수로
		 * 잡아 레퍼런스로 쓰는게 나음 }
		 */
			
		for(int i=0; i<list.size();i++) {
			//if(list.get(i).contains("강남구")) {
			//if(list.get(i).startsWith("서울")) {
			if(list.get(i).endsWith("역삼동")) {
				System.out.println(i+1 +"번쨰 "+list.get(i)); 					
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
