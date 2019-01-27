package tw.com.axlrock1021.role;
/**
 * OO實作練習
 * @author Andy
 * @version 1.0
 * @date 2019年1月27日 下午12:47:09
 */
public class RoleDemo_39_1 {
	
	//屬性
	String name; //名稱
	String job; //職業
	int lv; //等級
	
	//方法
	public void skill(){
		if(name.equals("張飛")){
			System.out.println(name + "職業為:" + job + ",等級:" + lv + "\n大絕:獅吼功!!!");
		}else if(name.equals("孔明")){
			System.out.println(name + "職業為:" + job + ",等級:" + lv + "\n大絕:五雷轟頂!!!");
		}else{
			System.out.println("無此英雄");
		}
	}
}
