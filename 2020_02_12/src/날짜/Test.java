package 날짜;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2022;
		// 1. 조건식으로 평년인지 윤년인지를 출력
		//    2020년은 윤년입니다.
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다");
		} else {
			System.out.println(year + "년은 평년입니다");
		}
		
		// 2. Gregorian Calander 사용해서 윤년인지, 평년인지 출력해보기
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(year) == true) {
			System.out.println(year + "년은 윤년입니다");
		} else {
			System.out.println(year + "년은 평년입니다");
		}
		
	}

}
