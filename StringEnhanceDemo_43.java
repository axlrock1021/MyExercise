package tw.com.axlrock1021;
/**
 * 增強版字串練習
 * 比較哪個效能比較快
 * @author Andy
 * @version 1.0
 * @date 2019年2月2日 下午1:19:51
 */
public class StringEnhanceDemo_43 {

	public static void main(String[] args) {
		
		final int N = 100000; //常數
		String str = "*";
		
		long startTime = System.currentTimeMillis(); //開始時間	
		for (int i = 0; i < N; i++) { //利用for迴圈運算
			str += "*";
		}
		long endtTime = System.currentTimeMillis(); //結束時間		
		System.out.println("1.一般字串運算共花了 : " + (endtTime - startTime) + "毫秒");
		
		//利用StringBuffer((執行緒安全)
		startTime = System.currentTimeMillis(); //開始時間	
		StringBuffer stringBuffer = new StringBuffer("*"); //宣告StringBuffer
		for (int i = 0; i < N; i++) { //利用for迴圈運算
			stringBuffer.append("*"); //利用append()方法拼接字串
		}
		endtTime = System.currentTimeMillis(); //結束時間		
		System.out.println("2.StringBuffer運算共花了 : " + (endtTime - startTime) + "毫秒");
		
		
		//利用StringBuilder(非執行緒安全，效能最快)
		startTime = System.currentTimeMillis(); //開始時間	
		StringBuilder stringBuilder = new StringBuilder("*"); //宣告StringBuilder
		for (int i = 0; i < N; i++) { //利用for迴圈運算
		stringBuilder.append("*"); //利用append()方法拼接字串
		}
		endtTime = System.currentTimeMillis(); //結束時間		
		System.out.println("3.StringBuilder運算共花了 : " + (endtTime - startTime) + "毫秒");
		
		
		
		
		
		
		
	}
}
