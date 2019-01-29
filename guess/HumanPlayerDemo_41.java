package tw.com.axlrock1021.guess;
/**
 * 人類玩家
 * @author Andy
 * @version 1.0
 * @date 2019年1月28日 上午9:59:27
 */
public class HumanPlayerDemo_41 {
	//靜態變數，出拳的訊息
	public static final int MessageTypeFist = 1; //出拳
	public static final int MessageTypeWin = 2;  //贏的訊息
	public static final int MessageTypeLose = 3; //輸的訊息
	
	//屬性 : 姓名、分數、所出的拳、角色出拳的台詞、角色贏跟輸時的台詞
	private String name; //姓名
	private int score; //分數
	private int fist; //所出的拳
	//角色出拳的台詞
	private String[] fistWords = new String[]{"我要出拳囉","不要被我嚇到",
											  "登登登登！登登登~","來囉~~"};
	//角色贏時的台詞
	private String[] winWords = new String[]{"就說我會贏吧","怕了吧",
											 "嘻嘻哈哈","請教我猜拳小王子"}; 
	//角色輸時的台詞
	private String[] loseWords = new String[]{"不公平拉","哭哭.....",
			 								  "恨啊!!","等等...再來一次"};

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
		return fist;
	}
	public void setFist(int fist) {
		this.fist = fist;
	}	
}
