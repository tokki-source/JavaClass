package method;
/***
 * parameter 에 대한 예제
 * call - by - value : 값에 의한 호출
 *      = = > sum()
 *      	= = > 중복 , overloading : 매개변수 type에 따라 다르게 호출
 * call - by - reference : 참조에 의한 호출
 */
public class B {
	/**
	 * 
	 * @return 매개변수의 합을 리턴
	 */
	public int sum(int num1, int num2) {
				//int num1=90, int num2=100 
		return num1 + num2 ;
	}
	/**
	 * 
	 * @return 매개변수의 합을 리턴
	 */
	 //call-by-value : 원격지(다른 위치)에서 value를 집어넣었을 때 
	 //원격지의 데이터가 변하지 않음 
	public double sum(double num1, double num2) {
				//int num1=90, int num2=100 //3번째,4번째 변수 
		System.out.println("sum(): "+num1 +" "+num2);
		num1 *= 10;
		System.out.println("sum(): "+num1 +" "+num2);
		return num1 + num2 ;
		}
}
