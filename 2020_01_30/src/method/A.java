package method;

public class A /* extendsObject */ { //extendsObject ������ ����
	public void noValueReturn() {	
		System.out.println("noReturnValue()");	
	}
	public int intValueReturn() {
		int i=9;
		if(i>10) return 1;
		/* else */ return 0;	
		// return (i>10)?1:0 ;
	}
	public String stringValueReturn(int num) {//num ==>> �Ű����� 
		return( num >=0 )?"���" : null ; 
		
	}
}
