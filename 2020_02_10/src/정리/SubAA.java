package ����;


	
	class SubAA extends AA{ //subA��� Ŭ������ �� ���� Ŭ������ ������ �ִ°�?  
							// --> ��� 7��(���� 5, sub2)
		@Override
		void m1() { // #1 ,6 ��� �ϰ� ������ #1���� ���� ������ �ְ� ��(����� XX)
			System.out.println("SubAA�� m1");

		}
		// @Override overload
		void m1(double e) { //#6
			
		} //@Overload
		void m1(int[] a) { //#7\
		 int sum = 0;
			for(int data : a ) {
				sum += data;
			}
			for(int data : a ) {
				System.out.println(sum);
			}	
		}
		
		void out() {
			m1(); // this.m1();
			super.m1();// ���� Ŭ������ ������ �ִ� m1
		
		}

	
	
}
	
		
		
	

