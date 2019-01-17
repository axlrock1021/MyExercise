package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 求陣列中隨機亂數中元素的索引值
 * @author Andy
 * @version 1.0
 * @date 2019年1月17日 上午9:54:18
 */
public class ArraySearchDemo_26 {

	public static void main(String[] args) {

		int index = -1; //沒找到元素
		int[] nums = new int[5]; //宣告陣列

		//利用for迴圈判斷
		for(int i = 0; i < nums.length; i++){
			nums[i] = (int) (Math.random() * 100 + 1);
			System.out.print(nums[i] + ",");
		}		
		//讓用戶輸入自行搜尋
		System.out.print("\n請輸入一個數字:");
		int search = new Scanner(System.in).nextInt();

		//利用for迴圈判斷
		for(int i = 0; i < nums.length; i++){
			//利用if條件判斷元素是否有在陣列裡
			if(search == nums[i]){
				index = i;// 找到了
				break;
			}
		}
		
		//利用if條件判斷
		if(index == -1){ 
			System.out.println("沒有找到!");
		}else{
			System.out.println("找到了!索引值為[" + index + "]");
		}
	}
}
