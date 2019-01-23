package tw.com.axlrock1021;
/**
 * 方法的練習
 * @author Andy
 * @version 1.0
 * @date 2019年1月23日 上午9:54:55
 */
public class MethodDemo_33 {
	
	//宣告一個static方法
	public static void printStr(int times, String str) {
		for (int i = 1; i <= times; i++) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		
		//宣告字串
		String str1 = "歡迎來到java世界";
		String str2 = "java好好玩";
	    String str3 = "學好一定有工作!";
		
	    //呼叫方法
		printStr(5,str3);
		MethodDemo_33.printStr(2, str2);	
	}
}
