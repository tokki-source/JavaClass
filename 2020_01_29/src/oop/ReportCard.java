package oop;
//추상성 예시
import java.util.Scanner;

/**   
 *  
///////////////////////// 
	석차 구하는 메소드
	
	setter getter constructor
 */
public class ReportCard {
	// member field, 변수, 속성
	// member method, 처리자 
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	private char grade ='F';
	private int rank;
	//member method , 처리자
	//생성자(constructor) method  --- 클래스가 메모리 상에  생성될 때 일부러 호출하지 않아도 호출되는 것  , 응애함수
				// 클래스에 인스턴스가 잡힐 때 해야할 일들을 정리해줌 ex. 아기가 혼자 숨을 쉬지 못할때 ~~1 ~2~~6~ 해야함
				// 기본적으로는 알아서 잘 처리됨, 하나의 인스턴스는 한번만 실행됨
				// <-> 소멸자 distructor ; 메모리 공간 확보된 것들을 정리, 자바에서는 구현하지 않아도 됨 ∵자바가상머신이 해줘서
	public ReportCard() {
		
	}
	// 일반 메서드 : 인스턴스에 의해서 호출되는 메서드 
	public void output() { //void method : 메모리 할당x, 추상성
		System.out.printf("%6d %14s %4d %4d %6d %6d %8.2f %3c %4d\n" 
				,num, name, kor, eng, math, total, average, grade, rank) ;
	}
/**
 * 입력하는 메소드 public 리턴할 것 x 
 * method명 : inputSubjectScore
 */
	public void inputSubjectScore( ) {
		//국어? 70 
		//영어? 80
		//수학? 90
		Scanner scanner = new Scanner(System.in) ;  //생성자 메소드 , 일반 메서드는 소문자
		System.out.print("국어? ");
		kor=scanner.nextInt() ;

		System.out.print("영어? ");
		kor=scanner.nextInt() ;

		System.out.print("수학? ");
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
