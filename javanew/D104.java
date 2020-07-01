package javanew;

/**
 * 各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
いるメソッドを実装してください。
 * @author user
 *
 */

public class D104 {

	public static boolean nullOrEmpty(String value) {

		if (value.isEmpty()) {
			System.out.println(value + "is Empty");
		} else if (value.length() > 0) {
			System.out.println(value.length());
		} else {
			System.out.println(value + "is Null");

		}
		return false;

	}

	public static void main(String[] args) {
		nullOrEmpty("");

	}

}
