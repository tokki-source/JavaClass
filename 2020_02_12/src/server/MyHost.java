package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHost {
	// 192.168.0.13
	public static void main(String[] args) {
		try {
			ServerSocket sc = new ServerSocket(6000);
			System.out.println("##���� ����..");
			while(true) {
				Socket s = sc.accept();
				BufferedReader br = new BufferedReader( new InputStreamReader(s.getInputStream()));
				
				System.out.println("##Ŭ���̾�Ʈ �����!");
				System.out.println("##Ŭ���̾�Ʈ �޼��� : " + br.readLine());
				br.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
