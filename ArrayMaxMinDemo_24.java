package tw.com.axlrock1021;
/**
 * 求陣列中隨機亂數中的元素的最大值和最小值
 * @author Andy
 * @version 1.0
 * @date 2019年1月17日 上午8:27:30
 */
public class ArrayMaxMinDemo_24 {

	public static void main(String[] args) {
		
		int[] nums = new int[10]; //宣告一個陣列
		int max = Integer.MIN_VALUE; //當最大值為最小值
		int min = Integer.MAX_VALUE; //當最小值為最大值
		
		//利用for迴圈判斷
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = (int)(Math.random() * 100 + 1); //亂數取1-100
			System.out.print(nums[i] + ",");
			//利用if條件判斷
			if (nums[i] > max) { //當陣列中的某個元素>max
				max = nums[i];
			}
			if(nums[i] < min){ //當陣列中的某個元素<min
				min = nums[i];
			}
		}
		System.out.println("\n陣列中的元素最大值為:" + max);
		System.out.println("陣列中的元素最大小值為:" + min);
	}
}
