package tw.com.axlrock1021.guess;
/**
 * 電腦玩家
 * @author Andy
 * @version 1.0
 * @date 2019年1月28日 上午9:59:27
 */
public class ComPlayerDemo_41 {
	//靜態變數，出拳的訊息
	public static final int MessageTypeFist = 1; //出拳
	public static final int MessageTypeWin = 2;  //贏的訊息
	public static final int MessageTypeLose = 3; //輸的訊息
	
	//屬性 : 姓名、分數、所出的拳、角色出拳的台詞、角色贏跟輸時的台詞
	private String name; //姓名
	private int score; //分數
	private int fist; //所出的拳
	//角色出拳的台詞
	private String[] fistWords = new String[]{"我要出拳囉!","你贏的了我嗎?",
											  "ㄚㄚㄚㄚ~~~~","我可是沒輸過"};
	//角色贏時的台詞
	private String[] winWords = new String[]{"你是贏不了我的","叫我猜拳王",
											 "贏是正常的","呵呵呵"}; 
	//角色輸時的台詞
	private String[] loseWords = new String[]{"怎麼可能阿","你作弊喔",
			 								  "NONONONONO","我才不信"}; 

	//方法
	public void sendMessage(int msgType){ //根據傳入的訊息類型，隨機印出相對應的訊息
		//產生一個隨機0-3之間的數字
		int index = ((int)(Math.random() * 1000 )) % 4;
		//要印出的訊息
		String message = null;
		//利用switch判斷猜拳動作所說的台詞
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}	
	//設定&取得名稱及分數、出拳
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getFist() {
		//電腦出拳就是1-3之間的隨機數
		fist = (int)(Math.random() * 3 + 1);
		return fist;
	}
}
