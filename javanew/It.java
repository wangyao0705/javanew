package javanew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class It {
	public static void main(String... args) {
		 List<String> datas = new ArrayList<>();
		 datas.add("u1");
		 datas.add("u3");
		 datas.add("u2");
		 Iterator<String> it = datas.iterator();
		 while (it.hasNext()) {
		 System.out.println(it.next());
		 }
		}


}
