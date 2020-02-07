package 배열;
///7, 8, 9
///5, 6
///1, 2, 3, 4  
public class 원시자료형Workout2 {
	public static void main(String[]args) {		
		int num=7;
		
		int [][] nums = new int[3][];
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
