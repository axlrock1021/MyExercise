package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 練習continue，利用for迴圈
 * 輸入五位玩家的消費金額，如>=100就跳過，<100計數器就+1
 * @author Andy
 * @version 1.0
 * @date 2019年1月14日 下午6:08:14
 */
public class MoneyTotalDemo_18 {

	public static void main(String[] args) {
		
		int userMoney = 0; //用戶輸入金額
		int count = 0; //計數器
		
		//利用for迴圈判斷
		for (int i = 1; i <= 5 ; i++) {
			System.out.print("第" + i + "位使用者消費金額 :");
			userMoney = new Scanner(System.in).nextInt();
			//再利用if else條件判斷
			if(userMoney >= 100){ //>=100就跳過
				continue;
			}else{
				count++; //<100計數器就+1
			}
		}
		System.out.println("合計:" + count + "位消費者，消費金額沒超過$100");	
	}
}
