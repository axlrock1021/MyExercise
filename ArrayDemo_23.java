package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用array陣列，求三位學生成績總和及平均
 * @author Andy
 * @version 1.0
 * @date 2019年1月16日 下午6:53:32
 */
public class ArrayDemo_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		//宣告一個陣列
		double[] score = new double[3];
		//宣告變數(總和、平均)
		double sum = 0;
		double avg = 0;		
		//利用for迴圈取值
		for (int i = 0; i < score.length; i++) {
			System.out.print("第" + (i+1) + "位學生成績為:");
			score[i] = input.nextDouble();			
			sum = sum + score[i]; //總和
			avg = sum / 3; //平均
		}
		System.out.printf("3位學生成績總和為:%.2f\n%d位學生成績平均為 :%.2f",sum,score.length,avg);
	}
}
