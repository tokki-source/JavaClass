package method;
/***
 * parameter �� ���� ����
 * call - by - value : ���� ���� ȣ��
 *      = = > sum()
 *      	= = > �ߺ� , overloading : �Ű����� type�� ���� �ٸ��� ȣ��
 * call - by - reference : ������ ���� ȣ��
 */
public class B {
	/**
	 * 
	 * @return �Ű������� ���� ����
	 */
	public int sum(int num1, int num2) {
				//int num1=90, int num2=100 
		return num1 + num2 ;
	}
	/**
	 * 
	 * @return �Ű������� ���� ����
	 */
	 //call-by-value : ������(�ٸ� ��ġ)���� value�� ����־��� �� 
	 //�������� �����Ͱ� ������ ���� 
	public double sum(double num1, double num2) {
				//int num1=90, int num2=100 //3��°,4��° ���� 
		System.out.println("sum(): "+num1 +" "+num2);
		num1 *= 10;
		System.out.println("sum(): "+num1 +" "+num2);
		return num1 + num2 ;
		}
}
