package tw.com.axlrock1021.circle;

import java.util.Scanner;

public class CircleConstructorDemoV2_40 {

		//屬性
		public double radius; //半徑
		public double perimeter; //周長
		public double area; //面積
		
		//預設建構子
		public CircleConstructorDemoV2_40(){
			inputRadius();
		}
		
		//有參數建構子
		public CircleConstructorDemoV2_40(double radius1){
			if(radius1 > 0){
				radius = radius1;
			}else{
				inputRadius();
			}
		}
		
		//方法
		private void inputRadius(){ //權限改為private，不讓外部存取
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
