package javanew;

/**
 * Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦
を取得してください。

 * @author user
 *
 */

public class D102 {
	public static String getFileType(String path) {
		//		if(path.indexOf("xlsx")!=-1) {
		//			int s = path.indexOf("xlsx");
		//			String str = path.substring(s);
		//			System.out.println(str);
		//		}else if (path.indexOf("test")!=-1) {
		//			int s = path.indexOf("test");
		//			String str = path.substring(s);
		//			System.out.println(str);
		//		}else if (path.indexOf("docx")!=-1) {
		//			int s = path.indexOf("docx");
		//			String str = path.substring(s);
		//			System.out.println(str);
		//		}else {
		//			String str="Empty";
		//			System.out.println(str);
		//		}
		//		return path;
		//	}
		if (path.lastIndexOf(".") != -1) {
			int s = path.lastIndexOf(".");
			String str = path.substring(s);
			System.out.println(str);
		} else if (path.lastIndexOf(".") == -1) {
			System.out.println("Empty");
		}
		return path;

	}

	public static void main(String[] args) {
		//		Scanner scan = new Scanner(System.in);
		//		String str = scan.nextLine();
		//		getFileType(str);
		//		System.out.println(str);
		//		scan.close();

		System.out.println();
		System.out.println(getFileType("c://windows//a a.test"));
		System.out.println(getFileType("c://windows//aaaaa"));
		System.out.println(getFileType("c://windows//aa.bb.docx"));
		System.out.println(getFileType("c://windows//545451.24545656.ll"));

	}

}
