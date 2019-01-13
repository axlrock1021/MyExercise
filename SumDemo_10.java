package tw.com.axlrock1021;
/**
 * 利用while迴圈，計算1-100的累加和
 * @author Andy
 * @version 1.0
 * @date 2019年1月13日 下午2:08:03
 */
public class SumDemo_10 {

	public static void main(String[] args) {
		
		int sum = 0; //累加總和
		int i = 1; //從1開始
		
		//利用while迴圈，計算1-100的累加和
		while(i <= 100) {
			sum = sum + i;
			i++;	
		}
		System.out.println(sum);
	}
}
