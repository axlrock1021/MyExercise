package tw.com.axlrock1021;
/**
 * 廣場上有200多人在排隊，如果三人一組多一人，四人一組多兩人，五人一組多三人，一共有多少人?
 * 利用for迴圈練習
 * @author Andy
 * @version 1.0
 * @date 2019年1月16日 上午8:24:03
 */
public class ForDemo_21 {

	public static void main(String[] args) {

		//200多人就是(200-299)
		//利用for迴圈
		for (int i = 200; i <= 299; i++) {
			//再利用if條件判斷
			if(i % 3 == 1 && i % 4 == 2 && i % 5 == 3){
			System.out.println("總共有" + i + "人");
			}
		}
	}
}
