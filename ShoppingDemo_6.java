package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 百貨公司打折季，如果購物總價大於10萬就打5折，否則打9折
 * 利用if else判斷
 * 最後，計算總金額是多少?
 * @author Andy
 * @version 1.0
 * @date 2019年1月12日 下午5:13:44
 */
public class ShoppingDemo_6 {

	public static void main(String[] args) {
				
		int count = 0; //商品數量
		double total = 0.0; //總價
		double price1,price2,price3; //各商品單價
		
		System.out.println("歡迎光臨! 請選擇您所要購買的商品及數量");
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.香奈兒包包 ($50000)");
		System.out.print("數量 : ");	
		count = input.nextInt();
		price1 = 50000 * count; //商品1的總價 = 50000 * 商品數量
		
		System.out.println("2.鬼洗金鑽長褲 ($16880)");
		System.out.print("數量 : ");
		count = input.nextInt();
		price2 = 16880 * count; //商品2總價 = 16880 * 商品數量
		
		System.out.println("3.神祕福袋 ($2880)");
		System.out.print("數量 : ");
		count = input.nextInt();
		price3 = 2880 * count; //商品3總價 = 2880 * 商品數量
		
		total = price1 + price2 + price3; //全部商品總價
		System.out.printf("原價 : %.2f元\n",total); //印出商品總價
		
		//利用if else判斷，總價大於10萬就打5折，否則打9折
		if (total > 100000) {
			total = total * 0.5; //打5折	
			System.out.printf("打5折後 :%.2f元\n",total);
		} else {
			total = total * 0.9; //打9折	
			System.out.printf("打9折後 :%.2f元\n",total);
		}
	}
}
