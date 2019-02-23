package tw.com.axlrock1021.rpg;

import sun.security.action.GetLongAction;

/**
 * 主程式
 * @author Andy
 * @version 1.0
 * @date 2019年2月4日 上午9:50:54
 */
public class MainDemo_44 {

	public static void main(String[] args) {
		
		WarriorClassDemo_44 warrior = new WarriorClassDemo_44();
		warrior.move();
		ArchmageClassDemo_44 archmage = new ArchmageClassDemo_44("魔法師");
		archmage.fire();
		System.out.println("等級 : " + archmage.getLevel());
		System.out.println("最大生命值 :" + archmage.getMaxLife());
		System.out.println("當前生命值 :" + archmage.getCurrtLife());
	}
}
