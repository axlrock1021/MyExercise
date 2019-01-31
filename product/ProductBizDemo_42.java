package tw.com.axlrock1021.product;

import javax.swing.JOptionPane;
/**
 * 商品管理類別
 * @author Andy
 * @version 1.0
 * @date 2019年1月31日 上午9:57:45
 */
public class ProductBizDemo_42 {

	public static void main(String[] args) {
		
		int[] counts = new int[3]; //用來保存每種商品的總數量
		double total = 0; //最後要支付的總價錢
		ProductDemo_42[] product = new ProductDemo_42[3];
		
		for (int i = 0; i < counts.length; i++) { //利用for迴圈判斷
			if(product[i] == null){
				product[i] = new ProductDemo_42(); //使用前要先分配空間
			}
			String name = JOptionPane.showInputDialog("請輸入商品名稱 :");
			product[i].setName(name);		
			//接收用戶輸入的商品單價，返回值是字串
			String strPrice = JOptionPane.showInputDialog("請輸入商品單價 :");
			//必須把字串轉型為double
			product[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("請輸入商品數量 :");
			counts[i] = Integer.parseInt(strCount);  
			
			//累加總金額
			total += product[i].getPrice() * counts[i];
		}
		System.out.println("購物結算");
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i].getName() + "\t" + product[i].getPrice());
		}
		System.out.println("商品總金額為 : " + total);
	}
}
