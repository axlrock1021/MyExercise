package tw.com.axlrock1021;

import java.util.concurrent.TimeUnit;
/**
 * 利用方法來達成遊戲中的世界喊話功能
 * 參數:喊話者、世界頻道、發言內容、發言次數、發言時間間隔
 * @author Andy
 * @version 1.0
 * @date 2019年1月24日 下午6:35:15
 */
public class SendMassageDemo_36 {

	public static void main(String[] args) {
		
		//呼叫sendMessage方法
		sendMessage("Andy:","[世界頻道]","組隊刷王副本-3 +++",10);
	}
	//定義方法
	/**
	 * @param name     //喊話者
	 * @param channel  //世界頻道
	 * @param message  //發言內容
	 * @param count    //發言次數
	 */
	public static void sendMessage(String name,String channel,String message,int count){
		//利用字串拼接
		String value = String.format("%s %s %s", name,channel,message);
		//利用for迴圈判斷
		for(int i = 0; i < count; i++) {
			System.out.println(value); //印出字串的值
			//Thread必須處理Exception
			try {
				Thread.sleep(2000); //每次間隔兩秒
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}	
}
