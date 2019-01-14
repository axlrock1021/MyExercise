package tw.com.axlrock1021;

import java.util.Scanner;
/**
 * 利用do while判斷來實作簡單的計算機
 * 加、減、乘、除、取餘數
 * @author Andy
 * @version 1.0
 * @date 2019年1月14日 上午11:11:05
 */
public class CalculatorDemo_14 {

	public static void main(String[] args) {
		
		double num1,num2,result; //宣告兩個運算數及結果
		String op = ""; //宣告一個運算符號
		String answer = "y"; //是否繼續 
		
		Scanner input = new Scanner(System.in);
		
		//利用do while判斷
		do{
			System.out.print("請輸入兩個任意數字 : ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.print("請輸入一個運算符號(+ - * / %) : ");
			op = input.next();
			
			//利用switch case來判斷運算功能
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2 == 0){ //後面的除數不得為0
					System.out.println("除數不得為0");
					result = 0;
				}else{
					result = num1 / num2;
				}
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("未知的運算符號");
				result = 0;
				break;
			}	
			//印出結果
			System.out.printf("運算結果為:%.2f %s %.2f = %.2f \n",num1,op,num2,result);
			System.out.println("是否繼續(y/n)");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("y"));
	}
}
