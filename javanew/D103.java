package javanew;
/**
 * Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
 * @author user
 *
 */

public class D103 {
	public static void main(String[]args) {
		 String str = " abced12345あいうえお１２３４５";
		 byte[] bytes= str.getBytes();
		 int s = bytes.length;
		 System.out.println(s);
		 int a = str.length();
		 System.out.println(a);
	}
}
