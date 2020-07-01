package javanew;

/**
 * 駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
てオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してくださ
い
 * @author user
 *
 */

public class Station {

	private String name;



	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "" + name + "";
	}

	public void setName(String name) {
		this.name = name;
	}

}
