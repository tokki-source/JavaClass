package method;

public class A /* extendsObject */ { //extendsObject 숨겨져 있음
	public void noValueReturn() {	
		System.out.println("noReturnValue()");	
	}
	public int intValueReturn() {
		int i=9;
		if(i>10) return 1;
		/* else */ return 0;	
		// return (i>10)?1:0 ;
	}
	public String stringValueReturn(int num) {//num ==>> 매개변수 
		return( num >=0 )?"양수" : null ; 
		
	}
}
