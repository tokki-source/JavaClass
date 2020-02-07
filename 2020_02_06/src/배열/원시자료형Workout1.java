package 배열;

public class 원시자료형Workout1 {
	public static void main(String[]args) {
		
		///7, 8, 9
		///4, 5, 6
		///1, 2, 3  for문으로 출력
		/*
		 * int num=7; for(int i=0 ; i<=2; i++) { for(int j=0 ; j<=2 ; j++) {
		 * System.out.print(num++ +" "); } num -=6; System.out.println(); }
		 */
	 ///배열로 출력
		int [][] nums = new int[3][];
		int num=7;
		int numsLength = nums.length;
		for(int i = 0 ; i<numsLength ; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				nums[i][j] = num;
				System.out.print(nums[i][j]+ " ");
				num++;
			}
			num -= nums[i].length;
			System.out.println("");
		}
	 
	 
	}
}
