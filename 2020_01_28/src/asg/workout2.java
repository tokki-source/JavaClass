package asg;

public class workout2 {


    public static void main(String[] args) {
    	int a=2;
    	for(int k=2; k<6; k++) {
    		System.out.println(a+"´Ü"+"\t\t"+(a+1)+"´Ü");
    		for(int i=1 ; i<10 ; i++) {
    			for(int j= a; j<a+2 ; j++) {
    				System.out.print(j+ " x "+i+" = "+ j*i +"  ");
    				}
    			System.out.println();
    		}
    		System.out.println();
			a+=2;

    		}
        } //main

}
