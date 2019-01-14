package tw.com.axlrock1021;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;
/**
 * 利用while迴圈判斷，實現三國武將對打遊戲
 * 載入音樂檔，增加樂趣
 * @author Andy
 * @version 1.0
 * @date 2019年1月13日 下午8:40:47
 */
public class ThreeKingdomsOfFighterDemo_12 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
						
		//播放音樂API，匯入相關類別，處理Exception		
		File sound1 = new File("sounds/start.wav");
		AudioClip sound_choose = Applet.newAudioClip(sound1.toURL()); 
		sound_choose.play(); //播放音樂
				
		//1.先讓用戶選名字，電腦預設為戰神呂布
		Scanner input = new Scanner(System.in);
		System.out.print("歡迎來到三國世界，請輸入英雄名 : ");
		String userName = input.next();
		String pcName = "戰神呂布";
		System.out.println(userName + " VS " + pcName);
		System.out.println("---------------------------------------");
		//2.初始化雙方的數值(hp、attack)
		int userHp = 100,pcHp = 100 ;
		int userAttack = 0,pcAttack = 0;
		//3.利用while迴圈模擬對戰過程
		while (userHp > 0 && pcHp >= 0) {
			//產生雙方隨機攻擊力，random(0.0-1.0之間不包含1)
			userAttack = (int)(Math.random()*50);
			pcAttack = (int)(Math.random()*50);
			//玩家先行攻擊
			pcHp = pcHp - userAttack; //玩家攻擊，電腦扣血			
			System.out.println(userName + "打出一擊，" + pcName + "HP -" + userAttack + "，當前血量剩 : " + pcHp);
			//判斷傷害區隔
			if(userAttack >= 0 && userAttack <= 25){
				System.out.println("普通攻擊!");
			}else if(userAttack >= 26 && userAttack <= 45){
				System.out.println("擊中要害!!!!");
			}
			sound_choose.stop();
			sound1 = new File("sounds/slash1.wav"); //戰鬥音效一
			sound_choose = Applet.newAudioClip(sound1.toURL()); 
			sound_choose.play(); //播放音樂
			Thread.sleep(2000); //延遲兩秒
			
			sound_choose.stop();
			userHp = userHp - pcAttack; //電腦攻擊，玩家扣血
			System.out.println(pcName + "打出一擊，" + userName + "HP -" + pcAttack + "，當前血量剩 : " + userHp);
			//判斷傷害區隔
			if(pcAttack >= 0 && pcAttack <= 25){ 
				System.out.println("普通攻擊!");
			}else if(pcAttack >= 26 && pcAttack <= 45){
				System.out.println("擊中要害!!!!");
			}
			sound1 = new File("sounds/slash2.wav"); //戰鬥音效二
			sound_choose = Applet.newAudioClip(sound1.toURL()); 
			sound_choose.play(); //播放音樂
			Thread.sleep(2000); //延遲一秒
		}
		System.out.println("---------------------------------------");
		//4.印出最後結果
		if (userHp >= 0) { //判斷玩家或電腦輸贏
			System.out.println(userName + "(玩家) KO! " + pcName);			
		} else if(pcHp >= 0){
			System.out.println(pcName + " KO! " + userName + "(玩家)");			
		}
		System.out.println("目前雙方剩於血量如下");
		System.out.println(userName + "\t 剩餘血量為 :" + userHp);
		System.out.println(pcName + "\t 剩餘血量為 :" + pcHp);
	}
}
