package ��¥;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2022;
		// 1. ���ǽ����� ������� ���������� ���
		//    2020���� �����Դϴ�.
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� �����Դϴ�");
		} else {
			System.out.println(year + "���� ����Դϴ�");
		}
		
		// 2. Gregorian Calander ����ؼ� ��������, ������� ����غ���
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(year) == true) {
			System.out.println(year + "���� �����Դϴ�");
		} else {
			System.out.println(year + "���� ����Դϴ�");
		}
		
	}

}
