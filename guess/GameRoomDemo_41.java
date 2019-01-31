package tw.com.axlrock1021.guess;

import java.util.Scanner;
/**
 * 遊戲大廳
 * @author Andy
 * @version 1.0
 * @date 2019年1月28日 下午12:27:02
 */
public class GameRoomDemo_41 {
	
	//屬性 : 參與遊戲的玩家、房間名稱、房間密碼
	private HumanPlayerDemo_41 play1 = null; //玩家
	private ComPlayerDemo_41 play2 = null;   //電腦
	private String roomName; //房間名稱
	private String roomPass; //房間密碼
	
	//方法 : 初始化遊戲、開始遊戲、顯示選單、選擇角色、判斷輸贏、結束遊戲
	public GameRoomDemo_41(String roomName,String roomPass){ //判斷進入房間的帳號密碼
		if(!("admin".equalsIgnoreCase(roomName) && "123".equalsIgnoreCase(roomPass))){
			System.out.println("密碼錯誤，遊戲已強制中止");
			return;
		}
		this.setRoomName(roomName);
		initGame();//初始化遊戲
		statrGame();//開始遊戲
		endGame(); //結束遊戲
	}	
	public void initGame(){ //初始化遊戲
		//1.實例化遊戲玩家對象
		play1 = new HumanPlayerDemo_41();
		play2 = new ComPlayerDemo_41();
		//2.初始化其他屬性
		for (int i = 0; i < 50; i++) { //模擬動畫(利用*載入遊戲)
			System.out.print("*");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n遊戲加載完成!");
	}
	public void statrGame(){ //開始遊戲
		showMenu(); //顯示選單
		choiceRole(); //選擇角色
		gaming();
		//印出結果
	}
	//遊戲主迴圈
	private void gaming() {
		while(true){
		//雙方出拳
		System.out.println(play1.getName() + "請出拳 : ");
		play1.setFist(new Scanner(System.in).nextInt());
		int fist1 = play1.getFist();
		play2.getFist();
		int fist2 = play2.getFist();
		////判斷輸贏
		int result = judge(fist1, fist2); //調用方法判斷結果
		//如果返回值為-1就是玩家1勝利，返回0就是平手，返回1就是玩家2勝利
		if(result == -1){
			System.out.println("裁判 : " + play1.getName() + "贏囉!");
			play1.sendMessage(HumanPlayerDemo_41.MessageTypeWin);
			play2.sendMessage(ComPlayerDemo_41.MessageTypeLose);
		}else if(result == 0){
			System.out.println("裁判 : 平手唷 ");
			play1.sendMessage(HumanPlayerDemo_41.MessageTypeFist);
			play2.sendMessage(ComPlayerDemo_41.MessageTypeFist);
		}else{
			System.out.println("裁判 : " + play2.getName() + "贏囉!");
			play2.sendMessage(ComPlayerDemo_41.MessageTypeWin);
			play1.sendMessage(HumanPlayerDemo_41.MessageTypeLose);			
		}
		System.out.print("是否繼續遊戲 :");
		String answer = new Scanner(System.in).next();
		if(!("y".equalsIgnoreCase(answer))){
			break;
		}
	   }
	}
	//顯示選單
	public void showMenu(){
		System.out.println("歡迎進入" + roomName + "遊戲房間");
		System.out.println("出拳規則 : 1.剪刀  2.石頭  3.布");
	}
	//選擇角色
	public void choiceRole(){
		System.out.println("對方角色 : 1.大雄  2.阿福  3.胖虎  4.靜香");
		System.out.print("請選擇角色 : ");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = new String[]{"大雄","阿福","胖虎","靜香",};
		play2.setName(nameArray[choice - 1]);
		play1.setName("小叮噹");
		System.out.println(play1.getName() + " VS " + play2.getName());
	} 
	//判斷輸贏
	public int judge(int fist1,int fist2){
		if(fist1 == fist2){ //平局
			return 0; 
		}		
		if(fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2){
			//玩家1的分數+1，玩家2的分數-1
			play1.setScore(play1.getScore() + 1);
			play2.setScore(play2.getScore() - 1);
			return -1; //玩家1勝利 
		}
		//玩家2勝利
		play1.setScore(play1.getScore() - 1);
		play2.setScore(play2.getScore() + 1);
		return 1; 		
	}
	//結束遊戲
	public void endGame(){
		System.out.println(play1.getName() + "\t" + play2.getName() );
		System.out.println(play1.getScore() + "\t" + play2.getScore());
		System.out.println("遊戲已結束，下次再玩");
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
}
