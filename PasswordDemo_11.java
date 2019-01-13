package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用while迴圈判斷，用戶輸入密碼(三次錯誤就跳出程式)
 * 密碼為 : 1234
 * @author Andy
 * @version 1.0
 * @date 2019年1月13日 下午3:31:35
 */
public class PasswordDemo_11 {

	public static void main(String[] args) {
		
		int password = 1234; //宣告一組密碼變數
		int i = 0; //計數器
		Scanner input = new Scanner(System.in);
		
		//利用while迴圈判斷，用戶輸入三次密碼
		while (i < 3) {
			System.out.print("請輸入密碼 :");
			password = input.nextInt();
			i++;
			//利用if條件判斷，密碼是否輸入正確
			if(!(password == 1234)){ //輸入錯誤
					System.out.println("密碼輸入錯誤，請重新輸入 : 剩 " + (3-i) + "次");
				if(i == 3){ //密碼輸入三次錯誤就跳出程式
					System.out.println("密碼三次輸入錯誤，程式已終止");
					System.exit(0);
				}
			}else{
				i = Integer.MAX_VALUE; //如不知道輸入幾次，就把i設為最大值，用來中斷迴圈
			}
		}
		System.out.println("密碼正確，成功登入!"); //輸入正確	
	}
}
