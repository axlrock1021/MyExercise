package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用switch case判斷所選之月份，閏年另外再用if條件判斷
 * 如果是閏年，2月份為29天
 * 範例 : 1980、1984、1988、1992、1996、2000、200、2008、2012、2016、2020
 * 閏年公式 : isleapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0
 * @author Andy
 * @version 1.0
 * @date 2019年1月13日 下午12:37:49
 */
public class CalendarDemo_9 {

	public static void main(String[] args) {
		
		int year = 0,month = 0,day = 0; //宣告變數 年、月、日
		
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入年份 :");
		year = input.nextInt();
		System.out.print("請輸入月份 :");
		month = input.nextInt();
		
		//利用switch case判斷所選之月份
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("輸入錯誤，請輸入(1-12)月份");
			System.exit(0);
			break;
		}
		
		//利用if條件判斷，如果輸入的月份是閏年，月份天數+1
		boolean isleapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		if(isleapyear == true && month == 2){ //另外加個條件，只有2月份天數+1
			day++; //月份天數+1			
		}
		System.out.println(year + "年" + month + "月" + day +"天");
	}
}
