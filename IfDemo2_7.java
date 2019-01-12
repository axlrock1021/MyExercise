package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用多重if，分別列印出自訂英雄的戰力值
 * @author Andy
 * @version 1.0
 * @date 2019年1月12日 下午9:38:25
 */
public class IfDemo2_7 {

	public static void main(String[] args) {
		
		String name = "";
		int power = 0; //角色的戰力值
		
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入英雄名字 : ");
		name = input.next();
		System.out.print("請輸入戰力值 : ");
		power = input.nextInt();
		
		//利用多重if來判斷角色戰力值位於哪個區間
		if (power >= 100) {
			System.out.println("無敵台幣戰士!!!");
		}else if(power >= 70 && power <= 99){
			System.out.println("VIP頂尖玩家");
		}else if(power >= 40 && power <= 69 ){
			System.out.println("正常人");
		}else if(power >= 10 && power <= 39){
			System.out.println("發育中玩家");
		}else{
			System.out.print("低能兒");
		}			
	}
}
