package tw.com.axlrock1021;
/**
 * varargs(可變參數)練習
 * @author Andy
 * @version 1.0
 * @date 2019年1月25日 上午11:39:53
 */
public class VarargsDemo_37 {

	public static void main(String[] args) {
		
		//呼叫方法
		varargsTest(0); //第二個參數沒設不會出錯
	}
	//定義方法
	public static void varargsTest(int a,String...name){
		System.out.println("第一個參數為:" + a);
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}	
}
