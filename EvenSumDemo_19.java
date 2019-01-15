package tw.com.axlrock1021;
/**
 * 求1-100之間的偶數和&奇數和(奇數和：2500、偶數和：2550 )
 * 利用for迴圈
 * @author Andy
 * @version 1.0
 * @date 2019年1月15日 上午8:44:35
 */
public class EvenSumDemo_19 {

	public static void main(String[] args) {
				
		int sum = 0,sum1 = 0; //總數
		
		for (int i = 1; i <= 100; i++) { //偶數和：2550 		
			if(i % 2 !=0){ 				
				continue; //跳過奇數
			}
			sum = sum + i;			
		}
		for (int i = 1; i <= 100; i+=2) { //奇數和：2500
			sum1 = sum1 + i;								
		}
		System.out.println("偶數和： " + sum + "\n" + "奇數和： " + sum1);		
	}
}
