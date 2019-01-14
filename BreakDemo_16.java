package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 輸入個人貢獻度，如輸入負值就跳出程式
 * 利用break功能
 * @author Andy
 * @version 1.0
 * @date 2019年1月14日 下午1:58:58
 */
public class BreakDemo_16 {

	public static void main(String[] args) {
		
		int exp = 0; //貢獻值
		int sum = 0; //總和
		
		for(;;){
			System.out.print("請輸入個人貢獻值:");
			exp = new Scanner(System.in).nextInt();
				if(exp < 0){ //判斷變數為負值
					System.out.println("你貢獻負值，找死!");
					break; //中斷程式
				}
				sum = sum + exp;
		}
		System.out.println("總貢獻值為:" + sum);
	}
}
