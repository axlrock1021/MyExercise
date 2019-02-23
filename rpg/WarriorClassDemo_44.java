package tw.com.axlrock1021.rpg;
/**
 * 戰士子類別
 * @author Andy
 * @version 1.0
 * @date 2019年2月3日 上午10:45:35
 */
public class WarriorClassDemo_44 extends HeroClassDemo_44 {

	//屬性
	private int physicalAttack;

	//建構子
	public WarriorClassDemo_44() {
		super(); //默認會調用父類別的建構子
		System.out.println("子類別建構子");
	}
	public WarriorClassDemo_44(String name, int physicalAttack) {
		setName(name);
		setPhysicalAttack(physicalAttack);
	}
	//方法
	@Override //覆寫父類別的方法
	public void move() {
		System.out.println("戰士移動方法:用腿!");
	}
	
	public int getPhysicalAttack() {
		return physicalAttack;
	}
	public void setPhysicalAttack(int physicalAttack) {
		this.physicalAttack = physicalAttack;
	} 
}
