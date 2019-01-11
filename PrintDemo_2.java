package tw.com.axlrock1021;
/**
 * 練習分行輸出，使用print()並結合"\t"(空格)、"\n"(換行)
 * @author Andy
 * @version 1.0
 * @date 2019年1月11日 下午6:44:47
 */
public class PrintDemo_2 {

	public static void main(String[] args) {
		
		System.out.print("英雄名字 :"); //不換行
		System.out.println(" 戰爭之影・赫克林");
		System.out.println("所在地 : 闇影島"); 
		System.out.println("屬性值\n如下 :"); //利用\n，之後的字串再換行
		System.out.println("生命：580\t\t(+90 每級)"); //利用\t增加空格
		System.out.println("生命回復：7\t(+0.75 每級)");
		System.out.println("魔力：277.2\t(+40 每級)");
		System.out.println("魔力回復：6.5\t(+0.6 每級)");
		System.out.println("物理攻擊：66\t(+3.2 每級)");
		System.out.println("攻擊距離：175");
		System.out.println("物理防禦：36\t(+4 每級)");
		System.out.println("魔法防禦：32.1\t(+1.25 每級)");
		System.out.println("移動速度：345");	
	}
}
