package tw.com.axlrock1021;
/**
 * 利用陣列、迴圈來模擬洗牌的過程(52張牌)
 * @author Andy
 * @version 1.0
 * @date 2019年1月18日 上午9:46:13
 */
public class ArrayShuffleCardsDemo_27 {

	public static void main(String[] args) {
		
		final int N = 52; //常數不可變
		int[] cards = new int[N]; //宣告一個52張牌的陣列
		String[] cardsColors = new String[]{"黑桃","梅花","方塊","菱形"}; //牌的花色
		String[] cardsValues = new String[]{"A","2","3","4","5","6","7","8",
											"9","10","J","Q","K"}; //牌面
		
		//利用for迴圈給每一張牌初始化
		for(int i = 0; i < cards.length; i++){
			cards[i] = i; //牌面的值與迴圈的值一樣，0-51之間
		}
		System.out.println("洗牌前:");
		//利用for迴圈印出52張牌(洗牌前)
				for(int i = 0; i < cards.length; i++){
					System.out.printf("%s-%s",cardsColors[cards[i] / 13],
							cardsValues[cards[i] % 13]); 
					if((i + 1) % 13 == 0){ //換行
						System.out.println();
					}else{
						System.out.print("\t"); //逗號
					}
				}			
		//利用for迴圈洗牌
		for(int i = 0; i < cards.length; i++){
			int newIndex = (int)(Math.random() * N); //0-51之間的隨機數字
			//cards[i]跟cards[newIndex]元素互換，利用temp臨時變數來處理
			int temp = cards[i]; 
			cards[i] = cards[newIndex]; 
			cards[newIndex] = temp;
		}
		System.out.println("洗牌後:");
		//利用for迴圈印出52張牌(洗牌後)
		for(int i = 0; i < cards.length; i++){
			System.out.printf("%s-%s",cardsColors[cards[i] / 13],
					cardsValues[cards[i] % 13]); 
			if((i + 1) % 13 == 0){ //換行
				System.out.println();
			}else{
				System.out.print("\t"); //逗號
			}
		}		
	}
}
