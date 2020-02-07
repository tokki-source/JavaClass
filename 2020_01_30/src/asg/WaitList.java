package asg;

public class WaitList {
	private  static int count =0;
	private  int waitNum = 0;
	private String name = "";
	
	public WaitList() {
		++count;
		waitNum = count;
		
	}
	
	public void output() {	
	System.out.println(name + ":"  + count + "명 중 "+ 
						waitNum+ "번째 " );
	}
	
	
	public void setName(String name) {
		this.name =name;
	}
	//setname : 멤버 변수에 대한 값을 조작 


}
