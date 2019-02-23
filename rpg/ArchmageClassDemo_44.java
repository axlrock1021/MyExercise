package tw.com.axlrock1021.rpg;
/**
 * 法師子類別
 * @author Andy
 * @version 1.0
 * @date 2019年2月7日 下午2:35:17
 */
public class ArchmageClassDemo_44 extends HeroClassDemo_44{
	
	//屬性
	private int magicAttack;

	public void fire(){
		System.out.println(getName() + "正在放火球");
	}
	//建構子
	public ArchmageClassDemo_44(){
		setName("預設法師");
		setLevel(1);
		setMaxLife(100);
		setCurrtLife(100);
		setMagicAttack(99);
	}
	public ArchmageClassDemo_44(String name) {
		this(); //調用自己的建構子方法
		setName(name);
	}
	
	
	//方法
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
}
