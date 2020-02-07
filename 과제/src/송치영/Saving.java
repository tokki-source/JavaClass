package ��ġ��;
public class Saving {

	private String name;// �̸�
	private int year;// �Ⱓ
	private int month;// ���Աݾ�
	private int principal;// ����
	private int total;// ����� �ݾ�
	private int interest;// ���ھ�
	private static double rate = 0.02;// ����
	//�����ݸ� : final 
	/*
	 * private int num = 100;// ���¹�ȣ private int numb = 1;// ���¹�ȣ
	 */	
	private String accountNumStr; //�� ���¹�ȣ
	private static int count ; // ���� ���¸� ����� ���� �� �� 
	private final String branchCode="100"; // ���� �ڵ� Branch Code
	
	private int totalMoney;//�Ѿ�
	public Saving() {
		
	}

	public Saving(String name, int year, int month) {
		this.name = name;
		this.year = year;
		this.month = month;
		
		accountNumStr= branchCode + String.format("%03d", ++count); 
		totalNum();
	}
	public void totalNum() {
		this.principal=year*month;
		this.interest=(int)(principal*rate);
		this.total=principal+interest;
		//this.numb=numb++;
	}

	public void output() {
		System.out.printf("���¹�ȣ\t�̸�\t���Աݾ�\t�Ⱓ\t����\t�Ѿ�\t���ھ�\t�����ȯ�޾�\n");
		System.out.printf("%s\t%3s\t%6d\t%6d\t%6d\t%6d\t%6d\t%10d\n", 
			 accountNumStr,name,month,year,(int)(rate*100),principal,(int)(principal*rate),total);
		
		/*
		 * System.out.printf("%d-%03d\t%3s\t%6d\t%6d\t%6d\t%6d\t%6d\t%10d\n",
		 * num,numb,name,month,year,(int)(rate*100),principal,(int)(principal*rate),
		 * total);
		 */
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Saving.rate = rate; //this �� �� ���
	}


	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
}
