package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用switch case&if else條件
 * 實現遊戲選單的跳轉
 * @author Andy
 * @version 1.0
 * @date 2019年1月13日 上午10:22:18
 */
public class SwitchCaseDemo_8 {

	public static void main(String[] args) {
		
		int choice = 0; //遊戲選單編號
		String name = ""; //新增好友名稱
		
		Scanner input = new Scanner(System.in);
		System.out.println("即將進入虛擬世界!!! \n請選擇 : ");
		System.out.println("1.進入遊戲 2.離開遊戲");
		choice = input.nextInt();
		
		//利用switch case&if else條件，實現遊戲選單的跳轉
		if(choice == 1) { //進入遊戲
			System.out.println("1.新建遊戲 2.儲存點繼續 3.好友名單 4.商城 5.環境設定");
			choice = input.nextInt();
			switch(choice) {			
			case 1: //新建遊戲
				System.out.println("開始遊戲");
				break;
			case 2: //儲存點繼續
				System.out.println("1.第一次儲存點 2.第二次儲存點 3.最近儲存點");
				choice = input.nextInt();
				switch(choice) {			
					case 1: //第一次儲存點
					case 2:	//第二次儲存點		 		
						System.out.println("開始遊戲");
						break;
					case 3: //最近儲存點
						System.out.println("從最近一次儲存點開始遊戲");
						break;
				}
				break;
			case 3: //好友名單
				System.out.println("1.新增好友 2.刪除好友 3.黑名單");
				choice = input.nextInt();
				switch(choice) {			
				case 1: //新增好友
					System.out.print("請輸入好友名稱 :");
					name = input.next();
					System.out.println(name + "已加入好友");
					break;
				case 2: //刪除好友			 		
					System.out.print("請刪除好友名稱 :");
					name = input.next();
					System.out.println(name + "已刪除好友");
					break;
				case 3: //黑名單
					System.out.print("請輸入玩家至黑名單 :");
					name = input.next();
					System.out.println(name + "已新稱至黑名單");
					break;
			}
				break;
			case 4: //商城
				System.out.println("1.武器店 2.防具店 3.道具店 4.儲值");
				choice = input.nextInt();
				switch(choice) {			
				case 1: //武器店
					System.out.println("歡迎來到武器店");			
					break;
				case 2: //防具店
					System.out.println("歡迎來到防具店店");			
					break;
				case 3: //道具店
					System.out.println("歡迎來到道具店");			
					break;
				case 4: //儲值
					System.out.println("請選擇儲值金額 :");
					System.out.print("1.$50 2.$500 3.$5000 4.$9999");
					choice = input.nextInt();
					switch(choice) {			
					case 1: //$50
						System.out.println("您儲值了$50");			
						break;
					case 2: //$500
						System.out.println("您儲值了$500");			
						break;
					case 3: //$5000
						System.out.println("您儲值了$5000");			
						break;
					case 4: //$9999
						System.out.println("您儲值了$9999 恭喜成為VIP大戶");			
						break;
					}
					break;
				}
				break;
			case 5: //環境設定
				System.out.println("1.設定語言 2.調整聲音");
				choice = input.nextInt();
				switch(choice) {			
				case 1: //設定語言
					System.out.println("1.中文 2.英文 3.日文");	
					choice = input.nextInt();
					switch(choice) {			
					case 1: //中文
						System.out.println("遊戲語言改為中文");			
						break;
					case 2: //英文
						System.out.println("遊戲語言改為英文");			
						break;
					case 3: //日文
						System.out.println("遊戲語言改為日文");			
						break;
					}
					break;
				case 2: //調整聲音		
					System.out.println("1.開啟音效 2.關閉音效");
					choice = input.nextInt();
					if(choice == 1){ //開啟音效
						System.out.println("開啟音效");
					}else{ //關閉音效
						System.out.println("關閉音效");
					}					
				}
				break;					
			default:
				System.out.println("輸入不正確的數字，請重新輸入!");
				break;
			}			
		}else if(choice == 2){ //離開遊戲
			System.out.println("您已離開遊戲");
			System.exit(0); //關閉程式
		}else{
			System.out.println("輸入不正確的數字，請重新輸入!");
		}				
	}
}
