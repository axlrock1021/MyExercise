package tw.com.axlrock1021.role;
/**
 * OO實作練習(實例化)
 * @author Andy
 * @version 1.0
 * @date 2019年1月27日 下午12:54:25
 */
public class RoleDemoInstance_39_2 {

	public static void main(String[] args) {
		
		RoleDemo_39_1 role1 = new RoleDemo_39_1(); //角色一實例化 
		role1.name = "張飛";
		role1.job = "武官";
		role1.lv = 50;
		role1.skill();
		
		RoleDemo_39_1 role2 = new RoleDemo_39_1(); //角色二實例化 
		role1.name = "孔明";
		role1.job = "文官";
		role1.lv = 20;
		role1.skill();
		
		RoleDemo_39_1 role3 = new RoleDemo_39_1(); //角色三實例化 
		role1.name = "王小明";
		role1.job = "米蟲";
		role1.lv = 0;
		role1.skill();
	}
}
