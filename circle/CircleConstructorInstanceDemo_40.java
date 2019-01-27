package tw.com.axlrock1021.circle;

public class CircleConstructorInstanceDemo_40 {

	public static void main(String[] args) {
	
		//物件實例化後，利用虛擬別名去呼叫方法(預設建構子)
		CircleConstructorDemo_40 circle1 = new CircleConstructorDemo_40();
		circle1.inputRadius();
		circle1.showPerimeter();
		circle1.showArea();	
		System.out.println("---------------------------------------------------------");
		//物件實例化後，利用虛擬別名去呼叫方法(有參數建構子)
		CircleConstructorDemoV2_40 circle2 = new CircleConstructorDemoV2_40(2);
		circle2.showPerimeter();
		circle2.showArea();	
	}
}
