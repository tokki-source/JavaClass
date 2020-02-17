package use;

import java.awt.List;

import 정리.AA2;

public class AA2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA2 ref = new AA2();
		ref.m1();
		System.out.println("/////////////////");
		ref.m1(2, 3, 4, 5, 67, 134, 1);
		System.out.println("/////////////////");
		int[] sss = { 2, 4, 6, 2 };
		ref.m1(sss);
		/**
		 * abstract, interface 가 가지고 있는 메소드를 오버라이딩 하기 위해 씀
		 */
		List refff = new ArrayList();
		refff.add("adfsdfsd");
	}

}
