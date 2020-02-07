package use;

import oop.ReportCard;

public class ReportCardUse {
	public static void main(String[] args) { //ma +ctrl space , 
											 //main method 역할 : 프로그램의 시작과 끝을 표시 like 방 스위치
		ReportCard firstStudent; //
		//int 		num
			firstStudent = new ReportCard() ; 
			// firstStudent.num =1;
			firstStudent.inputSubjectScore();
			firstStudent.output();
			
			firstStudent.setKor(90);
			firstStudent.output();

	}

}
