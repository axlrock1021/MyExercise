package tw.com.axlrock1021;
/**
 * 冒泡排序
 * 1.一共會比較陣列元素個數-1
 * 2.每一輪比較的次數，會比上一輪少1
 * 3.如果前面一個陣列大於/小於後面的數字，就互換
 * 利用陣列、迴圈，及取隨機亂數
 * 查看當前執行程式所需時間
 * @author Andy
 * @version 1.0
 * @date 2019年1月18日 下午5:11:07
 */
public class SortDemo_28 {

	public static void main(String[] args) {
		
		final int N = 10000;//常數
		int[] nums = new int[N];//宣告一個陣列
		
		//用for迴圈取隨機亂數
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*1000 + 1);
		}
		long startTime = System.currentTimeMillis(); //1970/1/1到當前的毫秒數
		//利用for迴圈判斷幾輪
		for (int i = 0; i < nums.length - 1; i++) {			
			//利用for迴圈判斷幾次
			for (int j = 0; j < nums.length - i - 1; j++) {
				//利用if條件判斷元素是否互換
				if (nums[j] < nums[j + 1]) { //<降冪   >升冪
					int temp = nums[j]; //臨時變數
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		long endTime = System.currentTimeMillis(); //結束的毫秒		
		System.out.println("排序後:");
		//利用for迴圈輸出
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if((i + 1) % 20 == 0){ //每20列就換行
				System.out.println();
			}else{
				System.out.print(", ");
			}
		}
		System.out.println();
		//開始-結束共花多少毫秒(1000毫秒為1秒)
		System.out.println("冒泡排序法共耗時:" + (endTime - startTime) + "毫秒"); 			
	}
}
