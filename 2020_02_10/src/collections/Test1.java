package collections;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		//List : 배열의 확장체
		String a = "Kim malja";  //a, b, c 레퍼런스지만 일반변수
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
			 * List<E> ; list를 구성하는 elements(ex.String), 안써주면 object로 잡힘
			 * ex. 여성복 - 20대, 30대, 직장인용, 임부복... 어떻게 구성할지, 아님 백화점식으로 여러가지 넣을수도
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
		
			//만약 배열에서 성말자(1)를 지우고 싶을 때
			//=1번방을 제거해 배열의 길이를 맞출 때
			strs[1]="";
				//순서를 당기면서 지우고 싶다면?(리스트처럼)
			String[] removeAfters = new String[strs.length];
			removeAfters[0]= strs[0];
			removeAfters[1]= strs[2];
			strs = null;
			strs = removeAfters.clone();
			System.out.println("removeAfters.clone()"+ strs.length);
			
			
		
	}
}
