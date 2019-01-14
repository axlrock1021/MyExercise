package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 猜數字遊戲
 * 利用for&if條件判斷
 * @author Andy
 * @version 1.0
 * @date 2019年1月14日 下午3:08:54
 */
public class GuessNumberDemo_17 {

	public static void main(String[] args) {
		
		int ans = 10; //答案
		int count = 0; //用戶猜得次數
		int userAns = 0; //用戶猜的數字
		
		//利用for迴圈判斷
		for (int i = 1; i <= 5; i++) {
			System.out.println("請猜一個數字(第" + ++count + "次):");
			Scanner input = new Scanner(System.in);
			userAns = input.nextInt();
			//利用if條件判斷，分別猜中的次數
			if(userAns == ans){
				if(count == 1){
					System.out.println("一次就猜中，太神拉!!");
				}else if(count >= 2 && count <= 4){
					System.out.println("還不錯唷!");
				}else if(count == 5){
					System.out.println("第五次才中阿，運氣真是背!");
				}
				break;
			//利用if條件判斷，用戶猜的數字太大或太小
			}else if(userAns > ans){
				System.out.println("太大了");
			}else if(ans > userAns){
				System.out.println("太小了");
			}
		}
		if(userAns == ans){ 
				
		}else{
			System.out.println("五次機會皆用完，可惜啊可惜啊!");
		}
	}
}
