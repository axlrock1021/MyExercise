package tw.com.axlrock1021;

import java.util.Scanner;
import java.util.Stack;
/**
 * 將用戶輸出的類型轉換成相對應的需求
 * @author Andy
 * @version 1.0
 * @date 2019年1月23日 下午4:58:47
 */
public class MethodWeekDayDemo_35 {

	public static void main(String[] args) {

		System.out.print("請輸入今天星期幾(1-7)之間:");
		int dayOfWeek = new Scanner(System.in).nextInt(); //請用戶輸入

		//呼叫判斷方法
		isRight(dayOfWeek);
		//呼叫方法，陣列index從0開始，所以必須-1
		printChinese(dayOfWeek - 1);
		printJapanese(dayOfWeek - 1);
		printEnglish(dayOfWeek - 1);

	}
	//定義方法
	//利用方法來判斷，如果用戶輸入錯誤
		public static boolean isRight(int dayOfWeek) {

			if (dayOfWeek > 7 || dayOfWeek < 1) {
				System.out.println("輸入錯誤，請輸入(1-7)之間的數字");
				return false;
			}
			return true;
		}
	//中文
	public static void printChinese(int dayOfWeek) {
		String[] weekDay = new String[] { "星期一", "星期二", "星期三", "星期四", "星期五","星期六", "星期日" };
		System.out.println("中文為:" + weekDay[dayOfWeek]);
	}
	//日文
	public static void printJapanese(int dayOfWeek) {
		String[] weekDay = new String[] { "月曜日", "火曜日", "水曜日", "木曜日", "金曜日","土曜日", "日曜日" };
		System.out.println("日文為:" + weekDay[dayOfWeek]);
	}
	//英文
	public static void printEnglish(int dayOfWeek) {
		String[] weekDay = new String[] { "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println("英文為:" + weekDay[dayOfWeek]);
	}
}
