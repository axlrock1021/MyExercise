package tw.com.axlrock1021;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * 培養美女小遊戲(java版)
 * @author Andy
 * @version 1.0
 * @date 2019年1月21日 上午10:47:52
 */
public class AppMainChoiceBeautyDemo_32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // 請用戶輸入選項

		// 定義變數相關資訊
		// 預留的美女共三個
		String[] newName = { "雞排妹", "于文文", "艾薇兒" };
		int newNameCount = newName.length;
		// 美女總數,预留三個空間
		String[] Name = { "周子瑜", "王心凌", "林明禎", "李毓芬", "安心亞", "", "", "" };
		// 美女的初始數量為五個
		int NameCount = 5;
		// 關係表
		String[] levelNames = { "陌生人", "朋友", "情人", "老婆", "女皇" };
		// 對應關係表
		int[] level = new int[8];
		// 對應的好感度
		int[] loves = new int[8];
		// 遊戲時間為10天
		int gameDays = 1;
		// 好感度初始值為100，利用for迴圈判斷
		for (int i = 0; i < NameCount; i++) {
			loves[i] = 100;
		}

		// 進入遊戲設定
		String title1 = "歡迎來到幻想世界 ----------- by Andy"; // 設定標題
		String message1 = "嘿嘿！ 野狼大大 您來啦!"; // 設定訊息
		// 圖形化介面
		JOptionPane.showMessageDialog(null, message1, title1, 1, new ImageIcon(
				"image/歡迎光臨.jpg"));
		// 利用while迴圈實作大框架
		while (gameDays <= 10) // 遊戲天數最大為10天
		{
			String strMenu = "1.認識新美女\n" + "2.寵幸既有美女\n" + "3.吵架分手\n"
					+ "4.尋找美女\n" + "野狼大大請選擇 :\n"; // 菜單選項
			String message2 = ""; // 設定訊息

			// 圖形化介面
			Object objectResult;
			objectResult = JOptionPane.showInputDialog(null, strMenu, "遊戲進行到第"
					+ gameDays + "天", 0, new ImageIcon(""), new String[] { "1",
					"2", "3", "4" }, 1);
			// 利用if條件判斷，按下取消，就跳出遊戲
			if (objectResult == null)
				System.exit(0);
			// 字串轉成整數
			int choice = Integer.parseInt(objectResult.toString());
			// 利用switch判斷(1-4之間)選項
			switch (choice) {
			case 1:
				if (NameCount == Name.length) {
					// 圖形化介面
					JOptionPane.showMessageDialog(null, "野狼大大! 美女已太多了，您養得起嗎?");
					System.exit(0); // 超過總數就跳出遊戲
				}
				// 圖形化介面
				objectResult = JOptionPane.showInputDialog(null, "認識新美女",
						"邂逅!", 0, new ImageIcon("image/邂逅.jpg"), newName, null);
				if (objectResult == null) {
					break;
				}
				// 圖形化介面
				JOptionPane.showMessageDialog(null, objectResult.toString(),
						"選中美女", 0,
						new ImageIcon("image/" + objectResult.toString()
								+ ".jpg"));

				Name[NameCount] = objectResult.toString();
				loves[NameCount] = 100;
				// 利用for迴圈判斷，如選中當前美女，其他美女好感度全-10
				for (int i = 0; i < NameCount; i++)
					loves[i] -= 10;
				NameCount++;
				break;
			case 2:
				// 圖形化介面
				objectResult = JOptionPane.showInputDialog(null, "請選擇",
						"寵幸既有美女", 0, new ImageIcon("image/寵幸.jpg"), Name, null);
				if (objectResult == null)
					break;
				// 圖形化介面
				JOptionPane.showMessageDialog(null, objectResult.toString(),
						"野狼大大! 您選了她!", 0,
						new ImageIcon("image/" + objectResult.toString()
								+ ".jpg"));

				String name = objectResult.toString();
				int searchIndex = -1;
				for (int i = 0; i < NameCount; i++) {
					if (name.compareTo(Name[i]) == 0)
						searchIndex = i;
				}
				// 選中的美女，好感度+20
				loves[searchIndex] += 20;
				// 關係滿級，就不能再升級
				if (level[searchIndex] + 1 == levelNames.length - 1) {
					message2 = Name[searchIndex] + "她已經是您的女皇啦!";
					JOptionPane.showMessageDialog(null, message2);
					loves[searchIndex] += 10; // 不升級，但好感度還是會增加
					break;
				}
				level[searchIndex]++;
				for (int i = 0; i < NameCount; i++) {
					if (i == searchIndex)
						continue;
					loves[i] -= 10;
				}
				message2 = "寵幸" + Name[searchIndex] + ",好感度增加10，你們的關係升為"
						+ levelNames[level[searchIndex]];
				// 圖形化介面
				JOptionPane.showMessageDialog(null, message2);
				break;
			case 3:
				// 圖形化介面
				objectResult = JOptionPane.showInputDialog(null, "請選擇", "吵架分手",
						0, new ImageIcon("image/吵架分手.jpg"), Name, null);
				if (objectResult == null)
					break;

				name = objectResult.toString();
				searchIndex = -1;
				for (int i = 0; i < NameCount; i++) {
					if (name.compareTo(Name[i]) == 0)
						searchIndex = i;
				}

				for (int i = searchIndex; i < NameCount - 1; i++) {
					Name[i] = Name[i + 1];
					loves[i] = loves[i + 1];
					level[i] = level[i + 1];
				}
				NameCount--;

				for (int i = 0; i < NameCount; i++) {
					loves[i] += 10;
				}
				break;
			case 4:
				// 圖形化介面
				objectResult = JOptionPane.showInputDialog(null, "请選擇", "尋找美女",
						0, new ImageIcon("image/尋找美女.jpg"), Name, null);

				if (objectResult == null)
					break;
				// 圖形化介面
				JOptionPane.showMessageDialog(null, objectResult.toString(),
						"找到她啦!", 0,
						new ImageIcon("image/" + objectResult.toString()
								+ ".jpg"));
				name = objectResult.toString();
				searchIndex = -1;
				for (int i = 0; i < NameCount; i++) {
					if (name.compareTo(Name[i]) == 0) {
						searchIndex = i;
						loves[i] += 10;
						level[i] = level[i] >= 4 ? 4 : level[i] + 1;
					} else {
						loves[i] -= 10;
					}
					break;
				}

				String value = "美女們的的情况如下：\n";
				for (int i = 0; i < NameCount; i++) {
					value += String.format("%s %s %d\n", Name[i],
							levelNames[level[i]], loves[i]);
				}
				// 圖形化介面
				JOptionPane.showMessageDialog(null, value, "每日好感度結算", 0,
						new ImageIcon("image/眾多美女.jpg"));
				gameDays++;
			}
		}
	}
}
