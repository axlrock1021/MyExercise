package tw.com.axlrock1021;

import java.util.Scanner;
import javafx.scene.transform.Scale;
/**
 * 利用Scanner API，讓用戶自行輸入數字，來計算圓面積
 * 圓面積公式 : π * radius * radius
 * @author Andy
 * @version 1.0
 * @date 2019年1月12日 下午3:58:13
 */
public class CalcCircleArea_4 {

	public static void main(String[] args) {
		
		System.out.print("請輸入圓半徑 : ");
		Scanner input = new Scanner(System.in); //請用戶自行輸入一個任意數字
		
		double radius = input.nextDouble();  //根據用戶輸入的數字，賦值給radius變數
		double area = 3.14 * radius * radius; //計算圓面積公式
		
		System.out.printf("圓面積為 ： %.2f",area);
	}
}
