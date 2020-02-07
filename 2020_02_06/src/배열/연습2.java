package 배열;

public class 연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s =7;
		int []datas[] =new int[3][3];
		
		System.out.println("n///");

		for(int r=s;r>0;r-=3) {
			System.out.println(r);
			for(int c=0;c<3;c++) {
			System.out.print(r+c);
			}
		}
/////////////////////////////////////////
		System.out.println("n///");
		s=7;
		for(int r=0; r<3 ; r++) {
			System.out.println();
		s-=3;
		}
	
		
		

		
	}

}
