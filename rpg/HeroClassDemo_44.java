package tw.com.axlrock1021.rpg;
/**
 * Hero父類別
 * @author Andy
 * @version 1.0
 * @date 2019年2月3日 上午10:37:56
 */
public class HeroClassDemo_44 {

	//屬性
	private String name;
	private int level;
	private int maxLife;
	private int currtLife;
	//建構子
	public HeroClassDemo_44() {
		System.out.println("父類別建構子");
	}
	public HeroClassDemo_44(String name, int level, int maxLife, int currtLife) {
		super();
		this.name = name;
		this.level = level;
		this.maxLife = maxLife;
		this.currtLife = currtLife;
	}
	//方法
	public void move(){  
		System.out.println("我是父類別的移動方法!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrtLife() {
		return currtLife;
	}
	public void setCurrtLife(int currtLife) {
		this.currtLife = currtLife;
	}
}
