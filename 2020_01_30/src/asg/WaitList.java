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
	System.out.println(name + ":"  + count + "�� �� "+ 
						waitNum+ "��° " );
	}
	
	
	public void setName(String name) {
		this.name =name;
	}
	//setname : ��� ������ ���� ���� ���� 


}
