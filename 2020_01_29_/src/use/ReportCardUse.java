package use;

import oop.ReportCard;

public class ReportCardUse {
	public static void main(String[] args) { //ma +ctrl space , 
											 //main method ���� : ���α׷��� ���۰� ���� ǥ�� like �� ����ġ
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
