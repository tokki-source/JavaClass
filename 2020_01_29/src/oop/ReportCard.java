package oop;
//�߻� ����
import java.util.Scanner;

/**   
 *  
///////////////////////// 
	���� ���ϴ� �޼ҵ�
	
	setter getter constructor
 */
public class ReportCard {
	// member field, ����, �Ӽ�
	// member method, ó���� 
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	private char grade ='F';
	private int rank;
	//member method , ó����
	//������(constructor) method  --- Ŭ������ �޸� ��  ������ �� �Ϻη� ȣ������ �ʾƵ� ȣ��Ǵ� ��  , �����Լ�
				// Ŭ������ �ν��Ͻ��� ���� �� �ؾ��� �ϵ��� �������� ex. �ƱⰡ ȥ�� ���� ���� ���Ҷ� ~~1 ~2~~6~ �ؾ���
				// �⺻�����δ� �˾Ƽ� �� ó����, �ϳ��� �ν��Ͻ��� �ѹ��� �����
				// <-> �Ҹ��� distructor ; �޸� ���� Ȯ���� �͵��� ����, �ڹٿ����� �������� �ʾƵ� �� ���ڹٰ���ӽ��� ���༭
	public ReportCard() {
		
	}
	// �Ϲ� �޼��� : �ν��Ͻ��� ���ؼ� ȣ��Ǵ� �޼��� 
	public void output() { //void method : �޸� �Ҵ�x, �߻�
		System.out.printf("%6d %14s %4d %4d %6d %6d %8.2f %3c %4d\n" 
				,num, name, kor, eng, math, total, average, grade, rank) ;
	}
/**
 * �Է��ϴ� �޼ҵ� public ������ �� x 
 * method�� : inputSubjectScore
 */
	public void inputSubjectScore( ) {
		//����? 70 
		//����? 80
		//����? 90
		Scanner scanner = new Scanner(System.in) ;  //������ �޼ҵ� , �Ϲ� �޼���� �ҹ���
		System.out.print("����? ");
		kor=scanner.nextInt() ;

		System.out.print("����? ");
		kor=scanner.nextInt() ;

		System.out.print("����? ");
		kor=scanner.nextInt() ;
		
		calc() ; //
		
	}
	private void calc() {
		total = kor + eng + math ;
		average = total /3 ;
		switch ((int)average/10) {
		case 10 : grade ='A';
			break ;
		case 9 : grade ='B';
			break ;
		case 8 : grade ='C';
			break ;
		case 7 : grade ='D';
			break ;
		case 6 : grade ='F';
			break ;
		

		/*
		 * default : break;
		 */
		}
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calc();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public double getAverage() {
		return average;
	}
	public char getGrade() {
		return grade;
	}
	public int getRank() {
		return rank;
	}
}
