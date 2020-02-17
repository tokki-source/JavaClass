package 정리;

public class AA {

		//메소드명 모두 중복-> 오버로딩
		void m1() {  //#1
			System.out.println("Super의 m1");
		}

		void m1(int a) { //#2
			System.out.println(a);
		}		
		void m1(int a, int b) { //#3
			System.out.println(a+b);

		}
		void m1(int a, int b, int c) { //#4
			System.out.println(a+b+c);

		}
		void m1(String a) { //#5
			
		}

		public String toString(String string) {
			// TODO Auto-generated method stub
			return null;
		}

	}

