package javanew;

public class D121 {
	public static void main(String[] args) {
		int[] a = new int[] { 5 };
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}
