package tw.com.axlrock1021.circle;

import java.util.Scanner;
/**
 * 利用建構子方式
 * 計算圓的周長及面積
 * @author Andy
 * @version 1.0
 * @date 2019年1月27日 下午3:56:22
 */
public class CircleConstructorDemo_40 {

	//屬性
	public double radius; //半徑
	public double perimeter; //周長
	public double area; //面積
	
	
	//方法
	public void inputRadius(){ //輸入半徑
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入半徑 : ");
		radius = input.nextDouble();
		input.close();
	}
	
	public void showPerimeter(){ 
		if(radius <= 0){ //如果用戶沒輸入半徑，請重新輸入
			inputRadius();
		}
		perimeter = 2 * Math.PI * radius;  //公式
		System.out.println("周長為 : " + perimeter);
	}
	
	public void showArea(){
		if(radius <= 0){ //如果用戶沒輸入半徑，請重新輸入
			inputRadius();
		}
		area = Math.PI * Math.pow(radius, 2); //公式
		System.out.println("面積為 : " + area);
	}
}
