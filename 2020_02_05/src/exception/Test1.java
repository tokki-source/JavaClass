package exception;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String [] args) throws IOException {
		
		InputStream stream =System.in;
		System.out.print("�Է��غ�: ");
		int data = stream.read();   
		System.out.println("�Է¹��� ����Ÿ :::"+data);  //�ƽ�Ű �ڵ�ǥ�� ���
		
	}
}
