package tw.com.axlrock1021;
/**
 * 定義變數，增加printf(格式化輸出)
 * @author Andy
 * @version 1.0
 * @date 2019年1月11日 下午8:51:37
 */
public class VarDemo_3 {

	public static void main(String[] args) {
		
		//宣告變數，並且給予初始值
		String country = "魏國"; //利用String(字串)給值
		String name = "曹操"; //利用String(字串)給值
		int hp = 100; //利用int(整數)給值
		Double atk = 90.56; //利用double(浮點數)給值
		float def = 80.5F; //利用float(浮點數)給值
		
		//利用"+"拼接字串，並列印變數資訊
		System.out.println("國家 : " + country);
		System.out.println("姓名 : " + name);
		System.out.println("人物屬性值 :");
		System.out.println("生命值 : " + hp +"\t" + "攻擊力 : " + atk + "\t" + "防禦力 : " + def);
		
		//利用printf(格式化輸出)
		System.out.printf("生命值 : %d\t" + "攻擊力 : %.2f\t防禦力 : %.2f",hp,atk,def);
		//%d(整數)、%f(浮點數).2(取小數點第二位)
	}
}
