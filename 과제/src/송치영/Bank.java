package ��ġ��;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�̸�? ");
			String name=sc.nextLine();
			
			System.out.print("���? ");
			int year=sc.nextInt();
			
			System.out.println("���Աݾ�? ");
			int monthly=sc.nextInt();
			
			int principal = monthly * Util.MONTH_YEAR;
			int total=(int)(principal*Saving.getRate());
			
			//System.out.println("����==> �� %6d �� x %d ���� = %d ��\n",month,year,month*year);
			System.out.printf("����==> �� %6d �� x %d ���� = %6d ��\n"
					,monthly,year,monthly*year* Util.MONTH_YEAR);
			System.out.printf("����� �ݾ�==> ���� : %d => %d + %d *%.2f = %d��\n"
					,(int)(Saving.getRate()*100),principal, principal, Saving.getRate(),total);
			
			System.out.println("�����Ͻðڽ��ϱ�?");
			char ans=sc.next().charAt(0);
			
			if(ans =='Y') {
				System.out.println("\n���»���\n");
				Saving people = new Saving(name,year,monthly);
				people.output();
				sc.nextLine();
				
				} else if(ans=='N') {
					System.out.println("�����մϴ�");
					break;
				} else {
					System.out.println("�߸��� �Է�");
					break;
			}
				
			}

		}

	}



