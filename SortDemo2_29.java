package tw.com.axlrock1021;
/**
 * 選擇排序
 * 利用陣列、迴圈，及取隨機亂數
 * 查看當前執行程式所需時間
 * @author Andy
 * @version 1.0
 * @date 2019年1月19日 上午9:22:51
 */
public class SortDemo2_29 {

	public static void main(String[] args) {
		
		final int N = 10000;//常數
		int[] nums = new int[N];//宣告一個陣列
		
		//用for迴圈取隨機亂數
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*1000 + 1);
		}
		long startTime = System.currentTimeMillis(); //1970/1/1到當前的毫秒數
		
		//選擇排序，每次迴圈，交換i值和minIndex值
		for (int i = 0; i < nums.length; i++) {
			 int min = nums[i]; //假設第i個值是最小值
			 int minIndex = i; //最小值的索引值
				for (int j = i + 1; j < nums.length; j++) {
					if(min > nums[j]){
						min = nums[j];
						minIndex = j;
					}
				}
				//交換i值和minIndex值
				int temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
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
		System.out.println("選擇排序法共耗時:" + (endTime - startTime) + "毫秒"); 			
	}
}