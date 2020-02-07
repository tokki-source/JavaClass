package a;
//기초클래스
public class MySuper {
	public MySuper() {
		
		this(1,10);
		/*
		 * for(int i=1;i<=10;i++) { System.out.println("/////") ;
		 * System.out.println("^ ^;") ;
		 * 
		 * }
		 */
	}
	public MySuper(int end) {
		this(1,end);
		/*
		 * for(int i=1;i<=end;i++) { System.out.println("/////") ;
		 * System.out.println("^ ^;") ; }
		 */
	}
	public MySuper(int start, int end) {
		for(int i=start;i<=end;i++) {
			System.out.println("/////") ;
			System.out.println("^ ^;") ;
		}
	}
}
