package tw.com.axlrock1021;
/**
 * 求1-500之間，不含數字4的自然數總共是幾個?
 * 利用for迴圈練習
 * @author Andy
 * @version 1.0
 * @date 2019年1月16日 上午8:24:03
 */
public class ForDemo2_22 {

	public static void main(String[] args) {

		int count = 0; //計數器
		
		//利用for迴圈
		for (int i = 1; i <= 500; i++) {
			int a = i % 10; //取個位數
			int b = i / 10 % 10; //取十位數
			int c = i /100; //取百位數
			//利用if條件判斷
			if(a==4 || b==4 || c==4){
				continue;
			}
			count++;
		}
		System.out.println("1-500之間，不含數字4的自然數總共:" + count);
	}
}
