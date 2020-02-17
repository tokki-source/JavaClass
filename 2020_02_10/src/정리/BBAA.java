package 정리;

public class BBAA extends AA {
	
	// toString overriding bbaa
			@Override
			public String toString() {
				// TODO Auto-generated method stub
			return super.toString("내가 재정의한 toString(), Object의 toString()===>" + toString()); 
			}
			
	@Override
	public void m1() {
		System.out.println("BBAA m1()");
		
	}
	
}
