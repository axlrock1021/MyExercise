package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用do while迴圈，來選擇人物
 * @author Andy
 * @version 1.0
 * @date 2019年1月14日 上午9:55:32
 */
public class DoWhileDemo_13 {

	public static void main(String[] args) {
		
		String answer = "y"; //選擇的名字是否滿意
		String name = ""; //用戶角色名
		
		Scanner input = new Scanner(System.in);
		
		//利用do while迴圈，來選擇人物
		do{
			System.out.print("請輸入英雄名 : ");			
			name = input.next();
			System.out.print("您選擇了" + name + "這個角色名，");
			System.out.println("是否滿意(y/n)");
			answer = input.next();									
			
		}while(!(answer.equalsIgnoreCase("y"))); //忽略字母大小寫		
			System.out.println("我滿意!");
	}
}
