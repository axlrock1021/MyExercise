package tw.com.axlrock1021;

import javafx.scene.image.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Dialog練習
 * @author Andy
 * @version 1.0
 * @date 2019年1月21日 下午3:19:02
 */
public class DialogDemo_31 {

	public static void main(String[] args) {
		
		//對話框
		JOptionPane.showMessageDialog(null, "ok!","準備進入java世界",
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("image/歡迎光臨.jpg"));	
	}
}
