package server;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class test{
public static void main(String[] args) {
	
	try {
		Socket s = new Socket("192.168.0.77", 5000);
		System.out.println("## 클라이언트 실행..");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.println("안녕하세요? 클라이언트에서 전송합니다.!!");
		pw.close();
		s.close();
		System.out.println("## 클라이언트 종료..");

	} catch (Exception e) {
		e.printStackTrace();
	}
}
}