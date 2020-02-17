package ³­¼ö;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1;i<100; i++) { System.out.println(Math.random()+""); }
		 */
		/*
		 * for(int i=1;i<100; i++) { System.out.println((int)(Math.random()*10) +1); }
		 */
		System.out.println("/////////////////");
		System.out.println(Math.round(5.6));
		System.out.println(Math.round(5.4));
		
		System.out.println(Math.rint(5.6));
		System.out.println(Math.rint(5.4));
		
		System.out.println(Math.ceil(5.6));
		System.out.println(Math.ceil(5.4));
		
		System.out.println(Math.floor(5.9999));
		System.out.println(Math.floor(5.4));
		System.out.println("//////////////////");


		Random random = new Random();
		for(int i=1;i<10; i++) {
			System.out.println(random.nextInt(10));
		}
	}
}
