package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用for迴圈取得三位玩家的戰力總和
 * @author Andy
 * @version 1.0
 * @date 2019年1月14日 下午12:05:16
 */
public class ForAvgDemo_15 {

	public static void main(String[] args) {
		
		double avg = 0; //平均
		int sum = 0; //總數
		
		Scanner input = new Scanner(System.in);
		
		//利用for迴圈取得三位玩家的戰力總和
		for (int i = 1; i <= 3; i++) {
			System.out.print("第" + i + "位玩家戰力為 :");
			int power = input.nextInt();
			sum = sum + power;
		}
		avg = sum / 3.0;
		System.out.printf("三位玩家戰力平均為:%.2f",avg);
	}
}
