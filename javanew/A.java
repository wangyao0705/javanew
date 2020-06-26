package javanew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class A {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("name");
		list.add("age");
		list.add("brithday");
		if(!list.isEmpty()) {
			System.out.println(list.isEmpty());
		}
		Map<String, String> map = new HashMap<>();
		map.put("key1"," name");
		if (!map.isEmpty()) {
			System.out.println(map.isEmpty());
		}
		for(Map.Entry<String, String>entry : map.entrySet()) {
			System.out.println("key=" + entry.getKey() + ": value=" + entry.getValue());
		}

	}

}
