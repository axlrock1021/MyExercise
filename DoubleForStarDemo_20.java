package tw.com.axlrock1021;
/**
 * 利用巢狀for迴圈實作星星(三個範例)
 *  範例一     範例二    範例三
 *    *         A         *
 *   ***       BBB       * *
 *  *****     CCCCC     *   *
 * *******   DDDDDDD   *     *
 *  *****     EEEEE     *   *
 *   ***       FFF       * *
 *    *         G         *
 * @author Andy
 * @version 1.0
 * @date 2019年1月15日 上午11:46:39
 */
public class DoubleForStarDemo_20 {

	public static void main(String[] args) {
		
		//範例一
		//外行(|)、內列(-) 利用巢狀for迴圈
		for(int i = 0; i < 4 ; i++){ //外圈控制行數(|)			
			for(int j = 0; j <= 2 - i; j++) { //內圈控制列(-)
				System.out.print(" "); //內圈控制輸出符號，不要換行(println)!				
				}
			//先輸出"空格"再輸出*
			for(int j = 0; j <= 2 * i; j++){
				System.out.print("*");
			}
			System.out.println(); //外圈換行
			}
		//倒三角星星
		for(int i = 0; i < 3 ; i++){ //外圈控制行數(|)			
			for(int j = 0; j <= i; j++) { //內圈控制列(-)
				System.out.print(" "); //內圈控制輸出符號，不要換行(println)!				
				}
			//先輸出"空格"再輸出*
			for(int j = 0; j <= 4 - (2 * i); j++){
				System.out.print("*");
			}
			System.out.println(); //外圈換行
			}
		
		//範例二
		char ch = 'A'; //宣告一個變數
		//外行(|)、內列(-) 利用巢狀for迴圈				
				for(int i = 0; i < 4 ; i++){ //外圈控制行數(|)			
					for(int j = 0; j <= 2 - i; j++) { //內圈控制列(-)
						System.out.print(" "); //內圈控制輸出符號，不要換行(println)!				
						}				
					for(int j = 0; j <= 2 * i; j++){
						System.out.print((char)ch); //強制轉成char
					}
					ch++; //外圈+
					System.out.println(); //外圈換行
					}
				//倒三角星星
				for(int i = 0; i < 3 ; i++){ //外圈控制行數(|)			
					for(int j = 0; j <= i; j++) { //內圈控制列(-)
						System.out.print(" "); //內圈控制輸出符號，不要換行(println)!				
						}	
					for(int j = 0; j <= 4 - (2 * i); j++){
						System.out.print((char)ch); //強制轉成char
					}
					ch++; //外圈+
					System.out.println(); //外圈換行
					}
				
				//範例三
				//外行(|)、內列(-) 利用巢狀for迴圈
				for(int i = 0; i < 4 ; i++){ //外圈控制行數(|)			
					for(int j = 0; j <= 2 - i; j++) { //內圈控制列(-)
						System.out.print(" "); //內圈控制輸出符號，不要換行(println)!				
						}					
					for(int j = 0; j <= 2 * i; j++){
						if(j == 0 || j == 2 * i){ //取最左跟最右星星
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
					System.out.println(); //外圈換行
					}
				//倒三角星星
				for(int i = 0; i < 3 ; i++){ //外圈控制行數(|)			
					for(int j = 0; j <= i; j++) { //內圈控制列(-)
						System.out.print(" "); //內圈控制輸出符號，不要換行(println)!				
						}
					//先輸出"空格"再輸出*
					for(int j = 0; j <= 4 - (2 * i); j++){
						if(j == 0 || j == 4 - (2 * i)){ //取最左跟最右星星
							System.out.print("*");
						}else{
							System.out.print(" "); //中間就空格
						}
					}
					System.out.println(); //外圈換行
					}
		}	
	}
