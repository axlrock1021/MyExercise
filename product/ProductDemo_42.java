package tw.com.axlrock1021.product;
/**
 * 商品類別
 * @author Andy
 * @version 1.0
 * @date 2019年1月31日 上午9:51:01
 */
public class ProductDemo_42 {

	//屬性
	private String name; //商品名稱
	private double price; //商品價錢
	private String descrption; //商品描述
	private String[] services; //商品服務
	
	//建構子方法
	public ProductDemo_42(){}
	
	public ProductDemo_42(String name,String descrption){
		setName(name);
		setDescrption(descrption);
	}
	
	//方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}	
}
