package javanew;
/**
 * 以下仕様のフォーマティング指⽰コードを作成してくだい。
1. 浮動⼩数点数
2. ⻑さは5桁数
3. 精度は⼩数点後2位
 * @author user
 *
 */

public class D105 {
	public static void main(String[] args) {
		double num = 1.0;
	System.out.println(String.format("%f",num));
	float a = 1.11111111f;
	System.out.println(String.format("%05d",5));
	System.out.println (String.format("%.2f",num));
	}




}
