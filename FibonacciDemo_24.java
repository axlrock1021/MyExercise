package tw.com.axlrock1021;
/**
 * Fibonacci(斐波那契數列)
 * 0、1、1、2、3、5、8、13、21、34、55、89、144
 * 利用for迴圈及陣列練習，印出數列中所有的值，以及，總數和平均
 * @author Andy
 * @version 1.0
 * @date 2019年1月16日 下午9:33:30
 */
public class FibonacciDemo_24 {

	public static void main(String[] args) {
	
		int sum = 0; //總和
		double avg = 0.0; //平均
		int[] nums = new int[13]; //宣告陣列
		//Fibonacci公式，前兩個元素為初始值，從第三個元素開始，是前兩個元素的和		
		nums[0] = 0; //第一個元素
		nums[1] = 1; //第二個元素
		//利用for迴圈判斷
		for (int i = 2; i < nums.length; i++) { //從第三個元素開始			
			nums[i] = nums[i - 1] + nums[i - 2]; 
			System.out.print(nums[i] + ",");
			
			sum = sum + nums[i]; //總和
			avg = sum / nums.length; //平均
		}
		System.out.println("\n總和為:" + sum + ",平均為:" + avg);
	}
}
