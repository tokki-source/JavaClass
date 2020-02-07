package exception;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String [] args) throws IOException {
		
		InputStream stream =System.in;
		System.out.print("입력해봐: ");
		int data = stream.read();   
		System.out.println("입력받은 데이타 :::"+data);  //아스키 코드표로 출력
		
	}
}
