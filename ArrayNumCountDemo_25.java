package tw.com.axlrock1021;
/**
 * 求陣列中隨機亂數中的元素的奇數和偶數個數分別為多少
 * @author Andy
 * @version 1.0
 * @date 2019年1月16日 下午6:53:32
 */
public class ArrayNumCountDemo_25 {

	public static void main(String[] args) {
		
		int count1 = 0; //奇數個數
		int count2 = 0; //偶數個數
		int[] nums = new int[10]; //宣告一個陣列
		
		//利用for迴圈判斷
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = (int)(Math.random() * 100 + 1);
			System.out.print(nums[i] + ",");
			
			//利用if條件判斷是否為奇數或偶數
			if (nums[i] % 2 == 0) {
				count2++;
			}else{
				count1++;
			}
		}
		System.out.println("\n奇數個數為:" + count1 + "\n偶數個數為:" + count2);
	}
}
