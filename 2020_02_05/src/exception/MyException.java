package exception;

public class MyException extends Exception{ 
  public MyException() {
	  super("수를 0으로 입력해서 발생한 예외사항"); 
  }

public MyException(String msg) {
	super(msg);
	// TODO Auto-generated constructor stub
}
}
