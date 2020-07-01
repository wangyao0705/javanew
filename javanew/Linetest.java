package javanew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
てオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してくださ
い
 * @author user
 *
 */

public class Linetest {

	public static void main(String[] args) {
		Line line = new Line();
		Map<String, List<Station>> lines = new HashMap<>();
		List<Station> stations = new ArrayList<>();

		line.setName("山手線");
		String[] str = new String[] { "池袋", "新宿", "秋葉原" };

		for (int i = 0; i < str.length; i++) {
			Station station = new Station();
			station.setName(str[i]);
			//			System.out.println(station);
			stations.add(station);

		}
		//		System.out.println(stations);
		lines.put(line.getName(), stations);
		System.out.println(lines);

		//		foreach
		for (Map.Entry<String, List<Station>> entry : lines.entrySet()) {

			for (Station string : entry.getValue()) {
				System.out.println(string.getName().equals("新橋"));
			}

		}
	}
}
