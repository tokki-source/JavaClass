package server;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class test{
public static void main(String[] args) {
	
	try {
		Socket s = new Socket("192.168.0.77", 5000);
		System.out.println("## Ŭ���̾�Ʈ ����..");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.println("�ȳ��ϼ���? Ŭ���̾�Ʈ���� �����մϴ�.!!");
		pw.close();
		s.close();
		System.out.println("## Ŭ���̾�Ʈ ����..");

	} catch (Exception e) {
		e.printStackTrace();
	}
}
}