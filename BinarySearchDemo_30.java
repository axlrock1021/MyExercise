package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 二分搜尋演算法
 * 首先利用要搜尋的元素(key)，與陣列的中間元素做比較
 * 1.如果key小於中間元素，只需在陣列的前一半元素中繼續搜尋
 * 2.如果key大於中間元素，只需在陣列的後一半元素中繼續搜尋
 * 3.如果key等於中間元素，搜尋成功
 * @author Andy
 * @version 1.0
 * @date 2019年1月19日 上午10:54:25
 */
public class BinarySearchDemo_30 {

	public static void main(String[] args) {
		
		int[] nums = new int[]{3,5,9,11,13}; //宣告陣列，已排序
		int low = 0; //最小值
		int high = nums.length -1; //最大值
		
		Scanner input = new Scanner(System.in); //請使用者輸入
		System.out.print("請輸入一個要查詢的數字: ");
		int search = input.nextInt();
		
		//不知道搜尋次數，所以選擇while迴圈
		while (high >= low) {
			int mid = (low + high) / 2; //中間值
				//利用if條件判斷
				if(search < nums[mid]){
					high = mid - 1;
				}else if(search > nums[mid]){
					low = mid + 1;
				}else {
					System.out.println("搜尋到了! 索引值為: " + mid);
					break;
				}	
		}
	}
}
