package ����;


class  SubAA2 extends AA2{  //subA��� Ŭ������ �� ���� Ŭ������ ������ �ִ°�?  
	// --> ��� 7��(���� 5, sub2)
/*
* @Override void m1() {//#1, 6��� �ϰ� ������ #1���� ���� ������ �ְ� �ȴ�
* System.out.println("SubAA�� m1()"); }
*/
//@Override overload
void m1(double a) {//#6

}

/*
* void m1(int[] a) {//#7 int sum=0; for( int data : a ) { sum+=data; } for( int
* data : a ) { System.out.print(data+" ,"); }
* 
* System.out.println(sum); }
*/
void out() {
m1();// this.m1();
super.m1();// ���� Ŭ������ ������ �ִ� m1
}
}
	
		
		
	

