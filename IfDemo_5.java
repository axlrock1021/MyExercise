package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 電腦硬碟代碼一般採用大寫(A-Z)
 * 利用if else來判斷用戶輸入代碼是否正確
 * @author Andy
 * @version 1.0
 * @date 2019年1月12日 下午4:41:18
 */
public class IfDemo_5 {

	public static void main(String[] args) {
		
		System.out.print("請輸入要查詢的硬碟代碼 :");
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0); //取用戶第一個輸入的代碼

		//利用if else判斷(A-Z字元)
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("輸入正確，您所要查詢的硬碟代碼為 :" + ch + "槽");
		} else {
			System.out.println("輸入錯誤代碼");
		}		
	}
}
